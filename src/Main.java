import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caclculator caclculator = new Caclculator();

        System.out.println("Перед вами калькулятор, введите операцию(+,-,/,*)");
        String action = scanner.nextLine();

        System.out.println("Введите первое число");
        String firstArgument = scanner.nextLine();

        System.out.println("Введите второе число");
        String secondArgument = scanner.nextLine();

        Double result = caclculator.calculate(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument), action);
        System.out.println("Результат вычислений: " + result);
    }
}
