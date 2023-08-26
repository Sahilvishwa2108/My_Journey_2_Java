import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter the rows-");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.println("Enter the columns-");
        int n=s.nextInt();
        for(int i=1;i<=m;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    if(j%2!=0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("2");
                    }
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j%2!=0){
                        System.out.print("2");
                    }
                    else{
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}
