import java.util.Scanner;

class swap{

     public static void swapnum(int x, int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Numbers after swapping - \na= "+x+"\nb="+y);
    }

    public static void swapwithout_temp(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Numbers after swapping - \na= "+x+"\nb="+y);
    } 



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t;
        System.out.print("Enter the first number :");
        int a = in.nextInt();
        System.out.print("Enter the second number :");
        int b= in.nextInt();
        System.out.println("Numbers before swapping - \na= "+a+"\nb="+b);
        swapnum(a,b);
        
       
    }
}