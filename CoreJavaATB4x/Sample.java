
import java.util.*;
public class  Sample {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY && nX > 0)
                result = i;
        }
        return result;
    }
}