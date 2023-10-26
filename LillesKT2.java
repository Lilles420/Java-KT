import java.util.Scanner;

public class LillesKT2 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.print("Mitu takistit soovite ühendada: ");
        int takistiteArv = sisend.nextInt();

        double kogutakistusJadamisi = 0;
        double kogutakistusRoppselt = 0;

        for (int i = 1; i <= takistiteArv; i++) {
            System.out.print("Sisestage " + i + ". takisti takistus ohmides: ");
            double takistus = sisend.nextDouble();

            kogutakistusJadamisi += takistus;
            kogutakistusRoppselt = 1 / (1 / kogutakistusRoppselt + 1 / takistus);
        }

        System.out.println("Jadamisi ühendatud takistite kogutakistus: " + kogutakistusJadamisi + " ohm");
        System.out.println("Rööpselt ühendatud takistite kogutakistus: " + kogutakistusRoppselt + " ohm");

        sisend.close();
    }
}
