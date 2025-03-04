import java.util.Scanner;
public class soal3 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int [][]jumlah = new int[100][3];
    String []nama = new String [100];
    int pilih;
    int barang = 0;
    int a = 0;

    while(true){
    System.out.println("-----------------------------------------------");
    System.out.println("Stock Barang Perusahaan Killjoy");
    System.out.println("-----------------------------------------------");
    System.out.println("Menu: ");
    System.out.println("1. Tambah Barang");
    System.out.println("2. List Barang");
    System.out.println("3. Exit");
    System.out.print("Pilih: ");
    pilih = s.nextInt();
        while (pilih < 1 || pilih > 3){
        System.out.println("Pilihan hanya bisa 1, 2 , atau 3!");
        System.out.print("Pilih: ");
        pilih = s.nextInt();
        }
    if (pilih == 1){
    System.out.println("-----------------------------------------------");
        System.out.print("Nama barang: ");
        nama[a] = s.next()+s.nextLine();
            System.out.print("Jumlah Barang: ");
        jumlah[a][0] = s.nextInt();
        while (jumlah[a][0] <= 0){
        System.out.println("Jumlah Barang Invalid!");
        System.out.print("Jumlah Barang: ");
        jumlah[a][0] = s.nextInt();        
        }
            System.out.print("Harga Barang: ");
        jumlah[a][1] = s.nextInt();
        while (jumlah[a][1] < 0){
        System.out.println("Harga Invalid!");
        System.out.print("Harga Barang: ");
        jumlah[a][1] = s.nextInt();        
        }
        jumlah [a][2] = jumlah [a][0] * jumlah [a][1];
    a++;
    barang++;
    }
    else if (pilih == 2){
    System.out.println("-----------------------------------------------");
    System.out.println("List Barang Perusahaan Killjoy");
    System.out.println("-----------------------------------------------");
        for (int b = 0; b < barang; b++){
        System.out.println((b+1)+". "+nama[b]+" "+jumlah[b][0]+" "+jumlah[b][1]+" "+jumlah[b][2]);
        }
    }
    else if (pilih == 3){
    System.out.println("Exiting program......");
    break;
    }
    }
break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}
}
