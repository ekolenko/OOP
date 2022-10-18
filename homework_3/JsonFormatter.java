package homework_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;

public abstract class JsonFormatter {
    
    static String makeBlock(String s) {
        return String.format("{%n%s%n}", s);
    }

    static String makeArray(String[] s) {

        var str = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            str.append(s[i]);
            if (i != s.length - 1)
                str.append(", ");
        }
        
        return String.format("[ %s ]", str.toString());
    }

    static <T> String makeField(String fieldName, T value) {
        
        String valueToStr = ( value instanceof String) ? String.format("\"%s\"",value) : value.toString();
        return  String.format("\"%s\" : %s", fieldName, valueToStr);

    }

    static String getStringField(String s, String fieldName) {

        String regexp = String.format("\"%s\".+[\"].+[\"][\s\n]*[,}]",fieldName);
        
        String str = getField(s, regexp);

        int lastChar = str.length() - 1;

        if (str.charAt(0) == '"' && str.charAt(lastChar) == '"') {
            
            return str.substring(1, lastChar);
        }
        else
            return null;
        
    }

    static float getFloatField(String s, String fieldName) {

        String regexp = String.format("\"%s\"[^\"]+[\s\n]*[,}]",fieldName);
        
        String str = getField(s, regexp);

        float value = 0;

        try {
            value = Float.parseFloat(str);
        } catch (Exception e) {
            return 0;
        }
    
        return value;
        
    }

    static String getField(String s, String regexp) {

              
        Pattern pattern = Pattern.compile(regexp);
        
        var matcher = pattern.matcher(s);

        String field = null;

        if (matcher.find()) {

           field = s.substring(matcher.start(),matcher.end()-1);    
        }

        String str = field.split(":")[1].trim();
        
        return str;

    }

    static String[] getArray(String s) {

        var strArrayList = new ArrayList<String>();

        var stck = new LinkedList<Character>();

        char[] buf = s.toCharArray();
        int index = 0;

        for (int i = 0; i < buf.length; i++) {
           
            switch (buf[i]) {
                case '[': stck.addLast((Character)buf[i]);
                          break;
                case '{': stck.addLast((Character)buf[i]);
                          break;
                case ']': stck.removeLast();
                            if ((stck.size() == 0)) {
                                strArrayList.add(String.copyValueOf(buf, index + 1, i - 1 - index));
                                index = i;
                  }
                          break;
                case '}': stck.removeLast();
                          break;
                case ',': {

                    if ((stck.size() == 1) && (stck.getLast() == (Character)'[')) {
                       strArrayList.add(String.copyValueOf(buf, index + 1, i - 1 - index));
                       index = i;
                     }
                }  

            }

        }

        String[] strArr = new String[strArrayList.size()];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArrayList.get(i);
        }

        return strArr;
    }
}
