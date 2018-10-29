import java.util.HashSet;
import java.util.Set;

/*
2. Суммы чисел.
   На вход программе подается массив чисел (возможны повторения).
   Программа должна посчитать оптимальным по быстродействию способом
   уникальные суммы пар чисел из этого массива и вывести их список.
*/

public class sumsNumbers {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (!seen.contains(A[i] + A[j])) {
                    seen.add(A[i] + A[j]);
                    System.out.println(A[i] + A[j]);
                }
            }
        }
    }
}
