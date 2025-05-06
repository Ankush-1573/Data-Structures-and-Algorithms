public class Reverse {
    public static void main(String[] args) {
        //rev(5);
        //straight(5);
        funBoth(5);
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rev(n-1);
    }
    static void straight(int n){
        if(n==0){
            return;
        }
        straight(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    
}
