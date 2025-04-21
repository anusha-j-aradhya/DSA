

public class fib{
   
    public static void main(String[] args) {
        int[] arr={10,2,5,6,8,9};
        int n=arr.length;
       for(int i=0;i<=n;i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            System.out.print(arr[i]+" ");
           
        }
        
       }
       System.out.println("second largest is:");
       for(int i=0;i<=n-1;i++){
        if(arr[i]>arr[i+1]){ 
            System.out.println(arr[n-1]);
        }
       }
      

    }
}