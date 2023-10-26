import java.util.Scanner;

public class LillesKT3 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);

        System.out.print("Sisesta tekst: ");
        String tekst = sisend.nextLine();

        if (onPalindroom(tekst)) {
            System.out.println(tekst + " on palindroom.");
        } else {
            System.out.println(tekst + " ei ole palindroom.");
        }

        sisend.close();
    }

    public static boolean onPalindroom(String tekst) {
        tekst = tekst.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int pikkus = tekst.length();
        for (int i = 0; i < pikkus / 2; i++) {
            if (tekst.charAt(i) != tekst.charAt(pikkus - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
