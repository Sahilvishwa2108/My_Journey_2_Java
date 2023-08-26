package strings;

public class ReversingString1 {
    public static void main(String[] args) {
        String original="pwjava";
        String reversed="";
        int n=original.length();
        for(int i=n-1;i>=0;i--){
            reversed=reversed+original.charAt(i);
        }
        System.out.println(reversed);
    }
}
