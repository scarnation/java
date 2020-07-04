public class builder {
    public static void main(String[] main){
        //inefficient code
        String info = "";
        info += "my name";
        info += " ";
        info += "is john i";
        info += " am a german";

        System.out.println(info);
        // efficient code
        StringBuilder j = new StringBuilder();
        j.append("my name");
        j.append(" ade i am ");
        j.append("a boy");
        System.out.println(j.toString());

        StringBuilder k = new StringBuilder();
        k.append("my name ")
                .append("is killicon")
                .append(" i am a bro");
        // i can divide the methods of the builder class by using a .
        System.out.println(k.toString());
        //formating
        System.out.println("here is rhe gap.\tsee the gap.\nso wadup");









    }
}
