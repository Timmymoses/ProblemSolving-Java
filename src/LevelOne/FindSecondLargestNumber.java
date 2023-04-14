package LevelOne;

import java.util.Scanner;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        System.out.print("Enter " + num + " Numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number is: " + secondLargest);
    }
    public static int findSecondLargest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        return secondMax;
    }
}