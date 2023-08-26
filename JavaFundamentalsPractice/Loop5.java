import java.util.Scanner;
public class Loop5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        for(int i=1; i<=n ;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is-");
        System.out.println(fact);
    }
}
