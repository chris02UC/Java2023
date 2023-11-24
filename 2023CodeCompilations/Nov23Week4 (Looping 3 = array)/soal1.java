import java.util.Scanner;
import java.util.ArrayList;

public class soal1 {
public static void main(String[] args) {
int a = 0;
    int input;
    String [] judul;
    judul = new String[999999];
    int []harga;
    harga = new int [999999];
    int [] jumlah;
    jumlah = new int [999999];
    int [] subtotal;
    subtotal = new int [999999];
while (true){
try{
Scanner s = new Scanner(System.in);
int total = 0;
int b = 0;
    System.out.println("Welcome to toko sayur");
    System.out.println("======================");
    System.out.println("Please select your option");
    System.out.println("0.finish");
    System.out.println("1.add belanja");
    System.out.println("2.show belanja");
    input = s.nextInt();
    while (input < 0 || input > 2){
        System.out.println("Input invalid, try again!");
        input = s.nextInt();
    }

    if (input == 0){
        System.out.println("Selamat tinggal");
        break;
    }
    else if (input == 1){
        System.out.println("Masukkan judul");
        judul[a] = s.next()+s.nextLine();
        System.out.println("Masukkan harga");
        harga[a] = s.nextInt();
        while (harga[a] < 0){
        System.out.println("Input invalid, coba lagi!");
        System.out.println("Masukkan harga");
        harga[a] = s.nextInt();        
        }
        System.out.println("Masukkan jumlah");
        jumlah[a] = s.nextInt();
        while (jumlah[a] < 0){
        System.out.println("Input invalid, coba lagi!");
        System.out.println("Masukkan jumlah");
        jumlah[a] = s.nextInt();        
        }
        a++;
    }
    else if (input == 2){
        System.out.println(a);
        System.out.println("No\tjudul\tharga\tjumlah\tsubtotal");
        for (int c = 0; c < a; c++){
        subtotal [c] = harga[c]*jumlah[c];
        System.out.print((c+1)+"."+"\t"+judul[c]+"\t"+harga[c]+"\t"+jumlah[c]+"\t"+subtotal[c]);
        System.out.println("");
        } 
        for (int c = 0; c < a; c++){
        b = subtotal[c]+b;
        total = b;
        }
    System.out.println("Total = "+total);     
    }
} catch (Exception e) {
System.out.println("Input invalid, restarting....");
}
}
}
}
