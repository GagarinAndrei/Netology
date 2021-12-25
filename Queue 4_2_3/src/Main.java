import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the formula");
        String formula = scanner.nextLine();
        String[] arrayValues = formula.split(" ");
        
        ArrayDeque<String> sign = new ArrayDeque<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < arrayValues.length; i ++) {
            String value = arrayValues[i];
            if (!(value.equals("+") | value.equals("-") | value.equals("/") | value.equals("*"))) {
                numbers.add(Integer.parseInt(value));
            } else {
                sign.add(value);
            }
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pollLast() + " ");
        }

    }
}
