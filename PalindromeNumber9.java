public class PalindromeNumber9 {
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int n = (int)Math.log10((double)x) + 1;
        double i = n, j = 1;
        System.out.println(i);
        while(i > j){
            int left = (int)(x % Math.pow(10.0,i)/Math.pow(10.0,i-1));
            System.out.println(Math.pow(10.0,i));
            System.out.println(Math.pow(10.0,i-1));
            System.out.println("left: "+ left);
            int right = (int)(x % Math.pow(10.0,j)/Math.pow(10.0,j-1));
            System.out.println("right: " + right);
            if(left != right) return false;
            i--;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
