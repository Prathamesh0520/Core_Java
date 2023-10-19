import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("1");
        s1.add("2");
        s1.add("3");
        s1.add("4");
        s1.add("5");
        s1.add("6");
        s1.add("7");
        int l = s1.size();
        int empty = 0;
        for(int i = 0; i<l/2;i++) {
            String temp = s1.get(i);
            s1.set(i, s1.get(l-i-1));
            s1.set((l-i-1), temp);


        }
        for(int i = 0;i<l;i++) {
            System.out.print(s1.get(i));
        }

    }
}

