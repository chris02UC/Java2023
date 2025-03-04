import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int pensiun;
    int menu;
    int hari = 0;
    int [][]array;
    int []total;
    int temp;

    System.out.println("-----------------------------------------------");
    System.out.println("Harvest Moon: Pak Richard Edition");
    System.out.println("-----------------------------------------------");
    System.out.print("Pensiun Berapa Hari: ");
    pensiun = s.nextInt();
    while (pensiun <= 0){
        System.out.println("Input hari invalid, coba lagi!");
        System.out.print("Pensiun Berapa Hari: ");
        pensiun = s.nextInt();        
    }
    array = new int[pensiun][4];

    while (hari < pensiun){
    total = new int[4];
    System.out.println("Menu: ");
    System.out.println("1. Mari Berkebun");
    System.out.println("2. Liat Hasil Berkebun");
    System.out.print("Pilih: ");
    menu = s.nextInt();
        while (menu != 1 && menu != 2){
            System.out.println("Input pilihan hanya bisa 1 atau 2!");
            System.out.print("Pilih: ");
            menu = s.nextInt();            
        }
    if (menu == 1){
        System.out.println("");
        System.out.println("-------------------DAY "+(hari+1)+"--------------------");
        System.out.println("Selamat Memulai Hari ^ ^");
        System.out.println("");
        System.out.print("Apel: ");
        array[hari][0] = s.nextInt();
        while (array[hari][0] < 0){
        System.out.println("Input buah invalid!");
        System.out.print("Apel: ");
        array[hari][0] = s.nextInt();            
        }

        System.out.print("Jeruk: ");
        array[hari][1] = s.nextInt();
        while (array[hari][1] < 0){
        System.out.println("Input buah invalid!");
        System.out.print("Jeruk: ");
        array[hari][1] = s.nextInt();            
        } 

        System.out.print("Pisang: ");
        array[hari][2] = s.nextInt();
        while (array[hari][2] < 0){
        System.out.println("Input buah invalid!");
        System.out.print("Pisang: ");
        array[hari][2] = s.nextInt();            
        } 

        System.out.print("Mangga: ");
        array[hari][3] = s.nextInt();
        while (array[hari][3] < 0){
        System.out.println("Input buah invalid!");
        System.out.print("Mangga: ");
        array[hari][3] = s.nextInt();            
        }
        if (hari == (pensiun-1)){
        hari++;
            System.out.println("----------------------------------------------");
            System.out.println("Good Bye Pak Richard T_T");
            System.out.println("-----------------------------------------------");
            System.out.println("");
            for (int a = 0; a < hari; a++){
                System.out.println("-------------------DAY "+(a+1)+"--------------------");
                System.out.println("Apel: "+array[a][0]);
            System.out.println("Jeruk: "+array[a][1]);
            System.out.println("Pisang: "+array[a][2]);
            System.out.println("Mangga: "+array[a][3]);
            }
            //total initialize
            for (int a = 0; a < 4; a++){
            temp = 0;
                for (int b = 0; b < hari; b++){
                temp = array[b][a] + temp;
                }
            total[a] = temp;
            }        
            System.out.println("---------Total---------");
            System.out.println("Apel: "+total[0]);
            System.out.println("Jeruk: "+total[1]);
            System.out.println("Pisang: "+total[2]);
            System.out.println("Mangga: "+total[3]);
            break;            
            }
        else{
        System.out.println("-----------------------------------------------");
        System.out.println("Pak Richard Kelelahan Dan Pingsan");
        System.out.println("-----------------------------------------------");
        }
    hari++;
    }
    else if (menu == 2){
    System.out.println("");
        for (int a = 0; a < hari; a++){
        System.out.println("-------------------DAY "+(a+1)+"--------------------");
        System.out.println("Apel: "+array[a][0]);
        System.out.println("Jeruk: "+array[a][1]);
        System.out.println("Pisang: "+array[a][2]);
        System.out.println("Mangga: "+array[a][3]);
        }
        //total initialize
        for (int a = 0; a < 4; a++){
        temp = 0;
            for (int b = 0; b < hari; b++){
            temp = array[b][a] + temp;
            }
        total[a] = temp;
        }        
        System.out.println("---------Total---------");
        System.out.println("Apel: "+total[0]);
        System.out.println("Jeruk: "+total[1]);
        System.out.println("Pisang: "+total[2]);
        System.out.println("Mangga: "+total[3]);
    System.out.println("-----------------------------------------------");
    System.out.println("Semangat Berkebun ^ ^");
    System.out.println("-----------------------------------------------");
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