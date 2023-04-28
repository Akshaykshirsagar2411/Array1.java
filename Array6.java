// print addtion of array 


import java.util.*;

class Array6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int N = sc.nextInt();
        System.out.println("enter array element");

        int arr[] = new int[N];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Print");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("Sum=" + sum);
    }
}
