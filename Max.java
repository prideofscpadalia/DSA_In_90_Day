class Max{
    public static int find_max(int [] arr,int i){
        possible_max1 = arr[i];
        possible_max2 = find_max(arr[i+1]);

        if(possible_max1 > possible_max2)   return possible_max1;
        else return possible_max2;
     }
    public static void main(String[] args) {
        int [] arr = new int[] {3456};
        System.out.println(" .. ");
    }
}