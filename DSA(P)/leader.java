public class leader {
    public static void main(String[] args) {
        int[] arr={10,19,4,5,6};
        for(int i=arr.length;i<=0;i--){
            if(arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
    
}
