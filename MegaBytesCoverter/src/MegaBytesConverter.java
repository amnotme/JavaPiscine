public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int mb = (kiloBytes / 1024);
            int kb = (mb * 1024);
            int rmkb = (kiloBytes - kb);

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + rmkb + " KB");
        }

    }
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}

