import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        int i=0;
        while(num!=0){
            num/=10;
            i++;
        }
        System.out.print("no. of digits are-");
        System.out.println(i);
    }
}
