
import java.util.Scanner;





public class maxmin {
    public static void main(String[] args) {
        //max and min of element
        //int[] number={10,2,3,5,1};
        //taken as input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        System.out.println("enter elements");
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            System.out.print(number[i]+" ");
        }
       
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
                
            }
            if(number[i]>max){
                max=number[i];
               
            }
           
        }
        System.out.println("min number is "+min);
        System.out.println("max number is "+max);
    }
    
}
