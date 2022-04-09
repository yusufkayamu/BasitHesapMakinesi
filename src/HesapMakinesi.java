import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("ilk degeri giriniz =");
        n1 = input.nextInt();

        System.out.print("ikinci degeri giriniz =");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-cikarma\n3-carpma\n4-bolme");
        System.out.print("yapmak istediginiz islemin numarasini giriniz =");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("sonuc =" + (n1 + n2));
                break;
            case 2:
                System.out.println("sonuc =" + (n1 - n2));
                break;
            case 3:
                System.out.println("sonuc =" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("bir sayi sifira bolunemez !!!!");
                } else System.out.println("sonuc =" + (n1 / n2));

                break;

                default:
                System.out.println("yanlis bir deger girdiniz!!!!");
        }
    }
}
