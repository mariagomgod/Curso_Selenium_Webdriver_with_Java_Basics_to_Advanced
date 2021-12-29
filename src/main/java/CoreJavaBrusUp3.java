public class CoreJavaBrusUp3 {

    public static void main(String[] args) {

        //String is an object // String literal
        //String s1 = "Raul Shetty Academy";
        String s5 = "hello";

        //new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Raul Shetty Academy";
        String[] splittedString = s.split("Shetty");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
