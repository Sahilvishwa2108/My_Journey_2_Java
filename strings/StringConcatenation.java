package strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1="pwjava";
        String s2=s1.concat("skill");
        
        String s3=new String("pwjava");
        s3=s3.concat("skill");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
