import java.util.Scanner;
public class Fibo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int input = scan.nextInt();
int first=0;
int second=1;
int third;
int i =0;
while(i<=input){
third=first+second;
first=second;
second=third;
}
System.out.println(third);
}
}
