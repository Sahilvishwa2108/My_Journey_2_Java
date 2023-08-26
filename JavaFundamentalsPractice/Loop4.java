import java.util.Scanner;
public class Loop4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int i=1; 
        while(i<=n){
            
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
