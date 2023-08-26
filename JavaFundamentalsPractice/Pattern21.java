public class Pattern21 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=n-1;j++){
                if(j==0 || j==n-1 || i==j || i+j==n-1 || j>=1 && j<=i && i+j<=n-1 || j<=n-1 && i<=j && i+j>=n-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
