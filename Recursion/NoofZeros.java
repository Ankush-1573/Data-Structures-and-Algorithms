public class NoofZeros {
    public static void main(String[] args) {
        zero(102030);
        System.out.println(count);
    }
    static int count=0;
    static void zero(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
        zero(n/10);
    
}
