import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {

            int uang_saku;
            Scanner scan = new Scanner(System.in);
            System.out.print("Input uang saku bulanan dalam rupiah: ");
            uang_saku = scan.nextInt();
            
            double uang_merch;
            uang_merch = uang_saku * 0.2;
            
            double uang_kurang;
            double merch_NJ;
            double merch_17;
        
            if (uang_saku < 0){
                System.out.println("Error: Gaji Luna minus!");
            }
           
            else if (uang_saku == 0) {
                System.out.println("Error: Gaji Luna 0!");
            }

            else {
                if (uang_merch < 100000)
                 {
                uang_kurang = 100000 - uang_merch;
                System.out.println("Uang saku bulanan: " + uang_saku);
                System.out.println("Total uang merchandise: " + uang_merch);
                System.out.println("Uang kurang " + uang_kurang + "!");
                }
                else if (uang_merch >= 100000)
                {
                merch_NJ = uang_merch * 0.3;
                merch_17 = uang_merch * 0.7;
                System.out.println("Uang saku bulanan: " + uang_saku);
                System.out.println("Total uang merchandise: " + uang_merch);
                System.out.println("Uang merch Seventeen: " + merch_17);
                System.out.println("Uang merch New Jeans: " + merch_NJ);
            }
    }
    }
}
