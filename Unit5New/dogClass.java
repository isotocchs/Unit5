
public class dogClass {

    private int age;
    private String name;
    private int weight;
    private static int something;

    public dogClass(int a, String b, int c, int some){
        age = a;
        name = b;
        weight = c;
        something = some;
    }

    public int getAge(){
        return age;
    };

    public static int getSomething(){
        // something = a+b;
        return something;
    }
    
}
