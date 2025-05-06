public class PrintReverse {
    public static void main(String[] args) {
       System.out.println(Reverse(5)); 
        
    }
    static int Reverse(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n); // 5 4 3 2 1
        return Reverse(n-1);
    }
    
}
