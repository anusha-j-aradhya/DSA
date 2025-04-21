
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
       int org=num;
        int sum=0;
        while(num>0){
        
           int rem=num%10;
           sum=sum+(rem*rem*rem);
           num=num/10;
          

           
        }
        if(sum==org){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not");
        }
       
    }
    
}
