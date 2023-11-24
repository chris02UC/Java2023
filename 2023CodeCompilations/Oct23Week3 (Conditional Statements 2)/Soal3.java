import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
       while (true){
        try{
        Scanner score = new Scanner(System.in);

        double ujian;
        double tugas;
        String nama;
        double nilai;

        System.out.println("=== Input ===");
        System.out.print("Nama: ");
        nama = score.next()+score.nextLine();

       while (!nama.matches("^[a-zA-z\\s]*$")){
            System.out.println("Input invalid! Input nama tidak bisa memiliki nomor!");
            System.out.print("Input nama: ");
            nama = score.next()+score.nextLine();
        }
        
        System.out.print("Nilai ujian: ");
        ujian = score.nextDouble();
        while (ujian < 0 || ujian > 100){
            System.out.println("Error: Nilai ujian tidak bisa kurang dari 0 atau lebih dari 100!");
            System.out.print("Nilai ujian: ");
            ujian = score.nextDouble();
        }

        System.out.print("Nilai tugas: ");
        tugas = score.nextDouble();
        while (tugas < 0 || tugas > 100){
            System.out.println("Error: Nilai tugas tidak bisa kurang dari 0 atau lebih dari 100!");
            System.out.print("Nilai tugas: ");
            tugas = score.nextDouble();
        }

        nilai = (0.5*ujian) + (0.5*tugas);

        if (nilai >= 90 && nilai <= 100){
            System.out.println("=== Output ===");
            System.out.println("Nilai akhir "+nama+" adalah "+nilai+" dengan grade A.");
            System.exit(0);
        }
        else if (nilai >= 80 && nilai <= 89){
            System.out.println("=== Output ===");
            System.out.println("Nilai akhir "+nama+" adalah "+nilai+" dengan grade B.");
            System.exit(0);
        }
        else if (nilai >= 70 && nilai <= 79){
            System.out.println("=== Output ===");
            System.out.println("Nilai akhir "+nama+" adalah "+nilai+" dengan grade C.");
            System.exit(0);
        }
        else if (nilai >= 60 && nilai <= 86){
            System.out.println("=== Output ===");
            System.out.println("Nilai akhir "+nama+" adalah "+nilai+" dengan grade D.");
            System.exit(0);
        }
        else if (nilai <60){
            System.out.println("=== Output ===");
            System.out.println("Nilai akhir "+nama+" adalah "+nilai+" dengan grade E.");
            System.exit(0);
        }

        } catch (Exception e){
            System.out.println("Input invalid, try again!");
        }
       } 
    }
}
