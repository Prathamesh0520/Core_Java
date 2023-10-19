
import java.util.Scanner;

public class SubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest=largest=s.substring(0, k);

        for (int i = 1; i < s.length()-k+1; i++) {
            String subString=s.substring(i, i+k);
            if(smallest.compareTo(subString)>0)
                smallest=subString;
            if(largest.compareTo(subString)<0)
                largest=subString;

        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scan.next();
        System.out.println("Enter a Range: ");
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
