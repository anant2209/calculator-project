import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		String yn = "y";

		Scanner sc = new Scanner(System.in);
		while (yn != "n") {
			System.out.println("Enter first number");
			int no1 = sc.nextInt();
			System.out.println("Enter second number");
			int no2 = sc.nextInt();
			System.out.println("Selact a symbol(+,-,*,/)");
			String sym = sc.next();
			int res;
			switch (sym) {
			case "+": {
				res = no1 + no2;
				System.out.println("Addition is:" + res);
				break;
			}
			case "-":{
				res = no1 - no2;
				System.out.println("Substraction is:" + res);
				break;}
			case "*":{
				res = no1 * no2;
				System.out.println("Multiplication is:" + res);
				break;}
			case "/":{
				res = no1 / no2;
				System.out.println("Division is:" + res);
				break;}
			default:{
				System.out.println("Invalid symbol");
				break;}
			
			}
			System.out.println("To Continue (Press y for Yes and n for No)");
			yn = sc.next();

		}
	}

}
