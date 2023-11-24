import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        while (true){
            try {
               Scanner bea = new Scanner(System.in);

               String nama;
               int semester;
               double ips;
               String lomba = "";
               String pkm;
               double sisa;

               System.out.print("Nama: ");
               nama = bea.nextLine();

              while (!nama.matches("^[a-zA-z\\s]*$")){
                   System.out.println("Input invalid! Input nama yang sesuai!");
                   System.out.print("Input nama: ");
                   nama = bea.nextLine();
               }

               System.out.print("Semester: ");
               semester = bea.nextInt();
               while (semester == 8){
                   System.out.print("Semester 8 tidak bisa mengajukan beasiswa!");
                   System.exit(0);
               }
               while (semester < 1 || semester > 7) {
                   System.out.print("Semester minimal 1 maksimum 7! Input semester: ");
                   semester = bea.nextInt();
               }

               System.out.print("IPS: ");
               ips = bea.nextDouble();
               while (ips < 0.00  || ips > 4.00) {
                   System.out.print("IPS minimal 0 maksimum 4! Input IPS: ");
                   ips = bea.nextDouble();
               }

               System.out.print("Mengikuti Lomba (Y/N): ");
               lomba = bea.next()+bea.nextLine();
               while (!lomba.equalsIgnoreCase("Y")  && !lomba.equalsIgnoreCase("N")) {
                    System.out.print("Input hanya bisa Y/N! Input: ");
                    lomba = bea.next()+bea.nextLine();
                }

               System.out.print("Mengikuti PKM (Y/N): ");
               pkm = bea.next()+bea.nextLine();
               while (!pkm.equalsIgnoreCase("Y")  && !pkm.equalsIgnoreCase("N")) {
                    System.out.print("Input hanya bisa Y/N! Input: ");
                    pkm = bea.next()+bea.nextLine();
                }

               //output
                if (ips >= 3.50 && lomba.equalsIgnoreCase("Y") && pkm.equalsIgnoreCase("Y")) {
                    System.out.println("Congrats " + nama + ", kamu lolos beasiswa untuk semester "+(semester+1)+". Semangat semester "+(semester+1)+" nya!");
                    System.exit(0);
                }
                else if (ips < 3.50 && lomba.equalsIgnoreCase("Y") && pkm.equalsIgnoreCase("Y")){
                    sisa = 3.50 - ips;
                    //System.out.println(sisa);
                    System.out.println("Sorry "+nama+", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Nilai IPS kamu semester ini kurang "+sisa+". Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (lomba.equalsIgnoreCase("N") && ips >= 3.50 && pkm.equalsIgnoreCase("Y")){
                    System.out.println("Sorry "+nama+", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Kamu belum mengikuti lomba. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (pkm.equalsIgnoreCase("N") && ips >= 3.50 && lomba.equalsIgnoreCase("Y")){
                    System.out.println("Sorry "+nama+", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Kamu belum mengikuti pkm. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (ips < 3.50 && lomba.equalsIgnoreCase("N") && pkm.equalsIgnoreCase("N")){
                    sisa = 3.50 - ips;
                    System.out.println("Sorry "+nama+" , kamu belum lolos beasiswa untuk semester "+(semester+1)+". Nilai IPS kamu semester ini kurang "+sisa+" dan kamu belum mengikuti lomba dan PKM. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (ips < 3.50 && lomba.equalsIgnoreCase("N") && pkm.equalsIgnoreCase("Y")){
                    sisa = 3.50 - ips;
                    System.out.println("Sorry "+nama+", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Nilai IPS kamu semester ini kurang "+sisa+" dan kamu belum mengikuti lomba. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (ips < 3.50 && pkm.equalsIgnoreCase("N") && lomba.equalsIgnoreCase("Y")){
                    sisa = 3.50 - ips;
                    System.out.println("Sorry "+nama+", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Nilai IPS kamu semester ini kurang "+sisa+" dan kamu belum mengikuti PKM. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }
                else if (ips >= 3.50 && lomba.equalsIgnoreCase("N") && pkm.equalsIgnoreCase("N")) {
                    sisa = 3.50 - ips;
                    System.out.println("Sorry " + nama + ", kamu belum lolos beasiswa untuk semester "+(semester+1)+". Kamu belum mengikuti lomba dan PKM. Tetap semangat, jangan menyerah!");
                    System.exit(0);
                }


                } catch (Exception e) {
                System.out.println("Input invalid, try again!");
            }
        }
    }
}