package hipo;
import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ilk, ikinci;
        double hipo;
        System.out.println("İlk dik kenarı giriniz: ");
        ilk = input.nextInt();

        System.out.println("İkinci dik kenarı giriniz: ");
        ikinci = input.nextInt();


        hipo = Math.sqrt ((ilk*ilk) + (ikinci*ikinci));


        System.out.println("Üçgeninizin hipotenüsü= " + hipo);

        double cevre = ilk + ikinci + hipo;
        System.out.println("Üçgeninizin çevresi= " +cevre);

        double u = cevre / 2;
        double alan = Math.sqrt(u*(u-ilk)*(u-ikinci)*(u-hipo));
        System.out.println("Üçgenin alanı = "+ alan);

    }




}
