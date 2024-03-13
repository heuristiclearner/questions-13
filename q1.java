/*write a java program to find the sum of the numbers which are divisible by 5 and 2 in an array 
int[] values={100,52,43,99,42,40,91};*/
public class Main {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = sumOfDivisibleBy5And2(values);
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);
    }

    public static int sumOfDivisibleBy5And2(int[] values) {
        int sum = 0;
        for (int value : values) {
            if (value % 5 == 0 && value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}
