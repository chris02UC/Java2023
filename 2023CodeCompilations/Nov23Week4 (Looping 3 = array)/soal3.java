import java.util.Scanner;
public class soal3 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int jumlah;
    Long []nim;
    double []nilai;
    double rata = 0;

    System.out.println("=====");
    System.out.println("INPUT");
    System.out.println("=====");
    System.out.print("Masukkan jumlah mahasiswa anda : ");
    jumlah = s.nextInt();
    while (jumlah <= 0){
    System.out.println("Input invalid, coba lagi!");
    System.out.print("Masukkan jumlah mahasiswa anda : ");
    jumlah = s.nextInt();    
    }
    nim = new Long[jumlah];
    nilai = new double[jumlah];

    for (int a = 0; a < jumlah; a++){
    System.out.print("Masukkan NIM mahasiswa ke-"+(a+1)+" : ");
    nim[a] = s.nextLong();
    while (nim[a] <=  0){
    System.out.println("Input NIM Invalid!");
    System.out.print("Masukkan NIM mahasiswa ke-"+(a+1)+" : ");
    nim[a] = s.nextLong();    
    }
    }

    for (int b = 0; b < jumlah; b++){
        for (int c = b+1; c < jumlah; c++){ // compares 0 with 1 , 2 , 3, 4 , 5
        Long temp;
        if (nim[b] > nim[c]){
        temp = nim[b]; 
        nim[b] = nim[c];
        nim[c] = temp;  
        }
        }
    } 
    System.out.println("");

    for (int a = 0; a < jumlah; a++){
    System.out.print("Masukkan nilai mahasiswa dengan NIM "+String.format("%013d", nim[a])+" : ");
    nilai[a] = s.nextDouble();
    while (nilai[a] <=  0){
    System.out.println("Input nilai Invalid!");
    System.out.print("Masukkan nilai mahasiswa dengan NIM "+String.format("%013d", nim[a])+" : ");
    nilai[a] = s.nextDouble();    
    }
    }    

    System.out.println("=====");
    System.out.println("OUTPUT");
    System.out.println("=====");
    for (int a = 0; a < jumlah; a++){
    rata = rata + nilai[a];
    }
    rata = rata/jumlah;
    System.out.println("Nilai rata-rata adalah "+rata);
break;
} catch (Exception e){
System.out.println("Input error, restarting....");
}
}    
}
}
