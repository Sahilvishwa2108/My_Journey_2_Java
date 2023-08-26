public class Pattern6 {
    public static void main(String[] args) {
        
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(i-1);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*(n-i)+1);k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
