public class CoreJavaBrushUp1 {

    public static void main(String[] args) {
        int myNum = 5;
        String website = "Raul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value stored in the myNum variable");

        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1, 2 , 4, 5, 6, 8, 100, 122};

        System.out.println(arr2[2]);

        // For loop
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        String[] name = {"Raul", "Shetty", "Selenium"};

        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for(String s: name) {
            System.out.println(s);
        }
    }
}
