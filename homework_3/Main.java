package homework_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException { 

        var file = new FileReader("homework_3/file.json");

        char[] buf = new char[256];
            
        int c;
        while((c = file.read(buf))>0){
                 
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
            } 
        
        file.close();
        
        String s = String.copyValueOf(buf);

        var pigList = new ArrayList<Pig>();
        
        for (String d : JsonFormatter.getArray(s)) {
            
            pigList.add(new Pig(d));

        }    
        
        for (Pig pig : pigList) {

            System.out.println(pig);
            
        }
    }
}
