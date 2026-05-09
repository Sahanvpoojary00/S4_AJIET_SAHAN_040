import java.util.Scanner;

class candies{
    
    static int N=20;
    static int K=5;
    static int M;
    static Scanner c =new Scanner(System.in);


    public static void display(int sold, int avail){
        System.out.println("Number of Candies Sold:"+sold+"\nNumber of Candies available:"+avail);
    }
    public static void display(int avail){
        System.out.println("Number of Candies available:"+avail);
    }


    public static void sell(){
        System.out.println("How many candies do you need :");
        int i=c.nextInt();
        
        if(i>N){
            System.out.println("------------ERROR-------------\n---------Invalid input--------\n---------Maximum Capacity of jar is"+N+"-----------");
            return;
        }
        if (M>K+i){
            display(i, M-i);
            M-=i;
        }else if(M<=K){
            System.out.println("REFILLINGG THE JAR !!");
            M=N;
            display(i, M=M-i);
        }  
    }

    public static void main(String [] args){
        M=N;
        display(M);
        while (true) {
            sell();
            System.out.print("Want to buy more candies !!(Y/N)");
            char s=c.next().charAt(0);
            if(s!='Y'| s!='y'){
                System.out.print("---------EXIT-----------\n");
                System.exit(0);
            }

        }

    }
}