package strings;

public class String2 {
    public static void main(String[] args) {
        //in string constant pool in heap area
        String s1="hello";
        String s2="hello";

        //outside string constant pool but in heap area
        String s3=new String("hello");
        String s4=new String("hello");

        //comparison
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
    }
}
