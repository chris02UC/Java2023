import java.util.Scanner;
public class Extra2 {
    public static void main(String[] args) {
        
        double luas_meja;
        Scanner scan = new Scanner(System.in);
        System.out.print("Luas meja (m²): ");
        luas_meja = scan.nextDouble();

        double pi = 3.14;
        double diameter = 2 * (Math.sqrt(luas_meja/pi));

        if (luas_meja < 0) {
            System.out.println("Error: Luas meja minus!");
        }
        else if (luas_meja == 0) {
            System.out.println("Error: Luas meja 0 sehingga diameter 0!");
        }
        else {
            System.out.println("Diameter kayu (m): " + diameter);
        }

    }
}
