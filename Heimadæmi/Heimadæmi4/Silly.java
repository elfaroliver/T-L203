/********************************************************************
* Beinagrind fyrir dæmi 4 á Heimadæmum 4
* Tölvunarfræði 2, vor 2025
*
*********************************************************************/
import java.util.Comparator;
import edu.princeton.cs.algs4.*;
public class Silly {
    // This class should not be instantiated.
    private Silly() { }
    public static void sort(Comparable[] a) {
    int N = a.length;
    // Hér kemur kóðinn ykkar
    }
    /***************************************************************************
    * Helper sorting functions.
    ***************************************************************************/
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
    }
    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
    Object swap = a[i];
    a[i] = a[j];
    a[j] = swap;
    }
    /***************************************************************************
    * Check if array is sorted - useful for debugging.
    ***************************************************************************/
    // is the array a[] sorted?
    private static boolean isSorted(Comparable[] a) {
    return isSorted(a, 0, a.length - 1);
    }
    // is the array sorted from a[lo] to a[hi]
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++)
    if (less(a[i], a[i-1])) return false;
    return true;
    }
    // print array to standard output
    private static void show(Comparable[] a) {
    for (int i = 0; i < a.length; i++) {
    StdOut.println(a[i]);
    }
    }
    public static void main(String[] args) {
    String[] a = StdIn.readAllStrings();
    Stopwatch timer = new Stopwatch();
    Silly.sort(a);
    double eTime = timer.elapsedTime();
    StdOut.println("elapsed time = " + eTime);
    // Ef við viljum athuga hvort fylkið sé raðað
    // show(a);
    }
}

