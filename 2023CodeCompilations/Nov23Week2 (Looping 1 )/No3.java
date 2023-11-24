import java.util.Scanner;
public class No3 {
public static void main(String[] args) {
while (true){
try{
Scanner s = new Scanner(System.in);
int sec;
String planet;
int sec1 = 0;


System.out.println("== I N P U T==");
System.out.print("Rocket menuju planet: ");
planet = s.next()+s.nextLine();
while (!planet.matches("^[a-zA-Z0-9 ]*$")){
System.out.print("Nama planet invalid! Rocket menuju planet: ");
planet = s.next()+s.nextLine();
}

System.out.print("Masukkan angka awal hitungan mundur: ");
sec = s.nextInt();
while (sec < 1){
System.out.println("Input angka invalid! Input angka awal hitungan mundur: ");
sec = s.nextInt();
}

System.out.println("== O U T P U T ==");
System.out.println("Hitungan mundur dimulai!");

while (sec > 0){
System.out.println(sec+" detik");
sec--;
}
System.out.println("Hitungan mundur selesai.");
System.out.println("Rocket berhasil menuju "+planet);
break;
} catch (Exception e){
System.out.println("Input invalid, shutting down...");
break;
}
}
}
}
