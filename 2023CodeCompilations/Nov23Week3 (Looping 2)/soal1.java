import java.util.Scanner;
public class soal1 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int input;
    int tengaha = 1; //tengah atas
    int tengahb = 1; //tengah bawah
    System.out.print("Input jumlah = ");
    input = s.nextInt();
    while (input <4){
    System.out.println("Input minimal 4, coba lagi!");
    System.out.print("Input jumlah = ");
    input = s.nextInt();    
    }
    //uptri
    for (int a = 1; a< input; a++){
        if (a == 1){
        for (int space = 1; space <= input - a; space++){
        System.out.print(" ");
        }
        System.out.print("*");
        //System.out.println("");
        }
        else {
        for (int space = 1; space <= input - a; space++){
        System.out.print(" ");
        }
        System.out.print("*");
        for (int tengah = 1; tengah <= (a-1)*2 -1; tengah++){
            System.out.print(" ");
            }
        System.out.print("*");
        }
    System.out.println("");
    }
    //baris
    for (int a = 1; a <= input*2 - 1; a++){
    System.out.print("*");
    }
    System.out.println("");
    for (int a = 1; a<= input; a++){
    System.out.print("**");
        if (a == 1 || a == input){
        for (int b = 1; b <= (input*2 - 1)-4; b++){
        System.out.print("=");
        }
        System.out.print("**");
        }
        else {
        System.out.print("=");
        for (int b = 1; b <= (input*2 - 1)-6; b++){
        System.out.print(" ");
        }
        System.out.print("=**");        
        }
    System.out.println("");
    }
    //bawah
    for (int a = 1; a <= input*2 - 1; a++){
    System.out.print("*");
    }
    System.out.println("");
    //downtri
    for (int a = input-1; a >= 1; a--){
        if (a == 1){
        for (int space = 1; space <= input - a; space++){
        System.out.print(" ");
        }
        System.out.print("*");
        //System.out.println("");
        }
        else {
        for (int space = 1; space <= input - a; space++){
        System.out.print(" ");
        }
        System.out.print("*");
        for (int tengah = 1; tengah <= (a-1)*2 -1; tengah++){
            System.out.print(" ");
            }
        System.out.print("*");
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
