
public class sample {
    public static int getSmallest(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static int getLargest(int[] arr) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) { 
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr.length);
        int L=getLargest(arr);
        System.out.println("Largest element is " + L);
        System.out.println("Smallest Element is " + getSmallest(arr));
        

    }
    
}
