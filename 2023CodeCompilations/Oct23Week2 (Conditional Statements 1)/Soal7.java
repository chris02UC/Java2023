import java.util.Scanner;
public class Soal7 {
    public static void main(String[] args) {
        //input
        System.out.println("Input");
        System.out.println("Kerajaan Dham: ");

        int D_Ksatria;
        Scanner scan = new Scanner(System.in);
            System.out.print("Ksatria: ");
            D_Ksatria = scan.nextInt();
        int D_Pemanah;
            System.out.print("Pemanah: ");
            D_Pemanah = scan.nextInt();
        int D_Penyihir;
            System.out.print("Penyihir: ");
            D_Penyihir = scan.nextInt();

        System.out.println("Kerajaan Miko: ");
        int M_Ksatria;
            System.out.print("Ksatria: ");
            M_Ksatria = scan.nextInt();
        int M_Pemanah;
            System.out.print("Pemanah: ");
            M_Pemanah = scan.nextInt();
        int M_Penyihir;
            System.out.print("Penyihir: ");
            M_Penyihir = scan.nextInt();

        int total_Dham = D_Ksatria + D_Pemanah + D_Penyihir;
        int total_Miko = M_Ksatria + M_Pemanah + M_Penyihir;

        int fksatria;
        int fpemanah;
        int fpenyihir;


        System.out.println("Output: ");
        if (D_Ksatria < 0 || D_Pemanah < 0 || D_Penyihir < 0 || M_Ksatria < 0 || M_Pemanah < 0 || M_Penyihir < 0) {
            System.out.println("Error: Input Pasukan tidak boleh ada yang minus!");
        }

        else {
        if (total_Dham == total_Miko)
        {
            System.out.println("Kedua kerajaan seimbang sehingga tidak ada yang menang atau kalah");
        }

        else if (total_Dham > total_Miko)
        {
            fksatria = D_Ksatria - M_Ksatria;
            fpemanah = D_Pemanah - M_Pemanah;
            fpenyihir = D_Penyihir - M_Penyihir; 
            System.out.println("Kerajaan Dham memenangkan pertempuran dengan sisa: ");
            System.out.println("- Ksatria: " + fksatria);
            System.out.println("- Pemanah: " + fpemanah);
            System.out.println("- Penyihir: " + fpenyihir);
            System.out.println("Kerajaan Miko kalah dalam pertempuran");
        }

         else if (total_Dham < total_Miko)
        {
            fksatria = M_Ksatria - D_Ksatria;
            fpemanah = M_Pemanah - D_Pemanah;
            fpenyihir = M_Penyihir - D_Penyihir; 
            System.out.println("Kerajaan Miko memenangkan pertempuran dengan sisa: ");
            System.out.println("- Ksatria: " + fksatria);
            System.out.println("- Pemanah: " + fpemanah);
            System.out.println("- Penyihir: " + fpenyihir);
            System.out.println("Kerajaan Dham kalah dalam pertempuran");
        }
    }   
        }

    }
