import java.util.Scanner;

public class LillesKT1 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);

        System.out.print("Sisestage täisarv, mis näitab kolmnurga suurust: ");
        int suurus = sisend.nextInt();

        for (int i = 1; i <= suurus; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sisend.close();
    }
}
