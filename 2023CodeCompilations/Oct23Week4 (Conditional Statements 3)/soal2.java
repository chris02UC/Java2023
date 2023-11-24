import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
    while (true){
    try{
    Scanner f = new Scanner(System.in);
    String name;
    int tanggal;
    String bulan;
    int tahun;
    String yesno;

    System.out.print("Nama: ");
    name = f.next()+f.nextLine();
    while (!name.matches("^[a-zA-z\\s]*$")){
    System.out.print("Nama invalid, coba lagi! Nama: ");
    name = f.next()+f.nextLine();
    }
    System.out.print("Tanggal lahir: ");
    tanggal = f.nextInt();
    while (tanggal <= 0 || tanggal > 31){
    System.out.print("Tanggal inputan invalid, coba lagi! Tanggal lahir: ");
    tanggal = f.nextInt();
    }
    System.out.print("Bulan lahir: ");
    bulan = f.next()+f.nextLine();
    while (!bulan.matches("[a-zA-z]+")){
    System.out.print("Masukkan bulan lahir yang wajar! Bulan lahir: ");
    bulan = f.next()+f.nextLine();    
    }
    while (bulan.equalsIgnoreCase("April") || bulan.equalsIgnoreCase("Juni") || bulan.equalsIgnoreCase("September") || bulan.equalsIgnoreCase("November")) {
        if (tanggal == 31){
        System.out.println("Error: Tanggal 31 tidak ada di bulan yang diinput!");
        System.exit(0);
        }
        else{
        break;
        }
    }
    while (bulan.equalsIgnoreCase("Februari")){
        if (tanggal > 29){
        System.out.println("Error: Tanggal Februari maksimal 29!");
        System.exit(0);
        }
        else if (tanggal == 29) {
        System.out.println("Note: Pastikan tahun inputan anda tahun kabisat!");
        break;
        }
        else {
        break;
        }
        }

    System.out.print("Tahun lahir: ");
    tahun = f.nextInt();
    while (bulan.equalsIgnoreCase("Februari") && tanggal == 29){
        if (tahun == 1932 || tahun == 1936 || tahun == 1940 || tahun == 1944 || tahun == 1948 || tahun == 1952 || tahun == 1956 || tahun == 1960 || tahun == 1964 || tahun == 1968 || tahun == 1972 || tahun == 1976 || tahun == 1980 || tahun == 1984 || tahun == 1988 || tahun == 1992 || tahun == 1996 || tahun == 2000 || tahun == 2004 || tahun == 2008 || tahun == 2012 || tahun == 2016 || tahun == 2020){
        break;
        }
        else {
        System.out.println("Error: Tahun yang di input bukan tahun kabisat!");
        System.exit(0);
        }
    }
    while (tahun < 1930 || tahun > 2023){
    System.out.print("Masukkan tahun lahir yang wajar! Tahun lahir: ");
    tahun = f.nextInt();
    }
    System.out.print("Apakah anda menguasai bahasa pemrograman Java? (Y/N): ");
    yesno = f.next()+f.nextLine();
    while (!yesno.equalsIgnoreCase("Y")  && !yesno.equalsIgnoreCase("N")) {
    System.out.print("Input hanya bisa Y/N! Input: ");
    yesno = f.next()+f.nextLine();
    }

    if ((bulan.equalsIgnoreCase("Agustus") && tanggal >= 23 && tanggal <=31 && yesno.equalsIgnoreCase("Y") && tahun >= 1993 && tahun <= 2005) || (bulan.equalsIgnoreCase("September") && tanggal >= 1 && tanggal <= 22 && yesno.equalsIgnoreCase("Y") && tahun >= 1993 && tahun <= 2005)){
    System.out.println("Selamat, "+name+"! Anda termasuk kriteria kami.");
    System.exit(0);
    }
    else if ((bulan.equalsIgnoreCase("Agustus") && tanggal >= 23 && tanggal <=31 && yesno.equalsIgnoreCase("n") && tahun >= 1993 && tahun <= 2005) || (bulan.equalsIgnoreCase("September") && tanggal >= 1 && tanggal <= 22 && yesno.equalsIgnoreCase("n") && tahun >= 1993 && tahun <= 2005)){
    System.out.println("Maaf "+name+", anda belum termasuk kriteria kami.");
    System.exit(0);
    }
    else if ((!bulan.equalsIgnoreCase("Agustus") && !bulan.equalsIgnoreCase("September")) || !(bulan.equalsIgnoreCase("Agustus") && tanggal >= 23 && tanggal <=31) || !(bulan.equalsIgnoreCase("September") && tanggal >= 1 && tanggal <= 22) ){
        if (tahun > 2005){
        System.out.println(name+", anda belum memenuhi syarat minimal umur untuk bekerja.");
        System.exit(0);            
        }
        else if (tahun < 1993){
        System.out.println(name+", anda tidak memenuhi standar maksimal kualifikasi umur kami.");
        System.exit(0);        
        }
        else {
        System.out.println(name+", anda tidak termasuk zodiak Virgo.");
        System.exit(0);
        }
    }

    } catch (Exception e){
    System.out.println("Input invalid, try again!");
    }
    }
    }
}
