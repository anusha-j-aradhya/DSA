
import java.util.Scanner;

public class delhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int fn=200;
        int d=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
             int tfn=a[i]*fn;
             System.out.println(tfn);

            }
            
            
        }
    
    }
    
}
