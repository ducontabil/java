import java.util.Scanner;

public class HelloWorld {


	public static void main(String[] args) {
	
		
	Scanner scan = new Scanner(System.in);

	int num;	
	System.out.print("Digite um numero: ");
	num = scan.nextInt();
	

	scan.close();
	System.out.println("Você digitou: " + num);
	
	}




}
	
