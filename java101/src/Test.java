import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        double cevre, alan;

        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        c = input.nextInt();

        cevre = ((a + b + c) / 2);
        alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
        System.out.println("Üçgenin alanı: " + alan);

    }
}
