import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] arg)
    {
        System.out.println("enter the value of n-");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=1;k<=n;k++)
                {
                    if(k==1 || k==n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
