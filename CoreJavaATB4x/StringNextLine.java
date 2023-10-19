import java.util.Scanner;
public class StringNextLine {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d= scan.nextDouble();
            scan.nextLine();
            String s= scan.nextLine();

            System.out.println("string: "+s);
            System.out.println("double: "+d);
            System.out.println("int: "+i);
        }
    }

