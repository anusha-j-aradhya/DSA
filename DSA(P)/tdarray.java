
import java.util.Scanner;



public class tdarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and col");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[rows][col];
        System.out.println("enter elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                
                mat[i][j]=sc.nextInt();
            }
        }
        for(int  i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();

        }
        

            System.out.println("enter search element");
            int x=sc.nextInt();
           
           
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    if(mat[i][j]==x){
                        System.out.println("key value found at"+"("+i+","+j+")");
                    }
                }
            }



        }
    }
    

