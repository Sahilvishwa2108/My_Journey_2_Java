class Palindrome {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1};
        int flag = 0;
        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                flag = 1;
                System.out.println("not a palindrome");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("palindromic array");
        }
    }

}
