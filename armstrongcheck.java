import java.util.Scanner;

class armstrongcheck{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number to check for armstrong :");
        int a=in.nextInt();
        int y=a;
        String l = Integer.toString(a);
        //String l= (String)a;
        int n=l.length();
        int arr[]=new int(n);
        int am;
        for(int i=1;i<=n;i++){
            int q=a%((int)(Math.pow(10, i)));
            arr[i]=q/((int)(Math.pow(10, i-1)));
            a=q;
        }
        for (int i : arr) {
            am+=Math.pow(i,3);
        }
        if(y==am){
            System.out.println("The given number is Armstrong number");
        }else{
            System.out.println("The given number is not an Armstrong number");
        }
    }
}