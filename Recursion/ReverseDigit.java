public class ReverseDigit {
    public static void main(String[] args) {
        rev1(n);
        System.out.println(palindrome(sum));
        
    }
    static int n=1234321;
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    static boolean palindrome(int sum){
        if(n==sum){
            return true;
        }
        return false;
    }
}
