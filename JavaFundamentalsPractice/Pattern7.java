import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the order-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
