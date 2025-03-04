import java.util.Scanner;
public class soal1 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    int msw;
    int mk;
    double [][]array;
    double []ratamsw;
    double []ratamk;
    double tempmsw;
    double tempmk;

    System.out.println("===== Input =====");
    System.out.print("Masukkan jumlah mahasiswa: ");
    msw = s.nextInt();
    while (msw <= 0){
    System.out.println("Invalid input, try again!");
    System.out.print("Masukkan jumlah mahasiswa: ");
    msw = s.nextInt();        
    }
    System.out.print("Masukkan jumlah mata kuliah: ");
    mk = s.nextInt();
    while (mk <= 0){
    System.out.println("Invalid input, try again!");
    System.out.print("Masukkan jumlah mata kuliah: ");
    mk = s.nextInt();        
    }
    array = new double[msw][mk]; 
    ratamsw = new double[msw];
    ratamk = new double[mk];
    for (int a = 0; a < msw; a++){
    System.out.println("Masukkan nilai untuk Mahasiswa "+(a+1)+" :");
        for (int b = 0; b < mk; b++){
        System.out.print("Nilai Mata Kuliah "+(b+1)+" : ");
        array[a][b]= s.nextDouble();
        while (array[a][b] > 100 || array[a][b] < 0){
        System.out.println("Invalid input, try again!");
        System.out.print("Nilai Mata Kuliah "+(b+1)+" : ");
        array[a][b]= s.nextDouble();        
        }
        }
    System.out.println("");
    }
    //rata mahasiswa
    for (int a = 0; a< msw; a++){
    tempmsw = 0;
        for (int b = 0; b < mk; b++){
        tempmsw = array[a][b] + tempmsw;
        }
    ratamsw[a] = tempmsw/mk;
    }
    //rata matkul
    for (int a = 0; a< mk; a++){
    tempmk = 0;
        for (int b = 0; b < msw; b++){
        tempmk = array[b][a] + tempmk;
        }
    ratamk[a] = tempmk/msw;
    }
    //print
    System.out.println("===== Output =====");
    for (int a = 0; a < msw; a++){
        System.out.println("Rata-rata nilai Mahasiswa "+(a+1)+": "+ratamsw[a]);
    }
    System.out.println("");    

    for (int a = 0; a < mk; a++){
        System.out.println("Rata-rata nilai Mata Kuliah "+(a+1)+": "+ratamk[a]);
    }

break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}
}
