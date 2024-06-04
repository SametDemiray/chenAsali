package org.example;
/*
Bu program, klavyeden girilen pozitif bir tamsayının Chen asalı olup olmadığını belirleyecektir.
Chen asalı, p ve p+2 veya p ve p+4 olmak üzere iki ardışık asal sayıyı içeren bir çifttir.
 Örneğin, 5 ve 7, 11 ve gibi.
21 - 2 = 19 ve 21 + 2 = 23. Hem 19 hem de 23 asal sayılardır.
Ayrıca, 21 - 4 = 17 ve 21 + 4 = 25. 17 asal bir sayıdır, ancak 25 asal bir sayı değildir.
Dolayısıyla, 21 bir Chen asalıdır.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı giriniz : ");
        sayi = scanner.nextInt();

        if (sayi <= 1){
            System.out.println("Geçersiz giriş. Pozitif bir tamsayı girmelisiniz.");
            return;
        }

        if (isChenAsali(sayi)){
            System.out.println(sayi + " bir Chen asalıdır.");
        } else {
            System.out.println(sayi + " bir Chen asalı değildir.");
        }
    }

    public static boolean isChenAsali(int sayi){

        if ((isAsal(sayi - 2) && isAsal(sayi + 2)) ||
                (isAsal(sayi - 4) && isAsal(sayi))) {
            return true;
        }
        return false;
    }

    public static boolean isAsal(int sayi){

        int i;
        if (sayi <= 1) {
            return false;
        }
        for (i=2; i<= Math.sqrt(sayi); i++){
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
    }
}