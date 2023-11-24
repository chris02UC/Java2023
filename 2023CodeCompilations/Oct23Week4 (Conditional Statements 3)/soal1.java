import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
    while (true){
    try{
    Scanner l = new Scanner(System.in);
    String name;
    double berat;
    double beratt;
    double sisa;
    double mod;
    double diskon;
    double hargas;
    double hargat;
    double hfinal;

    System.out.println("=== Input ===");
    System.out.print("Nama Customer: ");
    name = l.next()+l.nextLine();
    while (!name.matches("^[a-zA-z\\s]*$")){
    System.out.print("Input name invalid, try again! Nama Customer: ");
    name = l.next()+l.nextLine();
    }
    System.out.print("Jumlah laundry (kg): ");
    berat = l.nextDouble();

    while (berat <= 0){
    if (berat < 0){
    System.out.print("Input invalid: Berat tidak bisa minus! Jumlah laundry (kg): ");
    berat = l.nextDouble();
    }
    else if (berat == 0){
    System.out.print("Apakah Anda tidak niat melakukan laundry? Jumlah laundry (kg): ");
    berat = l.nextDouble();
    }
    }

    sisa = berat - 3;
    mod = sisa % 1;

    if (mod >= 0.2){
    beratt = (int)berat + 1;
        if (beratt <= 3){
        System.out.println("=== Output ===");
        System.out.println("Total belajaan Anda 25000");
        System.out.println("Diskon: Rp 0");
        System.out.println("Total akhir belanjaan anda adalah Rp 25000");
        System.exit(0);
        }
        else if (beratt > 3 && beratt <= 4){
        System.out.println("=== Output ===");
        System.out.println("Total belajaan Anda 30000");
        System.out.println("Diskon: Rp 0");
        System.out.println("Total akhir belanjaan anda adalah Rp 30000");
        System.exit(0);
        }
        else if (beratt > 4 && beratt <= 9){
        System.out.println("=== Output ===");
            hargas = ((int)sisa + 1) * 5000;
            hargat = 25000 + hargas;
            diskon = hargat * 0.1;
            hfinal = hargat * 0.9;
            System.out.println("Total belanjaan Anda Rp "+(int)hargat);
            System.out.println("Diskon: Rp "+(int)diskon);
            System.out.println("Total akhir belanjaan anda adalah Rp "+(int)hfinal);
            System.exit(0);
            }
        else if (beratt >= 10){
        System.out.println("=== Output ===");
            hargas = ((int)sisa + 1) * 5000;
            hargat = 25000 + hargas;
            diskon = hargat * 0.2;
            hfinal = hargat * 0.8;
            System.out.println("Total belanjaan Anda Rp "+(int)hargat);
            System.out.println("Diskon: Rp "+(int)diskon);
            System.out.println("Total akhir belanjaan anda adalah Rp "+(int)hfinal);
            System.exit(0);      
        }
    }
    else if (mod < 0.2){
    beratt = (int)berat;
    if (beratt <= 3){
        System.out.println("=== Output ===");
        System.out.println("Total belajaan Anda 25000");
        System.out.println("Diskon: Rp 0");
        System.out.println("Total akhir belanjaan anda adalah Rp 25000");
        System.exit(0);
        }
        else if (beratt > 3 && beratt <= 4){
        System.out.println("=== Output ===");
        System.out.println("Total belajaan Anda 30000");
        System.out.println("Diskon: Rp 0");
        System.out.println("Total akhir belanjaan anda adalah Rp 30000");
        System.exit(0);
        }
        else if (beratt > 4 && beratt <= 9){
        System.out.println("=== Output ===");
            hargas = (int)sisa * 5000;
            hargat = 25000 + hargas;
            diskon = hargat * 0.1;
            hfinal = hargat * 0.9;
            System.out.println("Total belanjaan Anda Rp "+(int)hargat);
            System.out.println("Diskon: Rp "+(int)diskon);
            System.out.println("Total akhir belanjaan anda adalah Rp "+(int)hfinal);
            System.exit(0);
            }
        else if (beratt >= 10){
        System.out.println("=== Output ===");
            hargas = (int)sisa * 5000;           
            hargat = 25000 + hargas;
            diskon = hargat * 0.2;
            hfinal = hargat * 0.8;
            System.out.println("Total belanjaan Anda Rp "+(int)hargat);
            System.out.println("Diskon: Rp "+(int)diskon);
            System.out.println("Total akhir belanjaan anda adalah Rp "+(int)hfinal);
            System.exit(0);      
        }
    }

    } catch (Exception e){
    System.out.println("Input invalid, try again!");
    }
    }    
    }


}
