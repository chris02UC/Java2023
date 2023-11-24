import java.util.Scanner;
public class soal3 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int input;
    int mod;
    System.out.print("Input tinggi: ");
    input = s.nextInt();
    while (input <= 0){
    System.out.println("Inputn invalid, try again!");
    System.out.print("Input tinggi: ");
    input = s.nextInt();
    }

    mod = input%2;

    if (mod == 1){
        if (input == 1){
        System.out.print("|\\|");
        break;
        }
        else {
        int dot = input - 4;
        //bagian atas
        for (int a = 1; a <= (input-1)/2 ;a++){
        System.out.print("|");
            if (a == 1){
            System.out.print("\\");
                for (int b = 1; b <= input - 2; b++){
                System.out.print(".");
                }
            System.out.print("/|");
            }
            else {
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("\\");
            for (int b = 1; b<= dot; b++){
            System.out.print(".");
            }
            dot = dot - 2;
            System.out.print("/");
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("|");
            }
            System.out.println("");
        }
        //tengah
        System.out.print("|");
        for (int a = 1; a <= (input-1)/2; a++){
        System.out.print(".");
        }
        System.out.print("\\");
        for (int a = 1; a <= (input-1)/2; a++){
        System.out.print(".");
        }
        System.out.println("|");
        //bawah
        int dot1 = 1;
        for (int a = (input-1)/2; a >= 1 ;a--){
        System.out.print("|");
            if (a == 1){
            System.out.print("/");
                for (int b = 1; b <= input - 2; b++){
                System.out.print(".");
                }
            System.out.print("\\|");
            }
            else {
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("/");
            for (int b = 1; b<= dot1; b++){
            System.out.print(".");
            }
            dot1 = dot1 + 2;
            System.out.print("\\");
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("|");
            }
            System.out.println("");
        }                
        break;
        }    
    }
    //nomor ganjil
    else if (mod == 0){
        if (input == 2){
        System.out.println("|\\/|");
        System.out.println("|/\\|");
        break;
        }
        else {
        int dot = input - 4;
        //bagian atas
        for (int a = 1; a <= input/2 ;a++){
        System.out.print("|");
            if (a == 1){
            System.out.print("\\");
                for (int b = 1; b <= input - 2; b++){
                System.out.print(".");
                }
            System.out.print("/|");
            }
            else {
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("\\");
            for (int b = 1; b<= dot; b++){
            System.out.print(".");
            }
            dot = dot - 2;
            System.out.print("/");
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("|");
            }
            System.out.println("");
        }
        //bawah
        int dot1 = 1;
        for (int a = input/2; a >= 1 ;a--){
        System.out.print("|");
            if (a == 1){
            System.out.print("/");
                for (int b = 1; b <= input - 2; b++){
                System.out.print(".");
                }
            System.out.print("\\|");
            }
            else {
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("/");
            for (int b = dot1; b> 1; b--){
            System.out.print(".");
            }
            dot1 = dot1 + 2;
            System.out.print("\\");
            for (int b = 1; b <= a - 1; b++){
            System.out.print(".");
            }
            System.out.print("|");
            }
            System.out.println("");
        }
        break;
        }        
    }
break;
} catch (Exception e) {
System.out.println("Input invalid, try again!");
} 
}   
}   
}

