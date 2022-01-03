import java.util.Arrays;
import java.util.Random;
public class RandomNumbers {
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max2 = 0;
        int min = 31;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
            if (temp > max2) {
                max2 = max2;
            } else
            if (temp < min) {
                min = temp;
            } else {
                min = min;
            }
        }
    return result;
    }

    class NewResult {
        int result;
        int sum;
    }

}
