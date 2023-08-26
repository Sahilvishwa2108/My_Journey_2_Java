import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        System.out.println("Enter the order-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
