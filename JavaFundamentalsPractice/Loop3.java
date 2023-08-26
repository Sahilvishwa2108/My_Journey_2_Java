import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        while(num!=0){
            System.out.print(num%10);
            num=num/10;
            if(num<=0){
                break;
            }
        }
    }
}
