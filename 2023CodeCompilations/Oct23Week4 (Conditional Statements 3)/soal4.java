import java.util.Scanner;
public class soal4 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    String cust;
    String ket;
    int jam;
    double harganodisc;
    double hargadisc;
    double total;
    double bayar;
    double kembali;

System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("Warnet Gaming Richard");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.print("Nama pengunjung: ");
cust = s.next()+s.nextLine();
while (!cust.matches("^[a-zA-z\\s]*$")){
System.out.print("Input nama pengujung yang sesuai! Nama pengunjung: ");
cust = s.next()+s.nextLine();
}
System.out.print("Keterangan: ");
ket = s.next()+s.nextLine();
while (!ket.equalsIgnoreCase("Umum") && !ket.equalsIgnoreCase("Member")){
System.out.print("Keterangan hanya bisa Umum atau Member! Keterangan: ");
ket = s.next()+s.nextLine();
}
System.out.print("Jam sewa: ");
jam = s.nextInt();
while (jam <= 0){
    if (jam < 0){
    System.out.print("Jam sewa tidak boleh minus! Jam sewa: ");
    jam = s.nextInt();
    }
    else if (jam == 0){
    System.out.print("Jam sewa 0! Apakah anda tidak niat sewa? Jam sewa: ");
    jam = s.nextInt();
    }
}

if (jam < 3){
    if (ket.equalsIgnoreCase("Umum")){
    harganodisc = jam * 5000;
    total = harganodisc;
    System.out.println("Harga sebelum diskon: "+(int)total);
    System.out.println("Diskon yang diperoleh: 0");
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }
    if (ket.equalsIgnoreCase("Member")){
    harganodisc = jam * 4000;
    total = harganodisc;
    System.out.println("Harga sebelum diskon: "+(int)total);
    System.out.println("Diskon yang diperoleh: 0");
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }    
}
else if (jam >= 3 && jam < 5){
    if (ket.equalsIgnoreCase("Umum")){
    harganodisc = jam * 5000;
    hargadisc = harganodisc * 0.3;
    total = harganodisc * 0.7;
    System.out.println("Harga sebelum diskon: "+(int)harganodisc);
    System.out.println("Diskon yang diperoleh: "+(int)hargadisc);
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }
    if (ket.equalsIgnoreCase("Member")){
    harganodisc = jam * 4000;
    hargadisc = harganodisc * 0.3;
    total = harganodisc * 0.7;
    System.out.println("Harga sebelum diskon: "+(int)harganodisc);
    System.out.println("Diskon yang diperoleh: "+(int)hargadisc);
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }    
}
else if (jam >= 5){
    if (ket.equalsIgnoreCase("Umum")){
    harganodisc = jam * 5000;
    hargadisc = harganodisc * 0.5;
    total = harganodisc * 0.5;
    System.out.println("Harga sebelum diskon: "+(int)harganodisc);
    System.out.println("Diskon yang diperoleh: "+(int)hargadisc);
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }
    if (ket.equalsIgnoreCase("Member")){
    harganodisc = jam * 4000;
    hargadisc = harganodisc * 0.5;
    total = harganodisc * 0.5;
    System.out.println("Harga sebelum diskon: "+(int)harganodisc);
    System.out.println("Diskon yang diperoleh: "+(int)hargadisc);
    System.out.println("Total pembayaran: "+(int)total);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.print("Uang bayar: ");
    bayar = s.nextDouble();
    while (bayar < total){
    System.out.println("Uang anda tidak cukup untuk membayar!");
    System.exit(0);
    }
    kembali = bayar - total;
    System.out.println("Uang kembali: "+(int)kembali);
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println("Terima kasih !!!");
    System.exit(0);
    }    
}


} catch (Exception e){
System.out.println("Input invalid, try again!");
}
} 
}
}

