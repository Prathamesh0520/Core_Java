public class StringPalindrome {
    public static void main(String[] args) {
        String str="lipitio", revstr="";

        int strLength=str.length();
        for (int i = (strLength-1); i >=0 ; --i) {
            revstr=revstr+str.charAt(i);
        }
        if (str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str+" is a palindrome string.");
        }
        else {
            System.out.println(str+ " is not a palindrome string");
        }
    }
}
