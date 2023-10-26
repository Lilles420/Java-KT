import java.util.Scanner;

public class LillesKT4 {

    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);
        
        // Küsi arve summat
        System.out.print("Sisesta arve summa: ");
        double arveSumma = sisestus.nextDouble();
        sisestus.close();

        // Loob restoraniarve objekti kasutaja sisestatud summaga
        RestoraniArve arve = new RestoraniArve(arveSumma);
        
        // Prindi arve üksikasjad
        arve.prindiArveAndmed();
        
        // Kutsu meetodid, et teha kindlaks nõutud ülesanded
        tagurpidiLause();
        prindiNumbrid1Kuni66();
        prindiNumbrid1Kuni66GruppidesViieKaupa();
        prindiNumbrid1Kuni66JagunevadKolmega();
    }

    // Meetod lause sõnade järjekorra tagurpidi pööramiseks
    static void tagurpidiLause() {
        Scanner sisestus = new Scanner(System.in);
        System.out.print("Sisesta lause: ");
        String lause = sisestus.nextLine();
        sisestus.close();

        String[] sonad = lause.split(" ");
        for (int i = sonad.length - 1; i >= 0; i--) {
            System.out.print(sonad[i] + " ");
        }
        System.out.println();
    }

    // Meetod arvude prindimiseks 1-66 ühes reas
    static void prindiNumbrid1Kuni66() {
        for (int i = 1; i <= 66; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    // Meetod arvude prindimiseks 1-66 viie kaupa reas
    static void prindiNumbrid1Kuni66GruppidesViieKaupa() {
        for (int i = 1; i <= 66; i++) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Meetod arvude prindimiseks 1-66, mis jagunevad kolmega
    static void prindiNumbrid1Kuni66JagunevadKolmega() {
        for (int i = 1; i <= 66; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

class RestoraniArve {
    private double algneSumma;

    // Konstruktor
    public RestoraniArve(double summa) {
        algneSumma = summa;
    }

    // Meetod jootraha arvutamiseks
    public int arvutaJootraha() {
        double jootrahaProtsent = 0.10;
        double jootraha = algneSumma * jootrahaProtsent;
        return Math.round((float) jootraha);
    }

    // Meetod kogu summa arvutamiseks
    public double arvutaKoguSumma() {
        double koguSumma = algneSumma + arvutaJootraha();
        return koguSumma;
    }

    // Meetod arve andmete väljastamiseks
    public void prindiArveAndmed() {
        System.out.println("Arve " + algneSumma + "€, Jootraha " + arvutaJootraha() + "€, Kokku " + arvutaKoguSumma() + "€");
    }
}
