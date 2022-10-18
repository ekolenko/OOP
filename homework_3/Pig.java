package homework_3;

public class Pig implements JsonSerializable<Pig> {
    
    private String name;
    private float weight;    

    public Pig(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Pig(String fileName) {

        this.fromJsonString(fileName);
    }

    public Pig() {
        
    }
    public String getName() {
        return this.name;
    }

    public float getWeight() {
        return this.weight;
    }
    
    @Override
    public String toJsonString() {
        
        var str = new StringBuilder();
        str.append(JsonFormatter.makeField("name", this.name));        
        str.append(",\n");
        str.append(JsonFormatter.makeField("weight", this.weight));
        

        return JsonFormatter.makeBlock(str.toString());
    }

    @Override
    public Pig fromJsonString(String s) {
        
        this.name = JsonFormatter.getStringField(s, "name");
        this.weight = JsonFormatter.getFloatField(s, "weight");
        

        return this;
    }

    @Override
    public String toString() {
        
        return String.format("Привет, я свинья! Меня зовут %s. Я вешу %.1f килограмм!", this.name, this.weight);
    }
}
