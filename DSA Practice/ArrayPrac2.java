import java.util.Scanner;
public class ArrayPrac2 {
    public static void main(String[] args) {
        int m,n,posNum=0,negNum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter m:");
        m=scan.nextInt();
        System.out.println("enter n:");
        n=scan.nextInt();
        int [][]arr=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the value of arr["+i+"]["+j+"]");
                arr[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>=0){
                    posNum++;
                }
                else if(arr[i][j]<0){
                    negNum++;
                }
            }
            System.out.println();
        }
        System.out.println("positive numbers:"+ posNum);
        System.out.println("negative numbers:"+ negNum);

    }
}
