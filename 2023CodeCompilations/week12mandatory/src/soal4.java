import java.util.Scanner;
public class soal4 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int menu;
    int [][]layout;
    int [][]hari;
    int [][]sewa;
    int [][]occupied;
    int nokamar;
    int berlalu;
    String [][]layoutString;
    String [][]layoutStringtemp;
    String [][]nama;
    String [][]daerah;
    layout = new int[5][2];
    hari = new int[5][2];
    sewa = new int[5][2];
    occupied = new int[5][2];
    layoutString = new String[5][2];
    layoutStringtemp = new String[5][2];
    nama = new String[5][2];
    daerah = new String[5][2];
    int z = 1;
    for (int a = 0; a < 5; a++){
        for (int b = 0; b < 2; b++){
        layout[a][b] = z;
        layoutString[a][b] = String.valueOf(layout[a][b]);
        occupied[a][b] = 0;
        z++;
        }
    }
    
    while (true){
    System.out.println("============================");
    System.out.println("Selamat datang di program Kos Sasa");
    System.out.println("\t1. Tambah penyewa");
    System.out.println("\t2. Simulasi pendapatan");
    System.out.print("Pilih menu: ");
    menu = s.nextInt();
    while (menu < 1 || menu > 2){
    System.out.println("Input hanya bisa pilihan 1 atau 2!");
    System.out.print("Pilih menu: ");
    menu = s.nextInt();    
    }
    if (menu == 1){
        System.out.println("");
        System.out.println("== TAMBAH PENYEWA ==");
        System.out.println("Kamar yang sudah dibooking");
        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 2; b++){
            System.out.print("["+layoutString[a][b]+"] ");
        }
        System.out.println("");
        }
    System.out.print("Masukkan nomor kamar: ");
    nokamar = s.nextInt();
    while (nokamar < 1 || nokamar > 10){
        System.out.print("Nomor kamar hanya 1-10! Masukkan nomor kamar: ");
        nokamar = s.nextInt();
    }
    for (int a = 0; a < 5; a++){
        for (int b = 0; b < 2; b++){
        if (layout[a][b]==nokamar){
            if (occupied [a][b] == 0){
            System.out.print("Nama penyewa: ");
            nama[a][b] = s.next()+s.nextLine();
            System.out.print("Asal daerah: ");
            daerah[a][b] = s.next()+s.nextLine();
            System.out.print("Lama menyewa: ");
            hari[a][b] = s.nextInt();
            while (hari[a][b] <=0){
                System.out.print("Inputan lama menyewa invalid! Lama menyewa: ");
                hari[a][b] = s.nextInt();                
            }
            sewa[a][b] = hari[a][b] * 100000;
            System.out.println("Data berhasil disimpan! ");
            System.out.println(nama[a][b]+" di kamar nomor "+nokamar+".");
            System.out.println("Total sewa "+nama[a][b]+" Rp. "+sewa[a][b]);
            char fl = nama[a][b].charAt(0);
            String fl2 = String.valueOf(fl);
            layoutString[a][b] = fl2;
            occupied [a][b] = 1;
            }
            else if (occupied[a][b] == 1){
            System.out.println("Kamar telah disewa!");
            }
        }
        }
    }
    }
    else if (menu == 2){
        System.out.println("");
        System.out.println("== SIMULASI PENDAPATAN ==");
        System.out.println("Kamar yang sudah dibooking");
        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 2; b++){
            layoutStringtemp[a][b] = layoutString[a][b];
            System.out.print("["+layoutStringtemp[a][b]+"] ");
        }
        System.out.println("");
        }
    System.out.print("Masukkan jumlah hari yang sudah berlalu: ");
    berlalu = s.nextInt();
    while (berlalu <= 0){
        System.out.println("Invalid input!");
    System.out.print("Masukkan jumlah hari yang sudah berlalu: ");
    berlalu = s.nextInt();        
    }
    int haritotal = 0;
    int temp = 0;
    System.out.println("** INFORMASI CHECKOUT **");
    for (int a = 0; a < 5; a++){
        for (int b = 0; b < 2; b++){
            if (!String.valueOf(layout[a][b]).equalsIgnoreCase(layoutStringtemp[a][b])){
                if (berlalu >= hari[a][b]){
                System.out.println(nama[a][b]+" checkout!");
                layoutStringtemp[a][b] = String.valueOf(layout[a][b]);
                haritotal = hari[a][b] + haritotal;
                temp++;
                }
                else if (berlalu < hari[a][b]){
                haritotal = berlalu + haritotal;
                }
            }
        }
    }
    if (temp == 0){
        System.out.println("Tidak ada yang checkout!");
        haritotal = haritotal * 100000;
        System.out.println("Jumlah pendapatan: Rp. "+haritotal);        
    }
    else {
        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 2; b++){
            System.out.print("["+layoutStringtemp[a][b]+"] ");
        }
        System.out.println("");
        }
    haritotal = haritotal * 100000;
    System.out.println("Jumlah pendapatan: Rp. "+haritotal);
    }
    }
    }

} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}

private static String String(char firstletter) {
    return null;
}
}
