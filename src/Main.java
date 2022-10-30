import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caclculator caclculator = new Caclculator();

        System.out.println("Перед вами калькулятор, введите операцию(+,-,/,*)");
        String action = scanner.nextLine();

        System.out.println("Введите первое число");
        String firstArg = scanner.nextLine();

        System.out.println("Введите второе число");
        String secondArg = scanner.nextLine();

        Double result = caclculator.calculate(Double.parseDouble(firstArg), Integer.parseInt(secondArg), action);
        System.out.println("Результат вычислений: " + result);
    }
}
