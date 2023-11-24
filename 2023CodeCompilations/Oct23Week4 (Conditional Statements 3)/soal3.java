import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
    while (true){
    try{
    Scanner s = new Scanner(System.in);
    int kasih;
    int terima;
    double uang;
    double rupiah;
    double dollar = 14726.20;
    double yen = 139.75;
    double yuan = 2205.19;
    double hasil;

    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Money Changer");
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("1 Dolar (USD) = Rp 14.726.20");
    System.out.println("1 Yen (JPY) = Rp 139.75");
    System.out.println("1 Yuan (CNY) = Rp 2.205.19");
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Pilihan mata uang: ");
    System.out.println("1 IDR");
    System.out.println("2 USD");
    System.out.println("3 JPY");
    System.out.println("4 CNY");

    System.out.print("Mata uang yang ditukar: ");
    kasih = s.nextInt();
    while (kasih < 1 || kasih > 4){
    System.out.println("Pilihan inputan hanya 1 sampai 4!");
    System.out.print("Mata uang yang ditukar: ");
    kasih = s.nextInt();
    }
    System.out.print("Ditukar dengan mata uang: ");
    terima = s.nextInt();
    while (terima < 1 || terima > 4){
    System.out.println("Pilihan inputan hanya 1 sampai 4!");
    System.out.print("Mata uang yang ditukar: ");
    terima = s.nextInt();
    }
    while (terima == kasih){
    System.out.println("Mata uang yang ditukar tidak boleh sama!");
    System.out.print("Mata uang yang ditukar: ");
    terima = s.nextInt();
    }
    System.out.print("Input jumlah mata uang: ");
    uang = s.nextDouble();
    while (uang <= 0){
    if (uang < 0){
    System.out.println("Error: Inputan uang tidak bisa minus!");
    uang = s.nextDouble();
    }
    else if (uang == 0){
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Inputan user 0 sehingga tidak ada uang yang ditukar!");
    System.exit(0);
    }
    }

    if (kasih == 1){
    System.out.println("-------------------------------------------------------------------------------------------------");
        if (terima == 2){
        rupiah = uang;
        hasil = rupiah / dollar;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" dolar.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
       else if (terima == 3){
        rupiah = uang;
        hasil = rupiah / yen;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yen.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
       else if (terima == 4){
        rupiah = uang;
        hasil = rupiah / yuan;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yuan.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }        
    }

    else if (kasih == 2) {
    System.out.println("-------------------------------------------------------------------------------------------------");
        if (terima == 1){
        hasil = uang * dollar;
        System.out.println("Hasilnya "+hasil+" Rupiah");
        System.exit(0);
        }
        else if (terima == 3){
        rupiah = uang * dollar;
        hasil = rupiah / yen;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yen.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
        else if (terima == 4){
        rupiah = uang * dollar;
        hasil = rupiah / yuan;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yuan.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
    }

    else if (kasih == 3) {
    System.out.println("-------------------------------------------------------------------------------------------------");
        if (terima == 1){
        hasil = uang * yen;
        System.out.println("Hasilnya "+hasil+" Rupiah");
        System.exit(0);
        }
        else if (terima == 2){
        rupiah = uang * yen;
        hasil = rupiah / dollar;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" dolar.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
        else if (terima == 4){
        rupiah = uang * yen;
        hasil = rupiah / yuan;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yuan.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
    }

    else if (kasih == 4) {
    System.out.println("-------------------------------------------------------------------------------------------------");
        if (terima == 1){
        hasil = uang * yuan;
        System.out.println("Hasilnya "+hasil+" Rupiah");
        System.exit(0);
        }
        else if (terima == 2){
        rupiah = uang * yuan;
        hasil = rupiah / dollar;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" dolar.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
        else if (terima == 3){
        rupiah = uang * yuan;
        hasil = rupiah / yen;
            if (hasil >= 1){
            System.out.println("Hasilnya "+hasil+" Yen.");
            System.exit(0);
            }
            else {
            System.out.println("Maaf. Uang anda tidak cukup.");
            System.exit(0);
            }
        }
    }

    } catch (Exception e){
    System.out.println("Input invalid, try again!");
    }
    }
    }
}
