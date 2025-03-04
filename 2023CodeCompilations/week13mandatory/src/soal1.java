import java.util.Scanner;
public class soal1 {
public static void main(String[] args) {
while (true){
try{
    Scanner s = new Scanner(System.in);
    String play1;
    String play2;
    int temp = 0;
    int []arrayval;
    arrayval = new int[7];
    arrayval[0] = 1;
    arrayval[1] = 3;
    arrayval[2] = 2;
    arrayval[3] = 4;
    arrayval[4] = 8; 
    arrayval[5] = 5;
    arrayval[6] = 10;
    String []value;
    value = new String[7];
    value [0] = "aeilnorstu"; // 1
    value [1] = "bcmp"; // 3
    value [2] = "dg"; //2
    value [3] = "fhvwy"; //4
    value [4] = "jx"; // 8
    value [5] = "k"; // 5
    value [6] = "qz"; // 10
    char [][] array;
    array = new char[7][10];

    for (int a = 0; a < 7; a++){
        if (a == 0){
        temp = 10;
        }
        else if (a == 1){
        temp = 4;
        }
        else if (a == 2){
        temp = 2;
        }
        else if (a == 3){
        temp = 5;
        }
        else if (a == 4){
        temp = 2;
        }
        else if (a == 5){
        temp = 1;
        }
        else if (a == 6){
        temp = 2;
        }   
        for (int b = 0; b < temp; b++){
        array[a][b] = value[a].charAt(b);
        }
    }

    System.out.print("Player 1: ");
    play1 = s.next()+s.nextLine();
    char[]array1 = play1.toLowerCase().toCharArray();

    System.out.print("Player 2: ");
    play2 = s.next()+s.nextLine();
    char[]array2 = play2.toLowerCase().toCharArray();

    int totalval1 = 0;
    for (int a = 0; a < array1.length; a++){
        for (int e = 0; e < 7; e++){
        if (e == 0){
        temp = 10;
        }
        else if (e == 1){
        temp = 4;
        }
        else if (e == 2){
        temp = 2;
        }
        else if (e == 3){
        temp = 5;
        }
        else if (e == 4){
        temp = 2;
        }
        else if (e == 5){
        temp = 1;
        }
        else if (e == 6){
        temp = 2;
        }   
        for (int f = 0; f < temp; f++){
            if (array1[a] == array[e][f]){
            totalval1 = totalval1 + arrayval[e];
            }
        }
    }
    }
    
    int totalval2 = 0;
    for (int a = 0; a < array2.length; a++){
        for (int e = 0; e < 7; e++){
        if (e == 0){
        temp = 10;
        }
        else if (e == 1){
        temp = 4;
        }
        else if (e == 2){
        temp = 2;
        }
        else if (e == 3){
        temp = 5;
        }
        else if (e == 4){
        temp = 2;
        }
        else if (e == 5){
        temp = 1;
        }
        else if (e == 6){
        temp = 2;
        }   
        for (int f = 0; f < temp; f++){
            if (array2[a] == array[e][f]){
            totalval2 = totalval2 + arrayval[e];
            }
        }
    }
    }

    if (totalval1 > totalval2){
        System.out.println("Player 1 wins!");
    }
    else if (totalval1 < totalval2){
        System.out.println("Player 2 wins!");
    }
    else if (totalval1 == totalval2){
        System.out.println("Draw!");
    }

break;
} catch (Exception e){
System.out.println("Input error, shutting down!");
break;
}
}    
}
}