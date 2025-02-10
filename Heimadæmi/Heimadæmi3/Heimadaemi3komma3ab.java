public class Heimadaemi3komma3ab {
    
    public static int loop1(int N) {
        int s = 0;
        int counter = 0;
        for (int i=N; i>0; i--) {
            s+=i;
            counter++;
        } 
        System.out.println("Lykkjan keyrði " + counter + " sinnum.");
        return s;
    }

    public static int loop2(int N) {
        int s = 0;
        int counter = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<i*i; j++) {
                s++;
                counter++;
            }
        }
        System.out.println("Lykkjan keyrði " + counter + " sinnum.");
        return s;
    }

    public static int loop3(int N) {
        int s = 0;
        int counter = 0;
        for (int i=1; i<N; i*=2) {
            for (int j=1; j<N; j*=2) {
                s++;
                counter++;
            }
        }
        System.out.println("Lykkjan keyrði " + counter + " sinnum.");
        return s;
    }

    public static void main(String[] args) {
        int N = 5; // Veldu hvaða gildi þú vilt fyrir N
        int result1 = loop1(N);  // Kalla á runLoop aðferðina
        int result2 = loop2(N);
        int result3 = loop3(N);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
    
