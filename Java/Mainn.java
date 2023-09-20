import java.util.Scanner;
public class Mainn{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int sum=0;
int input = scan.nextInt();
for(int i=1;i<=input;i++){
sum=sum+i; // sum+=i;
}
System.out.println(sum);
}
}

