/////////////////////////////////////////////////////////////
//  Beinagrind að lausn á dæmi 3 í Heimadæmum 1.
//    Spila leik þar sem byrjað er með n krónur og svo í
//    hverri ítrun annaðhvort tapast ein króna eða græðist
//    ein króna.  Leikurinn hættir þegar eignin er 0 kr.
//    Eignastaða er prentuð út í hverri ítrun og
//    fjöldi ítrana í lokin.
//
//  Keyrsla:  $ java Runs 3
//
//  Hjálmtýr Hafsteinsson, Tölvunarfræði 2
/////////////////////////////////////////////////////////////
import edu.princeton.cs.algs4.*;

public class Runs {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int cnt = 0;

        while (n != 0) {
            int stak;
            if (StdRandom.uniformInt(2) == 0) {
                stak = -1;
            } else {
                stak = 1;
            }
            n += stak; // Update counter
            cnt++; // Auka count
            System.out.print(n + " "); // Nýja gildi n while != 0
        }

        System.out.println("\nNumber of flips: " + cnt);
   }
}
