package Heimadæmi.Heimadæmi2;

/////////////////////////////////////////////////////////////
// Beinagrind að lausn á dæmi 1 í Heimadæmum 2.
// Tekur inn heiltöluna n á skipanalínunni og prentar
// út nokkrar tölustafi.
//
// Keyrsla: $ java Mystery 20
// 10100
//
// Hjálmtýr Hafsteinsson, Tölvunarfræði 2
/////////////////////////////////////////////////////////////
import edu.princeton.cs.algs4.*;
public class Mystery {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Stack<Integer> S = new Stack<Integer>();
        // Ykkar kóði hér ...
        while (n > 0) {
            S.push(n % 2);
            n = n / 2;
        }
        while (!S.isEmpty()) {
            System.out.print(S.pop());
        }
        System.out.println();
    }
}
