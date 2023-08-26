package strings;
public class Strings{
    public static void main(String[] args) {
        /* immutable strings */
        String str="hello";
        System.out.println(str);
        str.concat("world");
        System.out.println(str);
        
        
        /* mutable strings */
        StringBuilder str1=new StringBuilder("Hello");
        System.out.println(str1);
        str1.append("world");
        System.out.println(str1);
        
    }
}