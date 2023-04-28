import java.util.*;

class Array5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int N = sc.nextInt();
        System.out.println("enter array elements");
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array print");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
