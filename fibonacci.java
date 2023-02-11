public class fibonacci {
    public static int sol(int n){            
        if(n < 2){
            return 1;
        }else         return (sol((n-1)+(n-2)));
        
    }
    public static void main(String[] args) {
        int k = sol(0);
        
        System.out.println(k);
    }
}
