class factorial{
    public static int sol(int k){
        if(k>0){
            return (k*(k-1));
        }else   return 0;
    }
    public static void main(String [] args){
        int facto = sol(5);
        System.out.println(facto);
    }
}