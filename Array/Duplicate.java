public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int n=arr.length-1;
        int flag=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if((arr[i]==arr[j]) && i!=j ){
                    System.out.println("duplicate number is:"+arr[i]);
                    flag=1;
                }
            }
        if(flag==1){
            break;
        }
        }
    }
}
