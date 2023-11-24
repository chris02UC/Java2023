import java.util.Random;
import java.util.Scanner;

public class soal4 {
public static void main(String[] args) {
while (true){
try{
Scanner s = new Scanner(System.in);
Random r = new Random();
int lapar = r.nextInt(10);
int bosan = r.nextInt(10);
int tidur = r.nextInt(10);
int hari;
int pilih;

    System.out.println("===== Selamat datang di permainan Tamagotchi! =====");
    System.out.println("Aturan: ");
    System.out.println("1. Ada 3 skala: Lapar, Bosan, dan Tidur. Jika salah satu skala mencapai 10, Tamagotchi mati!");
    System.out.println("2. Ada 3 kegiatan yang dapat dilakukan per hari!");
    System.out.println("3. Kegiatan 1, Memberi Makan akan mengurangi skala Lapar sebesar 4 poin, tetapi akan menambah          skala Bosan sebesar 2 poin");
    System.out.println("4. Kegiatan 2, Bermain akan mengurangi skala Bosan sebesar 3 poin, tetapi akan menambah skala Lapar dan Tidur masing-masing sebesar 2 poin");
    System.out.println("5. Kegiatan 3, Tidur akan mengurangi skala Tidur sebesar 5 poin, tetapi akan menambah skala Lapar sebesar 3 poin");
    System.out.print("Input jumlah hari bermain: ");
    hari = s.nextInt();
    while (hari <= 0){
    System.out.println("Hari yang di input invalid! Coba lagi!");
    System.out.print("Input jumlah hari bermain: ");
    hari = s.nextInt();
    }

    System.out.println("  === Game Start! ===  ");
    for (int a = 1; a<=hari+1; a++){
        if (a == hari+1){
        System.out.println("Selamat! Kamu menang!");
        System.out.println("Tamagotchi masih hidup!");
        System.out.println(" === Game End === ");
        System.exit(0);
        }
    if (lapar <= 0){
    lapar = 0;
    }
    else if (bosan <= 0){
    bosan = 0;
    }
    else if (tidur <= 0){
    tidur = 0;
    }

    System.out.println(" === Hari ke - "+a+" ===");
    System.out.println("Lapar: "+lapar);
    System.out.println("Bosan: "+bosan);
    System.out.println("Tidur: "+tidur);
    System.out.println("Pilih kegiatan: ");
        for (int b = 1; b <= 3; b++){
        System.out.println("1. Makan // 2. Bermain // 3. Tidur");            
        System.out.print("Kegiatan "+b +" = ");
        pilih = s.nextInt();
            while (pilih < 1 || pilih > 3){
            System.out.print("Input kegiatan hanya 1, 2, atau 3! Kegiatan "+b+" : ");
            pilih = s.nextInt();
            }
            if (pilih == 1){
            System.out.println("Memberi makan Tamagotchi!");
            lapar = lapar - 4;
            bosan = bosan + 2;
                if (lapar <= 0){
                lapar = 0;
                }
                else if (bosan <= 0){
                bosan = 0;
                }
                else if (tidur <= 0){
                tidur = 0;
                }
            }
            else if (pilih == 2){
            System.out.println("Bermain dengan Tamagotchi!");
            bosan = bosan - 3;
            lapar = lapar + 2;
            tidur = tidur + 2;
                if (lapar <= 0){
                lapar = 0;
                }
                else if (bosan <= 0){
                bosan = 0;
                }
                else if (tidur <= 0){
                tidur = 0;
                }
            }
            else if (pilih == 3){
            System.out.println("Tamagotchi tidur!");
            tidur = tidur - 5;
            lapar = lapar + 3;
                if (lapar <= 0){
                lapar = 0;
                }
                else if (bosan <= 0){
                bosan = 0;
                }
                else if (tidur <= 0){
                tidur = 0;
                }
            }
                if (lapar <= 0){
                lapar = 0;
                }
                else if (bosan <= 0){
                bosan = 0;
                }
                else if (tidur <= 0){
                tidur = 0;
                }
                else if (lapar >= 10){
                lapar = 10;
                }
                else if (bosan >= 10){
                bosan = 10;
                }
                else if (tidur >= 10){
                tidur = 10;
                }                       
            System.out.println("Lapar: "+lapar);
            System.out.println("Bosan: "+bosan);
            System.out.println("Tidur: "+tidur);
            if (tidur >= 10 || lapar >= 10 || bosan >= 10){
            System.out.println("Tamagotchi mati!!");
            System.out.println("Tamagotchi berhasil hidup selama "+a+" hari.");
            System.out.println(" === Game End ===  ");
            System.exit(0);
            }
        }
    }
break;
} catch (Exception e) {
System.out.println("Input invalid, shutting down!");
break;
} 
}   
}   
}

