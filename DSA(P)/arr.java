
import java.util.Scanner;

public class arr{
    public static void main(String[] args) {
        //taking names as input print on screen
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("enter names");
        String[] names=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<size;i++){
            System.out.print(names[i]+" ");
        }
    }
}