import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String word="Hello World";
        System.out.println(word);
        for (int x=0;x<=1;x++){

            int y=20;
            int z=40;
            int w= y+z;
            System.out.println(x+w);
        }
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();

        //char[] arr = Str.toCharArray();

        String rev = "";

        for(int i = Str.length() - 1; i >= 0; i--)
        {
            rev = rev + Str.charAt(i);
        }


        System.out.println(rev);
    }
}
