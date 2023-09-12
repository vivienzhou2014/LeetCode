import java.util.Scanner;

public class PlusOne66 {
    public static int[] plusOne1(int[] digits) {
        //does not work when number is too long
        String nums = "";
        for (int num: digits) {
            nums += num;
        }
        //System.out.println(nums);
        nums = Long.toString(Long.parseLong(nums) + 1);
        //System.out.println(nums);
        int[] result = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            //System.out.println(nums.charAt(i));
            result[i] = Character.getNumericValue(nums.charAt(i));
            //System.out.println(result[i]);
        }
        return result;

    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
            for(int num : digits){
                System.out.print(num + " ");
            }
            System.out.println("----------");

            digits = new int[digits.length + 1];

            for(int num : digits){
                System.out.print(num + " ");
            }
            System.out.println("----------");

            digits[0] = 1;

            for(int num : digits){
                System.out.print(num + " ");
            }
            System.out.println("----------");

            return digits;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a int[], separate each number with space: ");
        String intArray = scanner.nextLine();
        String[] stringArray= intArray.split(" ");
        int[] digits = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            digits[i] = Integer.parseInt(stringArray[i]);
        }
        int[] newDigits = plusOne(digits);
        for(int num : newDigits){
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
