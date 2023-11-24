import java.util.Scanner;
public class No1 {
public static void main(String[] args) {
while (true){
try{
Scanner s = new Scanner(System.in);
int tahun;
int tahun1;
int keluar;
int keluar1;
int keluar2 = 0;
int rata;
int a = 0;

System.out.println("=====");
System.out.println("INPUT");
System.out.println("=====");
System.out.print("Jumlah tahun: ");
tahun = s.nextInt();
while (tahun < 1 || tahun > 50){
System.out.print("Jumlah tahun inputan Anda invalid! Jumlah tahun: ");
tahun = s.nextInt();
}

System.out.print("Tahun 1: ");
tahun1 = s.nextInt();
while (tahun1 < 1950 || tahun1 > 2023){
System.out.print("Input tahun anda invalid! Input tahun: ");
tahun1 = s.nextInt();
}

System.out.print("Pengeluaran: ");
keluar = s.nextInt();
while (keluar < 1) {
System.out.print("Input pengeluaran anda invalid! Pengeluaran: ");
keluar = s.nextInt();
}

for (a = 1; a <= (tahun-1); a++){
tahun1++;
System.out.println("Tahun "+(a+1)+" : "+tahun1);
System.out.print("Pengeluaran: " );
keluar1 = s.nextInt();
    while (keluar1 < 1){
    System.out.print("Error: Input invalid! Pengeluaran: ");
    keluar1 = s.nextInt();
    }
keluar2 = keluar1 + keluar2;
}
keluar2 = keluar2 + keluar;
//System.out.println(keluar2);
    if (a == tahun){
    System.out.println("=====");
    System.out.println("Output");
    System.out.println("=====");
    rata = keluar2 / tahun;
    System.out.println("Rata - rata: "+rata);
        if (rata < 6000000){
        System.out.println("Pengeluaran Anda hemat!");
        break;
        }
        else if (rata >= 6000000 && rata <= 12000000){
        System.out.println("Pengeluaran Anda normal!");
        break;
        }
        else if (rata > 12000000){
        System.out.println("Pengeluaran Anda boros!");
        break;
        }
    }
break;
} catch (Exception e){
System.out.println("Input invalid, shutting down..."); 
break;   
}
}
}
}
