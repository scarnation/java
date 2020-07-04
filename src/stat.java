class Thing{
    public final static String Status = "Living";

    public String name;
    public static String description;

    public static int count = 0;

    public int id;
    public Thing(){
        id = count;
        count++;
    }
    public void showName(){
        System.out.println("S/N " + id + " status " + Status + " description " + description + " of name " + name );
    }
}
public class stat {
    public static void main(String[] args){
        Thing.description= "Human";
        System.out.println("first condition" + Thing.count);
        Thing Thing1 = new Thing();
        Thing Thing2 = new Thing();
        Thing1.name = "oscar";
        Thing2.name = "Bob";
        Thing1.showName();
        Thing2.showName();
        System.out.println(("condition after creating Thing objects is " + Thing.count));
    }
}
