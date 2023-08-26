package strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="shop";
        String str2="hops";

        str1.replace(" ", "");
        str2.replace(" ", "");

        char []arr1=str1.toCharArray();
        char []arr2=str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
}
