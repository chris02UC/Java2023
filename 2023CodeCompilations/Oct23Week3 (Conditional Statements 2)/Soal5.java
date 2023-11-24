import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
    while (true){
    try{
    Scanner baj = new Scanner(System.in);
    System.out.println("=====");
    System.out.println("INPUT");
    System.out.println("=====");

    int s;
    int xl;
    int sisas;
    int sisaxl;
    String cust;
    int sfinal;
    int xlfinal;
    int hrgfinal;
    double disc;

    System.out.println("Selamat datang di Maddy Shop.");
    System.out.print("Masukkan jumlah baju ukuran S yang terjual: ");
    s = baj.nextInt();
    while (s < 0){
    System.out.println("Input invalid: Input baju tidak boleh minus!");
    System.out.print("Masukkan jumlah baju ukuran S yang terjual: ");
    s = baj.nextInt();
    }
    System.out.print("Masukkan jumlah baju XL yang terjual: ");
    xl = baj.nextInt();
    while (xl < 0){
    System.out.println("Input invalid: Input baju tidak boleh minus!");
    System.out.print("Masukkan jumlah baju ukuran XL yang terjual: ");
    xl = baj.nextInt();
    }   
    System.out.print("Masukkan nama pembeli: ");
    cust = baj.next()+baj.nextLine();
    while (!cust.matches("^[a-zA-z\\s]*$")){
        System.out.print("Input nama yang sesuai! Input nama: ");
        cust = baj.nextLine();
        }
    
    if ( s>120 || xl>80){
        System.out.println("=====");
        System.out.println("OUTPUT");
        System.out.println("=====");
        System.out.println("Maaf, stok habis atau kurang.");
        System.exit(0);
    }
    else if (s == 0 && xl == 0){
        System.out.println("=====");
        System.out.println("OUTPUT");
        System.out.println("=====");
        System.out.println("Penjualan gagal karena tidak ada baju yang terjual!");
        System.exit(0);
    }
    else if (s <= 120 &&  xl <= 80){
        sisas = 120 - s;
        sisaxl = 80 - xl;
        sfinal = s * 50000;
        xlfinal = xl * 70000;
        hrgfinal = sfinal + xlfinal;
        if (cust.equalsIgnoreCase("maddy") || cust.equalsIgnoreCase("joko")){
            disc = (double)hrgfinal * 0.8;
            System.out.println("=====");
            System.out.println("OUTPUT");
            System.out.println("=====");
            System.out.println("Penjualan berhasil! Total penjualan: Rp "+(int)disc);
            System.out.println("Sisa stok baju: ");
            System.out.println("Ukuran S: "+sisas);
            System.out.println("Ukuran XL: "+sisaxl);
            System.exit(0);
        }
        else {
            System.out.println("=====");
            System.out.println("OUTPUT");
            System.out.println("=====");
            System.out.println("Penjualan berhasil! Total penjualan: Rp "+hrgfinal);
            System.out.println("Sisa stok baju: ");
            System.out.println("Ukuran S: "+sisas);
            System.out.println("Ukuran XL: "+sisaxl);
            System.exit(0);
        }
    }
    } catch (Exception e){
    System.out.println("Input invalid, try again!");
    }
    }
    }
}
