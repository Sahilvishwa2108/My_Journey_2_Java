import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        System.out.println("Enter the order-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1){
                    System.out.print(i);
                }
                else{
                    if(i==n){
                        System.out.print(n);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            for(int l=(i-1);l>=1;l--){
                if(l==1){
                    System.out.print(i);
                }
                else if(i==n){
                    System.out.print(n);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
