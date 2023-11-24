import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
int input;
int total = 0;
int []hari;
hari = new int [24];
for (int a = 0; a <24; a++){
    hari[a] = 0;
}
String []array;
String yesno;
array = new String [24];
for (int a = 0; a < 24; a++){
    array[a] = "| |";
}
int room;

while (true){
try{
Scanner s = new Scanner(System.in);
    System.out.println("====================");
    System.out.println("Welcome to MDS Hotel");
    System.out.println("--------------------");
    System.out.println("Total income: "+total);
    System.out.println("--------------------");
    System.out.println("(1) Lihat kamar");
    System.out.println("(2) Booking kamar");
    System.out.println("(3) Hapus booking-an");
    System.out.println("(4) Update booking-an");
    System.out.println("(0) Exit");
    System.out.println("====================");
    System.out.print("Choose: ");
    input = s.nextInt();
    if (input < 0 || input > 4){
    System.out.println("Invalid input");
    }
    
    if (input == 1){
    System.out.println("Layout Kamar Hotel MDS");
        for (int a = 0; a < 24; a++){
            if (a == 5 || a == 11 || a == 17 || a == 23){
            System.out.print(array [a]);
            System.out.println("");
            }
            else {
            System.out.print(array [a]+"\t\t");
            }
        }
    System.out.print("Lihat detail ruangan ? (y/n) ");
    yesno = s.next()+s.nextLine();
    while (!yesno.equalsIgnoreCase("y") && !yesno.equalsIgnoreCase("n")){
    System.out.println("Invalid input");
    System.out.print("Lihat detail ruangan ? (y/n) ");
    yesno = s.next()+s.nextLine();    
    }
        if (yesno.equalsIgnoreCase("y")){
        System.out.print("Choose room (1-24): ");
        room = s.nextInt();
        while (room < 1 || room > 24){
        System.out.println("Invalid input");
        System.out.print("Choose room (1-24): ");
        room = s.nextInt();        
        }
            if (array[room-1].equalsIgnoreCase("| |")){
            System.out.println("Kamar "+room+" belum di booking");
            continue;
            }
            else if (array[room-1].equalsIgnoreCase("|X|")){
            System.out.println("Kamar "+room);
            System.out.println("Lama booking: "+ hari[room-1]+ " hari");
            continue;
            }
        }
        else if (yesno.equalsIgnoreCase("n")){
        continue;
        }
    }
    else if (input == 2){
    System.out.println("Layout Kamar Hotel MDS");
        for (int a = 0; a < 24; a++){
            if (a == 5 || a == 11 || a == 17 || a == 23){
            System.out.print(array [a]);
            System.out.println("");
            }
            else {
            System.out.print(array [a]+"\t\t");
            }
        }
    System.out.print("Choose room (1-24): ");
    room = s.nextInt();
        while (room < 1 || room > 24){
        System.out.println("Invalid input");
        System.out.print("Choose room (1-24): ");
        room = s.nextInt();        
        }
        if (array[room-1].equalsIgnoreCase("|X|")){
        System.out.println("kamar sudah di booking");
        continue;
        }
    System.out.print("Booking berapa hari: ");
    hari[room-1] = s.nextInt();
        while (hari[room-1] <= 0){
        System.out.println("Minimal booking 1 hari");
        System.out.print("Booking berapa hari: ");
        hari[room-1] = s.nextInt();
        }
    array[room-1] = "|X|";
    }
    else if (input == 3){
    System.out.println("Layout Kamar Hotel MDS");
        for (int a = 0; a < 24; a++){
            if (a == 5 || a == 11 || a == 17 || a == 23){
            System.out.print(array [a]);
            System.out.println("");
            }
            else {
            System.out.print(array [a]+"\t\t");
            }
        }
    System.out.print("Choose room (1-24): ");
    room = s.nextInt();
        while (room < 1 || room > 24){
        System.out.println("Invalid input");
        System.out.print("Choose room (1-24): ");
        room = s.nextInt();        
        }
        if (array[room-1].equalsIgnoreCase("|X|")){
        System.out.println("Menghapus bookingan kamar "+room);
        array[room-1] = "| |";
        hari[room-1] = 0;
        continue;
        }
        else if (array[room-1].equalsIgnoreCase("| |")){
        System.out.println("Kamar masih kosong, belum di booking");
        continue;        
        }       
    }
    else if (input == 4){
    System.out.println("Layout Kamar Hotel MDS");
        for (int a = 0; a < 24; a++){
            if (a == 5 || a == 11 || a == 17 || a == 23){
            System.out.print(array [a]);
            System.out.println("");
            }
            else {
            System.out.print(array [a]+"\t\t");
            }
        }
    System.out.print("Choose room (1-24): ");
    room = s.nextInt();
        while (room < 1 || room > 24){
        System.out.println("Invalid input");
        System.out.print("Choose room (1-24): ");
        room = s.nextInt();        
        }
        if (array[room-1].equalsIgnoreCase("|X|")){
        System.out.println("Kamar "+room);
        System.out.println("Lama booking: "+ hari[room-1]+ " hari"); 
        System.out.println(""); 
        System.out.print("Jadi, mau booking berapa hari? ");
        hari [room-1] = s.nextInt();
        while (hari[room-1] < 0){
        System.out.println("Minima booking 1 hari");
        System.out.print("Booking berapa hari: ");
        hari[room-1] = s.nextInt();
        }
        continue;
        }
        else if (array[room-1].equalsIgnoreCase("| |")){
        System.out.println("Kamar masih kosong, belum di booking");
        continue;        
        }            
    }
    else if (input == 0){
    System.out.println("Bhay");
    break;
    }

} catch (Exception e){
System.out.println("Invalid input");
continue;
}
}    
}
}