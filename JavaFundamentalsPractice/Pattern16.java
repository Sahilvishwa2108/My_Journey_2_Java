public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3*n;j++){
               if(j==1){
                    for(int k=1;k<=n;k++){
                        if((i==1 && k==1) || (i==1 && k==n)){
                            System.out.print(" ");
                        }
                        else if((i==1 && k!=1) || (i==3 && k!=n)){
                            System.out.print("*");      
                        }
                        else{
                            if(k==1 || k==n){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                    }
               }
               else if(j==n){
                    for(int p=1;p<=n;p++){
                        System.out.print(" ");
                    }
               }
               else if(j==2*n){
                for(int q=1;q<=n;q++){
                    if((i==1 && q==1) || (i==1 && q==n)){
                        System.out.print(" ");
                    }
                    else if((i==1 && q!=1) || (i==3 && q!=n)){
                        System.out.print("*");      
                    }
                    else{
                        if(q==1 || q==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
               } 
            }
            System.out.println();
        }
    }
}
