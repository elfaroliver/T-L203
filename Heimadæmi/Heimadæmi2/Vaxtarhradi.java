package Heimadæmi.Heimadæmi2;

public class Vaxtarhradi {
    public static void main(String[] args) {

        int N = 5;

        for (int i=N; i>=0; i--)
            for (int j=i; j<N; j++)
                System.out.println("*");
    }
}
