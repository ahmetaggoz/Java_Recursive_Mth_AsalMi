package RecursiveMethods;

import java.util.Scanner;

public class AsalMi {

    static boolean asalMi(int sayi, int bolen){
     if(bolen == 1){
         return true;
     }else{
         if(sayi % bolen == 0){
             return false;
         }else {
             return asalMi(sayi, bolen -1);
         }
     }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 2){
            System.out.println("Sayı asal değil.");
        }else {
            boolean sonuc = asalMi(sayi, sayi / 2);

            if (sonuc){
                System.out.println(sayi + " Sayısı bir asal sayıdır.");
            }else {
                System.out.println(sayi + " Sayısı asal değildir.");
            }
        }
        scanner.close();
    }
}
