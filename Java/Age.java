import java.util.Scanner;
public class Age{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int input = scan.nextInt();
if(input>=1 & input<=5){
System.out.println("Your kid");
}
else if(input>=6 & input<=10){
System.out.println("Your child");
}
else if(input>=11 & input<=20){
System.out.println("Your Teen");
}
else if(input>=21 & input<=30){
System.out.println("Your adult");
}
else if(input>=31 & input<=40){
System.out.println("Your elder");
}
else{
System.out.println("Senior");
}
}
}
