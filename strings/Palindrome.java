package strings;

public class Palindrome {
    public static void main(String[] args) {
       String str1="mam";
       String str2="";
       for(int i=str1.length()-1;i>=0;i--){
        str2=str2+str1.charAt(i);
       }
       if(str2.equals(str1)){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not a palindrome");
       }
    }
}
