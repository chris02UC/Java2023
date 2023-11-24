import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        while (true) {
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("=====");
        System.out.println("INPUT");
        System.out.println("=====");

        int tahun;
        int umur;
        int paspor;
        String atr;
        String ls;

        System.out.print("Tahun Kelahiran : ");
        tahun = scan.nextInt();
        while (tahun > 2023 || tahun < 1930){
            System.out.print("Inputan tahun ada invalid! Input tahun kelahiran: ");
            tahun = scan.nextInt();
        }

        System.out.print("Tahun Expired Paspor : ");
        paspor = scan.nextInt();
        while (paspor < 1950 || paspor > 2050){
            System.out.print("Inputan paspor ada invalid! Input tahun expired paspor: ");
            paspor = scan.nextInt();
        }
        
        System.out.print("Apakah memiliki atribut (Y/N) : ");
        atr = scan.next()+scan.nextLine();
        while (!atr.equalsIgnoreCase("Y")  && !atr.equalsIgnoreCase("N")) {
             System.out.print("Input hanya bisa Y/N! Input: ");
             atr = scan.next()+scan.nextLine();
         }

        System.out.print("Apakah memiliki lightstick (Y/N) : ");
        ls = scan.next()+scan.nextLine();
        while (!ls.equalsIgnoreCase("Y")  && !ls.equalsIgnoreCase("N")) {
             System.out.print("Input hanya bisa Y/N! Input: ");
             ls = scan.next()+scan.nextLine();
         }

        umur = 2023 - tahun;
        
        if (paspor <= 2023 || atr.equalsIgnoreCase("N") && ls.equalsIgnoreCase("N") || umur < 17) {
        System.out.println("=====");
        System.out.println("OUTPUT");
        System.out.println("=====");
        System.out.println("Mohon maaf anda belum lulus persyaratan.");
        System.exit(0);
        }
        else {
        System.out.println("=====");
        System.out.println("OUTPUT");
        System.out.println("=====");
        System.out.println("Selamat anda lolos persyaratan untuk membeli tiker konser!");    
        System.exit(0);        
        }





        } catch (Exception e){
            System.out.println("Input invalid, try again!");
        }
        }
    }
}
