import java.util.Scanner;

class Array7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int Evencount = 0;
        int Oddcount = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                Evencount++;
            } else {
                Oddcount++;
            }
        }

        System.out.println(Evencount);

        System.out.println(Oddcount);

    }
}
