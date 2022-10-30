 class Caclculator {
    public Double calculate(Double first, Integer second, String operation) {
        switch (operation) {
            case "+":
                return first + second;
            case  "-":
                return first - second;
            case "/":
                return first / second;
            case "*":
                return first * second;
            default:
                System.out.println("Такая операция не поддерживается.");
                return Double.valueOf("-1");
        }
    }
}
