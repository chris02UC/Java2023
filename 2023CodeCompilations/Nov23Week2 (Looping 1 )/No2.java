import java.util.Scanner;
import java.util.Random;
public class No2 {
public static void main(String[] args) {
while (true){
try{
Scanner s = new Scanner(System.in);
Random r = new Random();
int random = r.nextInt(100)+1;
int input;
//System.out.println(random);
System.out.println("selamat datang di game lotre (1-100)");
System.out.print("Input = masukkan tebakan anda = ");
input = s.nextInt();

while (input > 100 || input < 1){
System.out.print("Error: Input hanya bisa 1-100! Coba lagi: ");
input = s.nextInt();
}

for (int chance = 4; chance >= 1; chance--){
    if (input > random){
    System.out.println("Output = lebih rendah");
    System.out.print("Input = masukkan tebakan anda = ");
    input = s.nextInt();
        while (input > 100 || input < 1){
        System.out.print("Error: Input hanya bisa 1-100! Coba lagi: ");
        input = s.nextInt();
        }
    }
    else if (input < random){
    System.out.println("Output = lebih tinggi");
    System.out.print("Input = masukkan tebakan anda = ");
    input = s.nextInt();
        while (input > 100 || input < 1){
        System.out.print("Error: Input hanya bisa 1-100! Coba lagi: ");
        input = s.nextInt();
        }
    }

if (chance == 1 && input != random){
System.out.println("Maaf anda kalah, tebakannya adalah "+random);
System.exit(0);
}
else if (input == random){
System.out.println("Output = Selamat Anda menang!");
System.exit(0);
}
}

break;
} catch (Exception e) {
System.out.println("Input invalid, shutting down...");
break;
} 
}    
}
}
