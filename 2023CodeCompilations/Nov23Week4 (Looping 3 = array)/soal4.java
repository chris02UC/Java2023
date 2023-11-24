import java.util.Scanner;
public class soal4 {
public static void main(String[] args) {
    int input;
    String []nama;
    nama = new String[9999999];
    int []umur;
    umur = new int[9999999];
    String [] ts;
    ts = new String[9999999];
    int [] bb;
    bb = new int [9999999];
    int [] pdpt;
    pdpt = new int [9999999];
    int a = 0;
while (true){
try{
int z = 0;
int total = 0;
String temp = "";
String namas = "";
Scanner s = new Scanner(System.in);
    System.out.println("===== BIMBEL KEVIN ======");
    System.out.println("=== DIJAMIN JAGO KODING ===");
    System.out.println("1. Daftar Murid Baru");
    System.out.println("2. Total Pendapatan per Bulan");
    System.out.println("3. Tampilkan Semua Daftar Murid"); 
    System.out.println("4. Cari Murid");
    System.out.println("5. Keluar");
    System.out.print("Pilih menu (1-5): ");
    input = s.nextInt();
    while (input < 1 || input > 5){
    System.out.println("Input invalid, coba lagi!");
    System.out.print("Pilih menu (1-5): ");
    input = s.nextInt();    
    }

    if (input == 1){
        if (a == 20){
        System.out.println("Daftar murid full!");
        continue;
        }
    System.out.println("=== DAFTAR MURID BARU ===");
    System.out.print("Nama: ");
    nama[a] = s.next()+s.nextLine();
    System.out.print("Umur (15-19 tahun): ");
    umur[a] = s.nextInt();
    while (umur[a] < 15 || umur[a] > 19){
    System.out.println("Umur minimal 15 dan maksimal 19!");
    System.out.print("Umur (15-19 tahun): ");
    umur[a] = s.nextInt();    
    }
    System.out.print("Tingkat Sekolah: ");
    ts[a] = s.next()+s.nextLine();
    System.out.println("Pilih Bidang belajar: ");
    System.out.println("1. Semua Dasar Programming");
    System.out.println("2. Full-Stack Developer");
    System.out.println("3. Artificial Intelligence");
    bb[a] = s.nextInt();
    while (bb[a] < 1 || bb[a] > 3){
    System.out.println("Input hanya bisa 1 sampai 3!");
    System.out.print("Pilih Bidang belajar: "); 
    bb[a] = s.nextInt();   
    }
        if (umur[a] == 15){
        pdpt[a] = 100000;
        }
        else if (umur [a] == 16){
        pdpt[a] = 120000;
        }
        else if (umur [a] == 17){
        pdpt[a] = 130000;
        }
        else if (umur[a] == 18){
        pdpt[a] = 140000;
        }
        else if (umur[a] == 19){
        pdpt[a] = 190000;
        }
    System.out.println("Murid baru berhasil ditambahkan!");
    a++;
    continue;
    }

    else if (input == 2){
    for (int b = 0; b < a; b++ ){
    z = pdpt[b] + total;
    total = z;
    }
    System.out.println("Total pendapatan per bulan: Rp "+total);
    continue;
    }

    else if (input == 3){
    System.out.println("=== DAFTAR SEMUA MURID ===");
    for (int b = 0; b < a; b++){
        if (bb[b] == 1){
        temp = "Semua Dasar Programming";
        }
        else if (bb[b] == 2){
        temp = "Full-Stack Developer";
        }
        else if (bb[b] == 3){
        temp = "Artificial Intelligence";
        }
    System.out.println("Nama: "+nama[b]+", Umur: "+umur[b]+", Tingkat Sekolah: "+ts[b]+", Bidang Belajar: "+temp);
    }
    continue;
    }
    else if (input == 4){
    System.out.println("=== CARI MURID ===");
    System.out.print("Masukkan nama murid: ");
    namas = s.next()+s.nextLine();
    int index = -1;
        for (int d = 0; d < a; d++){
            if (nama[d].equalsIgnoreCase(namas)){
            index = d;
            }
        }
    if (index == -1){
    System.out.println("Murid tidak ditemukan!");
    continue;
    }
    else {
    System.out.println("Informasi Murid: ");
        if (bb[index] == 1){
        temp = "Semua Dasar Programming";
        }
        else if (bb[index] == 2){
        temp = "Full-Stack Developer";
        }
        else if (bb[index] == 3){
        temp = "Artificial Intelligence";
        }
    System.out.println("Nama: "+nama[index]+", Umur: "+umur[index]+", Tingkat Sekolah: "+ts[index]+", Bidang Belajar: "+temp);
    }
    }
    else if (input == 5){
        System.out.println("Terima kasih!");
        break;
    }


} catch (Exception e){
System.out.println("Input error, restarting....");
}
}    
}
}
