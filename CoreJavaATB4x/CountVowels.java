public class CountVowels {
    public static void main(String[] args) {
        String str="This is the new sTRING ADDED BY ME";
        str=str.toLowerCase();
        int vCount=0;
        int cCount=0;

        for (int i = 0; i <str.length() ; i++) {
            Character ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            } else if (ch>='a' && ch<='z') {
                cCount++;
            }
        }
        System.out.println("Vowels in the String are: "+vCount);
        System.out.println("Consonents in the String are: "+cCount);
    }
}




