import java.util.Scanner;

public class Calculator {

    public Integer add(Integer a, Integer b) {

        return a + b;
    }

    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public double divide(Double dividend, Double divisor) {
        if(divisor == 0) {
            System.err.println("[ERROR] Division by 0.");
            return 0;
        }
        else {
            return dividend/divisor;
        }
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Would you like (a)dd, (s)ubtract, (m)ultiply, (d)ivide, or (q)uit?");
            String userInput = scanner.nextLine().toLowerCase();
            System.out.println(userInput);
            if(userInput.equals("q")) {
                System.out.println("Exiting the program.");
                return;
            }
            switch (userInput.toLowerCase()) {
                case "a":
                    System.out.println("Please enter two numbers on separate lines.");
                    Integer first = scanner.nextInt();
                    scanner.nextLine();
                    Integer second = scanner.nextInt();
                    scanner.nextLine();
                    Integer result = myCalculator.add(first, second);
                    System.out.println("The result is " + result);
                    break;
                case "s":
                    System.out.println("Please enter two numbers on separate lines.");
                    Integer a = scanner.nextInt();
                    scanner.nextLine();
                    Integer b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("The result is " + myCalculator.subtract(a, b));
                    break;
                case "m":
                    System.out.println("Please enter two numbers on separate lines.");
                    Integer m1 = scanner.nextInt();
                    scanner.nextLine();
                    Integer m2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("The result is " + myCalculator.multiply(m1, m2));
                    break;
                case "d":
                    System.out.println("Please enter two numbers on separate lines.");
                    Double dividend = scanner.nextDouble();
                    scanner.nextLine();
                    Double divisor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The result is " + myCalculator.divide(dividend, divisor));
                    break;
                default:
                    break;
            }
        }
    }
}
