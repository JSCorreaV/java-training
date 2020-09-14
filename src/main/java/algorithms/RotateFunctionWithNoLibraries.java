package algorithms;

public class RotateFunctionWithNoLibraries {

//    Given an array of integers A and let n to be its length.
//
//    Assume Bk to be an array obtained by rotating the array A k positions clock-wise,
//    we define a "rotation function" F on A as follow:
//
//    F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
//
//    Calculate the maximum value of F(0), F(1), ..., F(n-1).
//
//    Note: n is guaranteed to be less than 10.pow5
//
//    added 2 tests:
//    a case for null arrays to avoid nullPointerExc.
//    and another for empty arrays.

    public static void main(String[] args) {
        RotateFunctionWithNoLibraries a = new RotateFunctionWithNoLibraries();
        System.out.println("Expected output: 26 Output: " + a.maxRotationMultiplier(new int[]{4, 3, 2, 6}));
        System.out.println("Expected output: 0 Output: " + a.maxRotationMultiplier(new int[]{}));
        System.out.println("Expected output: -1 Output: " + a.maxRotationMultiplier(null));
    }

    public int maxRotationMultiplier(int[] numbers) {
        int sum;
        int max = 0;
        if (numbers == null) {
            System.out.println("array is null");
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = findProduct(numbers);
            if (max < sum) max = sum;
            numbers = rotator(numbers);
        }
        return max;
    }

    public int findProduct(int[] numbers) {
        int count = 0;
        for (int j = 0; j < numbers.length; j++) {
            count = count + (numbers[j] * j);
        }
        return count;
    }

    public int[] rotator(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[numbers.length - 1];
        System.arraycopy(numbers, 0, result, 1, numbers.length - 1);
        return result;
    }
}
