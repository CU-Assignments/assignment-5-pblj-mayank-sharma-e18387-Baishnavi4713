// EasyLevelSum.java
import java.util.*;

public class EasyLevelSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = sc.nextLine();

        String[] nums = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        for (String num : nums) {
            Integer number = Integer.parseInt(num); // Autoboxing
            list.add(number);
            sum += number; // Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
