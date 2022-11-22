public class Main {
    public static void main(String[] args) {
        printMegabytesAndKilobytes(2500);
    }

    public static void printMegabytesAndKilobytes(int kilobytes)
    {
        int megabyte = Math.abs(kilobytes/1024);
        int remainingKilobytes = kilobytes % 1024;

        System.out.println(kilobytes + " KB = " + megabyte + " MB and " + remainingKilobytes + " KB");
    }
}
