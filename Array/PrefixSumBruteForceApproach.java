import java.util.*;
import java.io.*;
class PrefixSumBruteForceAproach{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int m=sc.nextInt();
        System.out.println("Enter no. of column:");
        int n=sc.nextInt();

        int arr[][]=new int[m][n];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.println("Enter the value of r1 coordinates:");
        r1=sc.nextInt();
        System.out.println("Enter the value of c1 coordinates:");
        c1=sc.nextInt();
        System.out.println("Enter the value of r2 coordinates:");
        r2=sc.nextInt();
        System.out.println("Enter the value of c2 coordinates:");
        c2=sc.nextInt();
        
        //function calling
        int result=findSumMatrix(arr,r1,c1,r2,c2);
        System.out.println("Sum of elements of given rectangle is"+result);
    }
    public static int findSumMatrix(int[][]arr,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=r1;j<=c2;j++){
                sum+=arr[i][j];
            }

        }
        return sum;
    }
}