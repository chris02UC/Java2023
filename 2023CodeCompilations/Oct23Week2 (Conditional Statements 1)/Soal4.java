import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        
        double produksi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input biaya produksi per unit = ");
        produksi = scan.nextDouble();

        int unit_terjual;
        System.out.print("Input jumlah unit yang terjual = ");
        unit_terjual = scan.nextInt();

        double pemasaran = produksi * 0.1;
        double total_produksi = produksi + pemasaran;
        double harga_jual = produksi * 2;

        double tproduksi = unit_terjual * produksi;
        double tpemasaran = unit_terjual * pemasaran;
        double ttotal_produksi = unit_terjual * total_produksi;
        double tharga_jual = unit_terjual * harga_jual;

        double untung_rugi;

        if (produksi <= 0 || unit_terjual <= 0) {
            System.out.println("Error: Input user ada yang 0 atau dibawah 0!");
        }
        else {
            if (ttotal_produksi > tharga_jual) {
            untung_rugi = ttotal_produksi - tharga_jual;
            System.out.println("Biaya produksi per unit = Rp." + produksi);
            System.out.println("Biaya pemasaran per unit = Rp." + pemasaran);
            System.out.println("Total biaya produksi per unit = Rp." + total_produksi);
            System.out.println("Harga Jual per unit = Rp." + harga_jual);
            System.out.println("Total biaya produksi  = Rp." + tproduksi);
            System.out.println("Total biaya pemasaran = Rp." + tpemasaran);
            System.out.println("Total biaya produksi & pemasaran = Rp." + ttotal_produksi);
            System.out.println("Total Penjualan = Rp." + tharga_jual);

                untung_rugi = ttotal_produksi - tharga_jual;
                System.out.println("Budi mengalami kerugian kebanyak: Rp." + untung_rugi);
            }

            else if (tharga_jual > ttotal_produksi){
                untung_rugi = tharga_jual - ttotal_produksi;
            System.out.println("Biaya produksi per unit = Rp." + produksi);
            System.out.println("Biaya pemasaran per unit = Rp." + pemasaran);
            System.out.println("Total biaya produksi per unit = Rp." + total_produksi);
            System.out.println("Harga Jual per unit = Rp." + harga_jual);
            System.out.println("Total biaya produksi  = Rp." + tproduksi);
            System.out.println("Total biaya pemasaran = Rp." + tpemasaran);
            System.out.println("Total biaya produksi & pemasaran = Rp." + ttotal_produksi);
            System.out.println("Total Penjualan = Rp." + tharga_jual);
            System.out.println("Budi mengalami keuntungan sebanyak: Rp." + untung_rugi);
            }

            else if (tharga_jual == ttotal_produksi){
                System.out.println("Budi tidak untung maupun rugi");
            }
        }
    }
}

