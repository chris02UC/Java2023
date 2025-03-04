import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    String base = "abcdefghijklmnopqrstuvwxyz";
    char[]array = base.toCharArray();
    String key;
    String text;
    int same = 0;
    String []temp;

    System.out.print("Enter key: ");
    key = s.next()+s.nextLine();
    key = key.toLowerCase();
    char[]array2 = key.toCharArray();
    for (int a = 0; a < array2.length; a++){
        for (int b = a+1; b < array2.length; b++){
            if (array2[a] == array2[b]){
            same = 1;
            }
        }
    }

    while (key.length()!=26 || same == 1 || !key.matches("[a-zA-z]+")){
        if (key.length()!=26){
        System.out.println("Key must be 26 length");
        }
        if (same == 1){
        System.out.println("Key must not have double characters (aa)");
        }
        if (!key.matches("[a-zA-z]+")){
        System.out.println("Key must not contain any numbers or special characters!");
        }
    System.out.print("Enter key: ");
    key = s.next()+s.nextLine();
    key = key.toLowerCase();
    array2 = key.toCharArray();
    same = 0;
    for (int a = 0; a < array2.length; a++){
        for (int b = a+1; b < array2.length; b++){
            if (array2[a] == array2[b]){
            same = 1;
            }
        }
    }            
    }

    System.out.print("Enter text: ");
    text = s.next()+s.nextLine();
    text = text.toLowerCase();
    char[]text2 = text.toCharArray();
    temp = new String[text.length()];
    for (int a = 0; a < text.length(); a++){
        temp[a] = "0";
    }

    for (int a = 0; a < text.length(); a++){
        for (int b = 0; b < 26; b++){
            if (text.charAt(a) == array[b]){
            temp[a] = String.valueOf(array2[b]);
            }
        }
        if (temp[a].equals("0")){
        temp[a] = String.valueOf(text2[a]);
        }
    }
    System.out.print("Encrypted text = ");
    for (int a = 0; a < text.length(); a++){
        System.out.print(temp[a]);
    }
break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}
}
