import java.util.Stack;
import java.util.Scanner;

public class NotationPolonaiseInversée {

	public double interpret(String[] expr) {
		double number1, number2, res;
		Stack<Double> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer opération arithmétique");
		expr = scan.nextLine();

		for (int i = 0; i < expr.length; i++) {
			String si = expr[i];
			if (si.equals("+") || si.equals("-") || si.equals("*") || si.equals("/")) {
				switch (expr[i]) {

				case "+":
					number1 = stack.pop();
					number2 = stack.pop();
					System.out.print(number1 + " + " + number2);
					res += (number1 + number2);
					break;
				case "-":
					number1 = stack.pop();
					number2 = stack.pop();
					System.out.print(number1 + " - " + number2);
					res += (number1 - number2);
					break;
				case "/":
					number1 = stack.pop();
					number2 = stack.pop();
					System.out.print(number1 + " / " + number2);
					res += (number1 / number2);
					break;
				case "*":
					number1 = stack.pop();
					number2 = stack.pop();
					System.out.print(number1 + " * " + number2);
					res += (number1 * number2);
					break;
				}
			} else {
				double sd = Double.parseDouble(si);
				stack.push(sd);
			}
			System.out.println("le résultat est " + res);

		}
	}

	

	public static void main(String[] args) {
		

	}

}
