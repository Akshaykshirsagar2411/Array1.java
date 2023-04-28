class Array1 {
    public static void main(String[] args) {
        int arr1[] = new int[4];

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;

        int arr2[] = { 1, 3, 4, 5, 6 };
        for(int i=0;i<4;i++)
        {
            System.out.println(arr1[i]);
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}

