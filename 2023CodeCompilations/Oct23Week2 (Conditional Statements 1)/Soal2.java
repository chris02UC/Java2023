import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        
        int bil_pertama;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bilangan pertama: ");
        bil_pertama = scan.nextInt();

        int bil_kedua;
        System.out.print("Bilangan kedua: ");
        bil_kedua = scan.nextInt();

        int bil_final = bil_pertama * bil_kedua;
        System.out.println(bil_pertama + " x " + bil_kedua + " = " + bil_final);

    }
}
