
import java.util.Scanner;


public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int orgn=num;
        int sum=0;
      
        while(num>0){
            
            int digit=num%10;
            int fact=1;
            
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
            
            
           
           

        }
        if(orgn==sum){
            System.out.println("strong");
        }
        else{
            System.out.println("not");
        }

      
    }
}
