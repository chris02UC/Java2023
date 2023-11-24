import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        while (true){
            try{
            Scanner oof = new Scanner(System.in);

            double berat;
            double tinggi;
            double tinggip;
            double hasil;

            System.out.print("Masukkan berat badan kamu (kg): ");
            berat = oof.nextDouble();
            while (berat <= 0){
                System.out.print("Berat badan tidak boleh kurang atau sama dengan 0! Input berat badan(kg): ");
                berat = oof.nextDouble();
            }

            System.out.print("Masukkan tinggi badan kamu (cm): ");
            tinggi = oof.nextDouble();
            while (tinggi <= 0){
                System.out.print("Tinggi tidak boleh kurang atau sama dengan 0! Input tinggi(cm): ");
                tinggi = oof.nextDouble();
            }
            
            System.out.println("Jika hasil perhitungan itu: ");
            System.out.println("- Kurang dari 18,5 berarti berat badanmu kurang (underweight).");
            System.out.println("- Antara 18.5 - 24.9 berarti berat badanmu normal (ideal).");
            System.out.println("- Antara 25 - 29,9 berarti berat badanmu berlebih (overweight).");
            System.out.println("Di atas 30 berarti kamu obesitas.");

            tinggip = (tinggi/100)*(tinggi/100);
            hasil = berat / tinggip;

            if (hasil < 18.5){
                System.out.println("Perhitungan untuk berat badan dan tinggi badanmu menghasilkan angka "+hasil+". Itu berarti kamu memiliki berat badan kurang (underweight).");
                System.exit(0);
            }
            else if (hasil >= 18.5 && hasil <= 24.9){
                System.out.println("Perhitungan untuk berat badan dan tinggi badanmu menghasilkan angka "+hasil+". Itu berarti kamu memiliki berat badan normal (ideal).");         
                System.exit(0);      
            }
            else if (hasil >= 25 && hasil <= 29.9){
                System.out.println("Perhitungan untuk berat badan dan tinggi badanmu menghasilkan angka "+hasil+". Itu berarti kamu memiliki berat badan berlebih (overweight)."); 
                System.exit(0);              
            }
            else if (hasil >= 30){
                System.out.println("Perhitungan untuk berat badan dan tinggi badanmu menghasilkan angka "+hasil+". Itu berarti kamu memiliki berat badan obesitas.");  
                System.exit(0);                          
            }

            } catch (Exception e){
                System.out.println("Input invalid, try again!");
            }
        }
    }
}
