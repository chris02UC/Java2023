import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        while (true){
        try{
        Scanner scan = new Scanner(System.in);
        int usia;
        int pk;

        System.out.print("Masukkan usia pekerja: ");
        usia = scan.nextInt();
        while (usia < 21 || usia > 75){
            System.out.println("Input invalid: Pekerja minimal 21 tahun dan maksimal 75 tahun!");
            System.out.print("Masukkan usia pekerja: ");
            usia = scan.nextInt();
            }

        System.out.print("Masukkan tahun pengalaman kerja: ");
        pk = scan.nextInt();
        while (pk < 0 || pk > 55 || pk > (usia-21)){
            System.out.println("Input invalid: Pengalaman kerja tidak bisa minus atau tidak sesuai dengan umur!");
            System.out.print("Masukkan tahun pengalaman kerja: ");
            pk = scan.nextInt();
            }

        if (usia < 30 && pk < 5){
            System.out.println("Kategori pekerja: Pemula");
            System.exit(0);
        }
        else if (usia >= 30 && pk < 5){
            System.out.println("Kategori pekerja: Junior");
            System.exit(0);
        }
        else if (usia >= 30 && pk >= 5){
            System.out.println("Kategori pekerja: Senior");
            System.exit(0);
        }
        else if (usia < 30 && pk >= 5){
            System.out.println("Kategori pekerja: Intermediate");
            System.exit(0);
        }

        
        } catch (Exception e){
        System.out.println("Input invalid, try again!");
        }
        }
    }
}
