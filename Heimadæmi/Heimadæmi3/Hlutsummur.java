
/**********************************************************
* Beinagrind að lausn á æfingadæmi í heimadæmum 3
* Tölvunarfræði 2, vor 2025
**********************************************************/
import edu.princeton.cs.algs4.*;
public class Hlutsummur {
    public static int[][] reiknaHS(int[] A) {
        int N = A.length;
        int[][] B = new int[N][N];
        // gefið reiknirit til að reikna hlutsummur
        // FYLLA INN ...
        return B;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] A = new int[N];

        // Búa til slembigildi í fylkið (nota t.d. StdRandom.uniformInt())
        // FYLLA INN ...
        for (int i = 0; i < N; i++) {
            A[i] = StdRandom.uniformInt(N);
        }

        // Taka tímann á útreikningi
        Stopwatch timer = new Stopwatch();
        int[][] B = reiknaHS(A);
        double eTime = timer.elapsedTime();

        StdOut.println("Elapsed time = " + eTime);

        // Einföld stikkprufa til að athuga hvort rétt reiknað ...
        StdOut.println("A[2] + A[3] = " + (A[2] + A[3]));
        StdOut.println("B[2][3] = " + B[2][3]);
    }
}