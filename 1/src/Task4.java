
import java.util.Arrays;
import java.util.Scanner;

    public class Task4{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Размер массива: ");
            int n = scan.nextInt();
            int numbers[] = new int[n];
            System.out.println("Элементы массива: ");
            for (int i = 0; i < n; ++i) {
                numbers[i] = scan.nextInt();
            }
            int sum[] = cumulativeSum(numbers);
            System.out.println("Результат = "
                    + Arrays.toString(sum));
            scan.close();
        }
        public static int[] cumulativeSum(int[] numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
                numbers[i] = sum;
            }
            return numbers;
        }
    }

