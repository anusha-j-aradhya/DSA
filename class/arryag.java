
import com.sun.nio.sctp.SctpServerChannel;
import java.util.Scanner;

public class arryag {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
        int size=sc.nextInt();
        int[] eg=new int[size];
        int[] lv=new int[size];
        
        for (int i=0;i<size;i++) {
            eg[i]=sc.nextInt();
            
        }
        for(int j=0;j<size;j++){
            lv[j]=sc.nextInt();
        }
        int sum=0;
        int max=0;
        for(int i=0;i<t;i++){
           
            sum=sum+(eg[i]-lv[i]);
        
        if(max<sum){
            max=sum;
            
        }
    
    }
    System.out.println(max);

    }
    
}
