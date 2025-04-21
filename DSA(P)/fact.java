public class fact {
    public static int facto(int n) {
        if(n==1){
            return 1;
        
        }
      int fact=  facto(n-1);
      int fn=n*fact;
      return fn;
      
        
    }

 
public static void main(String[] args) {
    int n=5;
    int ans=facto(n);
    System.out.println(ans);
}

}
