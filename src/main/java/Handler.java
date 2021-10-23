public class Handler {

    public static void main(String... arg){
        printBinary(13);
        printOctal(12);
        printHex(27);
    }

    static void printReverse(char[] a) {
        boolean f = true;
        for (int i = a.length - 1; i >= 0; i--) {
            if (f && a[i] == '0')
                continue;
            f = false;
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void printBinary(int n) {
        int nb = (int) (Math.log(n) / Math.log(2)) + 1;
        char[] ca = new char[nb];

        for (int i = 0; i < nb; i++) {
            ca[i] = (char) (n % 2 + 48);
            n /= 2;
        }

        printReverse(ca);
    }

    static void printOctal(int n) {
        int nb = (int) (Math.log(n) / Math.log(3));
        char[] ca = new char[nb];

        for (int i = 0; i < nb; i++) {
            ca[i] = (char) (n % 8 + 48);
            n /= 8;
        }

        printReverse(ca);
    }

    static void printHex(int n) {
        int nb = (int) (Math.log(n) / Math.log(4));
        char[] ca = new char[nb];

        for (int i = 0; i < nb; i++) {
            int t = n % 16;

            if ((t + 48) > 57)
                t += 7 + 48;
            else
                t += 48;
            ca[i] = (char) (t);
            n /= 16;
        }

        printReverse(ca);
    }
}
