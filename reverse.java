import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int reversed=0,num,digit;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the element to reverse:");
	    num =sc.nextInt();
while(num!=0){
    digit=num%10;
    reversed=reversed*10+digit;
    num=num/10;
}
System.out.println("Reveresed element is "+reversed);
}
}
