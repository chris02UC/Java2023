import java.util.Scanner;
import java.util.Random;
public class soal3 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int chance = 6;
    int round = 1;
    String input;
    String []ktlog;
    ktlog = new String[5];
    ktlog[0] = "tiger";
    ktlog[1] = "maple";
    ktlog[2] = "kevin";
    ktlog[3] = "words";
    ktlog[4] = "speak";
    int z = r.nextInt(5);
    String word = ktlog[z];
    char[]wordw = word.toCharArray();
    //System.out.println(word);
    int []color;
    color = new int[5];

    while (chance != 0){
    System.out.println("Round "+round);
    System.out.print("Input a 5 letter word: \u001B[32m");
    input = s.next()+s.nextLine();
    System.out.print("\u001B[0m");
    input = input.toLowerCase();
    while (!input.matches("[a-zA-z]+") || input.length() != 5){
    System.out.println("Guess words must be 5 letters, nothing else!");
    System.out.print("Input a 5 letter word: \u001B[32m");
    input = s.next()+s.nextLine();
    input = input.toLowerCase();
    System.out.print("\u001B[0m");    
    }
    char[]inputw = input.toCharArray();
    int y = 0;
        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 5; b++){
                if (inputw[a] == wordw[b]){
                    if (a == b){
                    color[y] = 0;
                    break;
                    }
                    else {
                    color[y] = 1;
                    break;                 
                    }
                }
                else {
                color [y] = 2;
                }
            }
        y++;
        }
    
    y = 0;
    System.out.print("Guess "+round+": ");
    if (word.equalsIgnoreCase(input)){
        System.out.println("\u001B[32m"+input+"\u001B[0m");
        System.out.println("Congratss You win nilai 100");
        System.exit(0);
    }

    
    for (int a = 0; a < 5; a++){
        if (color[y] == 0){
        System.out.print("\u001B[32m"+inputw[a]+"\u001B[0m");
        }
        else if (color[y] == 1){
        System.out.print("\u001B[33m"+inputw[a]+"\u001B[0m");
        }
        else if (color [y] == 2){
        System.out.print("\u001B[31m"+inputw[a]+"\u001B[0m");
        }
    y++;
    }

    round++;
    chance--;
    System.out.println("");
    }

break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}
}
