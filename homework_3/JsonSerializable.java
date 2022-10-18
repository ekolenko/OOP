package homework_3;

/**
 * JsonSerializable
 */
public interface JsonSerializable <T>{

    String toJsonString();    
    T fromJsonString(String s);
    
}
