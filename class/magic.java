import java.util.Scanner;

public class magic {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int original=n;
        int digit=0;
        int revers=0;
        int sum = 0;
        while (n > 0) {
            sum =sum+(n % 10);
            n=n/10;
        }
        int fsum=sum;
        System.out.println("sum:"+fsum);
        
        while(sum>0){
            digit=sum%10;
            revers=revers*10+digit;
            sum=sum/10;
        }
        int frev=revers;
        System.out.println("revs:"+frev);
        int result=fsum*frev;
        System.out.println(result);
        if(result==original){
            System.out.println("magic");

        }
        else{
            System.out.println("not");
        }


        
        
        

    }

    
}
