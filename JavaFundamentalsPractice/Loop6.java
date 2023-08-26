import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number-");
        int num=s.nextInt();
        System.out.println("enter the power-");
        int powr=s.nextInt();
        int reslt=1;
        for(int i=1;i<=powr;i++){
            reslt=reslt*num;
        }
        System.out.println("a raise to b is-");        
        System.out.println(reslt);        
    }
}
