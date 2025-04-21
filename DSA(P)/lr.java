
import java.util.Scanner;

public class lr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int dir=sc.next().charAt(0);
        if(dir=='L'){
          System.out.println("("+"-"+n+","+0+")");  
        }
        else{
            System.out.println("("+n+","+0+")");
        }

    }
}