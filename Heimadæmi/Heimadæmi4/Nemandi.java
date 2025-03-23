package Heimadæmi.Heimadæmi4;

/********************************************************************
* Beinagrind fyrir æfingadæmi á Heimadæmum 4
* Tölvunarfræði 2, vor 2025
*
*********************************************************************/
public class Nemandi implements Comparable<Nemandi>{

    private String nafn;
    private int fAr;
    private int fEin;
    private double mEink;

    public Nemandi(String n, int ar, int ein, double eink) {
        this.nafn = n;
        this.fAr = ar;
        this.fEin = ein;
        this.mEink = eink;
    }
    // Samanburðarfall fyrir klasann
    public int compareTo(Nemandi that) {
        /*if (this.mEink < that.mEink) {
            return 1;
        } else if (this.mEink > that.mEink) {
            return -1;
        } else {
            return 0;
        }*/

        /*Útfærið aðra útgáfu af compareTo aðferðinni sem veldur því að nemendur raðast
        fyrst í hækkandi röð eftir fæðingarári og síðan í lækkandi röð eftir fjölda lokinna
        eininga (fyrir þá sem hafa sama fæðingarár). Skilið kóða aðferðarinnar og skjáskoti
        af keyrslu á NemendaVinnsla með 20 nemendum. */

        /*if (this.fAr == that.fAr) {
            if (this.fEin < that.fEin) {
                return 1;
            } else if (this.fEin > that.fEin) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.fAr > that.fAr) {
            return 1;
        } else if (this.fAr < that.fAr) {
            return -1;
        } else {
            return 0;
        }*/

        /*Útfærið enn aðra útgáfu af compareTo aðferðinni sem veldur því að nemendur sem
        hafa hafa lægri meðaleinkunn en 5.0 raðast á eftir öllum öðrum. Þessir föllnu
        nemendur raðast innbyrðis í hækkandi röð eftir fjölda eininga. Hinir nemendurnir
        raðast í lækkandi röð eftir meðaleinkunn. Skilið kóða aðferðarinnar og skjáskoti af
        keyrslu á NemendaVinnsla með 20 nemendum. */

        /*if (this.mEink < 5) {
            if (this.fEin < that.fEin) {
                return -1;
            } else if (this.fEin > that.fEin) {
                return 1;
            } else {
                return 0;
            }
        } else if (this.mEink >= 5) {
            if (this.mEink > that.mEink) {
                return -1;
            } else if (this.mEink < that.mEink) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;*/

        if (this.mEink >= 5 && that.mEink >= 5) {
            // Raða þeim með einkunn >= 5 í lækkandi röð eftir mEink
            if (this.mEink < that.mEink) {
                return 1;  // this kemur á eftir that
            } else if (this.mEink > that.mEink) {
                return -1; // this kemur fyrir that
            } else {
                // Ef mEink er jafnt, raða eftir fjölda eininga í hækkandi röð
                if (this.fEin < that.fEin) {
                    return -1;  // this kemur fyrir that
                } else if (this.fEin > that.fEin) {
                    return 1;   // this kemur á eftir that
                } else {
                    return 0;   // this og that eru jafnir
                }
            }
        } else if (this.mEink < 5 && that.mEink < 5) {
            // Föllnu nemendurnir (mEink < 5) raðast eftir fjölda eininga í hækkandi röð
            if (this.fEin < that.fEin) {
                return -1;  // this kemur fyrir that
            } else if (this.fEin > that.fEin) {
                return 1;   // this kemur á eftir that
            } else {
                return 0;   // this og that eru jafnir
            }
        } else {
            // Nemendur með mEink >= 5 koma alltaf fyrir þá með mEink < 5
            return (this.mEink >= 5) ? -1 : 1;
        }
        

        /*Útfærið enn aðra útgáfu af compareTo aðferðinni sem veldur því að nemendur sem
        hafa hafa lægri meðaleinkunn en 5.0 raðast á eftir öllum öðrum. Þessir föllnu
        nemendur raðast innbyrðis í hækkandi röð eftir fjölda eininga. Hinir nemendurnir
        raðast í lækkandi röð eftir meðaleinkunn. Skilið kóða aðferðarinnar og skjáskoti af
        keyrslu á NemendaVinnsla með 20 nemendum. */

        /*if (this.mEink >= 5) {
            if (this.mEink < that.mEink) {
                return -1;
            } else if (this.mEink > that.mEink) {
                return 1;
            } else {
                return 0;
            }
        } else if (this.mEink < 5) {
            if (this.fEin < that.fEin) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 1;
        }*/
    }
    // Búa til strengútgáfu af hlut til útprentunar
    public String toString() {
        String strNemi = nafn;
        strNemi += " (" + String.format("%4d", fAr) + ")";
        strNemi += " - " + String.format("%3d", fEin) + " ein.";
        strNemi += " Eink: " + String.format("%4.2f", mEink);
        return strNemi;
    }
}
