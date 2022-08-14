package deneme;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int aclisTutari=10;
        double km;

        Scanner input= new Scanner(System.in);
        System.out.print("Kac Km gidildi? ");
        km=input.nextDouble();

        double artisMiktari= km*2.20;
        double tutar= aclisTutari + artisMiktari;

        double toplamTutar= (tutar<20) ? 20: tutar; //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.

        System.out.println("Toplam Tutar: " + toplamTutar);
    }
}
