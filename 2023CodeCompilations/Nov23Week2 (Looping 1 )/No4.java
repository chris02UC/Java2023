import java.util.Scanner;
public class No4 {
public static void main(String[] args) {
while (true){
try{
Scanner s = new Scanner(System.in);
int input;
int a = 1;
int sum = 0;

System.out.print("Input = ");
input = s.nextInt();
while (input < 0){
System.out.println("Error: Input invalid! Shutting down...");
System.exit(0);
}

while (a<=input){
System.out.print(a+" + ");
sum = sum + a;
a++; 
    if (a == input){
    System.out.println(a);
    sum = sum + a;
    break;
   }
}

System.out.println("Output = "+sum);
break;
} catch (Exception e) {
System.out.println("Input invalid, shutting down!");
break;
}   
}    
}
}
