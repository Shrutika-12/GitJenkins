
import java.util.*;
public class Fact
{
static int factorial(int n){
if(n==0)
	return 1;
else
	return(n*factorial(n-1));
}
public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
int i ,facto=1;
System.out.print("Enter a no: ");
int number = scan.nextInt();
facto= factorial(number);
System.out.println("The factorial of "+number+"! is = "+facto);
}
}

