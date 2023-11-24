import java.util.Scanner;
public class Extra1 {
    public static void main(String[] args) {
        
        System.out.println("=== INPUT ===");
        
        double harga_rumah;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga rumah: ");
        harga_rumah = scan.nextDouble();

        double DP;
        System.out.print("Uang muka (DP) dalam %: ");
        DP = scan.nextInt();

        double tahun;
        System.out.print("Jangka waktu cicilan (dalam tahun): ");
        tahun = scan.nextInt();

        double sisa_angsuran = harga_rumah * ((100-DP)/100);
        double angsuran_bulan = (sisa_angsuran + (sisa_angsuran*7.34/100*tahun)) / (tahun * 12);
        double angsuran_tahun = angsuran_bulan * 12;

        if (DP > 50 || DP < 10 || tahun > 30 || tahun < 5) 
        {
         System.out.println("=== OUTPUT ===");
         System.out.println("Error: Inputan user diluar parameter!");
         System.out.println("Reminder: DP minimal 10%, maximal 50%");
         System.out.println("Reminder: Cicilan minimal 5 tahun, maksimal 30 tahun");
        }

        else if (harga_rumah <= 0) {
            System.out.println("Error: Harga rumah minus atau kosong!");
        }
        else
        {
            System.out.println("=== OUTPUT ===");
            System.out.println("Sisa angsuran: " + (long)sisa_angsuran);
            System.out.println("Angsuran per tahun: " + (long)angsuran_tahun);
            System.out.println("Angsuran per bulan: " + (long)angsuran_bulan);
        }
    }
}
