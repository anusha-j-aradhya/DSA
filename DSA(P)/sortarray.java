
import java.util.Scanner;

public class sortarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            System.out.print(array[i]);

        }
        boolean isascending=true;
        for(int i=0;i<array.length;i++){
            if(array[i]>array[i+1]){
                isascending=false;
            }
        }
        if(isascending){
            System.out.println("the ascecending");
        }
        else{
            System.out.println("desecinding");
        }

    }
}
