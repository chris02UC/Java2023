import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int ang1;
    int ang2;

    System.out.println("=== Input ===");
    System.out.print("Input angka pertama: ");
    ang1 = s.nextInt();
    while (ang1 < 0){
    System.out.println("Input tidak bisa minus!");
    System.out.print("Input angka pertama: ");
    ang1 = s.nextInt();    
    }
    System.out.print("Input angka kedua: ");
    ang2 = s.nextInt();
    while (ang2 < 0){
    System.out.println("Input tidak bisa minus!");
    System.out.print("Input angka kedua: ");
    ang2 = s.nextInt();    
    }
 
    if (ang1 == 0 || ang2 == 0){
    System.out.println("=== Output ===");    
    System.out.println("Hasil perkalian 0!");
    System.exit(0);
    }

    System.out.println("=== Output ===");
    
    for (int a = 1; a <= ang2; a++){
        int angka = a;
        for (int b = 1; b<= ang1; b++){
        System.out.print(angka);
        System.out.print(" ");
        angka = angka + a;
        }
    System.out.println("");
    }

break;
} catch (Exception e) {
System.out.println("Input invalid, try again!");
} 
}   
}   
}
