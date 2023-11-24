import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        
        double ujian;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        ujian = scan.nextDouble();

        double quiz;
        System.out.print("Masukkan nilai quiz: ");
        quiz = scan.nextDouble();

        double tugas;
        System.out.print("Masukkan nilai tugas: ");
        tugas = scan.nextDouble();

        double ujian_final = ujian * 0.5;
        double quiz_final = quiz * 0.3;
        double tugas_final = tugas * 0.2;
        double nilai_final = ujian_final + quiz_final + tugas_final;

        if (ujian < 0 || quiz < 0 || tugas < 0 || ujian > 100 || quiz > 100 || tugas > 100) {
            System.out.print("Error: input nilai ada yang dibawah nol atau diatas 100!");
        }
        else {
        System.out.println("Nilai akhir murid ini adalah: " + nilai_final);
        }
    }
}
