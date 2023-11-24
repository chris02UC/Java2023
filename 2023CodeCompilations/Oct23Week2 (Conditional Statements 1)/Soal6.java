import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args) {
        int mobil = 100;
        
        int barang;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input jumlah barang yang akan dibawa: ");
        barang = scan.nextInt();
    
        int pp;
        int sisa;
        int ppfinal;

        pp = (int)(barang/mobil);
        sisa = barang % mobil;

        if (barang < 0) {
        System.out.println("Error: Jumlah barang yang di input minus!");
        }

        else if (barang == 0) {
        System.out.println("Output: Budi tidak perlu pulang pergi karena tidak ada barang yang dipindah!");
        }

        else {
                if (sisa > 0)
                {
                ppfinal = (int)(Math.floor(pp) + 1);
                System.out.println("Output = Budi akan pulang pergi sebanyak " + ppfinal+ " kali");
                }
                else if (sisa == 0)
                {
                System.out.println("Output = Budi akan pulang pergi sebanyak " + pp + " kali");
                }
        }
    }
}

