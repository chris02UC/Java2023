import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        
        double gaji = 15000000;
        double pemasukan = gaji * 0.4;
        double tabung = gaji * 0.6;

        double belanja;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input harga belanjaan dalam rupiah: ");
        belanja = scan.nextDouble();

        double diskon_final = belanja * 0.95 * 0.8 * 0.4;
        double persentase = (diskon_final / gaji) * 100;

        if (belanja < 0) {
        System.out.println("Error: Nominal belanja dibawah nol!");
        }
    
        else if (pemasukan < diskon_final) {
        System.out.println("Syafa tidak bisa belanja karena jatah belanja lebih sedikit daripada harga belanja");
        }

        else if (pemasukan >= diskon_final) {
        System.out.println("Total harga belanjaan sebelum Turbo Diskon: " + belanja);
        System.out.println("Total harga belanjaan setelah Turbo Diskon: " + diskon_final);
        System.out.println("Persentase pengeluaran uang belanja terhadap keseluruhan gaji adalah: " + persentase + "%");
        }

    }
}
