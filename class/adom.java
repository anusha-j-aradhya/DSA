import java.util.Scanner;

public class adom {
    
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n:");
      int n=sc.nextInt();
      int sq,sq1=0,sq2=0;
      sq=n*n;
      System.out.println(sq);

      sq=n*n;
      while(sq>0){
        int d=sq%10;
        sq1=sq1*10+d;
        sq=sq/10;
      }
      System.out.println(sq1);
      while(n>0){
        int d=n%10;
        sq2=sq2*10+d;
        n=n/10;
      }
    
      sq2=sq2*sq2;
      System.out.println(sq2);
      if(sq1==sq2){
        System.out.println("adom");

      }
      else{
        System.out.println("not");
      }


    }
    
}
