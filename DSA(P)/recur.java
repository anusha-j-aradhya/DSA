

public class recur {

    public static void printnum(int i,int n,int sum) {
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            //System.out.println(i);
            return;

        }
        sum=sum+i;
        System.out.println(i);
        printnum(i+1, n, sum);
       
    }
    public static void main(String[] args) {
        printnum(1, 5, 0);
        
    }
    
}
