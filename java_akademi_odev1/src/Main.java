import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi Tahmin Oyununa Hoşgeldiniz!");
        int rastgeleSayi = (int)(Math.random() * 100) + 1;
        ArrayList<Integer> sayilar = new ArrayList<>();
        while(true){
            System.out.println("Lütfen bir sayi giriniz:");
            int alinan_sayi=scanner.nextInt();
            sayilar.add(alinan_sayi);
            if(alinan_sayi<rastgeleSayi){
                System.out.println("Daha buyuk sayi giriniz");
            }
            if(alinan_sayi>rastgeleSayi) {
                System.out.println("Daha kucuk sayi giriniz");
            }
            if (alinan_sayi==rastgeleSayi) {
                System.out.println("Tebrikler!Doğru tahmin.");
                break;
            }
        }
        System.out.println("Oyun Bitti!");
        System.out.println("Tahminleriniz:");
        for (Integer sayi : sayilar) {
            System.out.println(sayi);
        }

    }
}