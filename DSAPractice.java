import java.util.Arrays;
import java.util.*;

public class DSAPractice {

  // ARRAY DAY - 1

  // Majority Elements
  public static void majorityElements(int numbers[]) {
    int count = 1, maxNum = 0, checkCount = 0;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          count++;
        }
      }
      if (checkCount <= count) {
        checkCount = count;
        maxNum = numbers[i];
      }
      count = 1;
    }
    System.out.print("Maximum Repeated Numbers: " + maxNum);

  }

  // Find Missing and Repeated Values
  public static void findMissingRepeated(int numbers[][]) {
    int count = 0, RepeatedNum = 0, maxRepeat = 0;
    int Array[] = new int[2];
    int n = numbers.length * numbers[0].length;
    int[] freq = new int[n + 1];

    // to find the missing number in the array
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[0].length; j++) {
        freq[numbers[i][j]]++;
      }
    }

    // Check for the missing
    for (int i = 0; i <= n; i++) {
      if (freq[i] == 0) {
        Array[1] = i;
      }
    }

    // Loop for checking the most repeated number in the array
    for (int i = 0; i <= numbers.length - 1; i++) {
      for (int j = 0; j <= numbers[0].length - 1; j++) {
        count = 0;

        // innersloops for the comparision
        for (int k = 0; k <= numbers.length - 1; k++) {
          for (int m = 0; m <= numbers[0].length - 1; m++) {
            if (numbers[i][j] == numbers[k][m]) {
              count++;
            }
          }
        }
        // end of the comparison

        if (maxRepeat <= count) {
          maxRepeat = count;
          RepeatedNum = numbers[i][j];
        }
      }
    }

    // Assigning the new arrays
    Array[0] = RepeatedNum;

    System.out.println(Arrays.toString(Array));
  }

  // Merged 2 sorted Arrays
  public static void mergedArray() {
    int nums1[] = { 1, 2, 3, 0, 0, 0 };
    int nums2[] = { 2, 5, 6 };
    int n = nums1.length + nums2.length;

    for (int i = 0; i <= nums2.length - 1; i++) {
      nums1[i + 3] = nums2[i];
    }

    for (int i = 0; i < nums1.length; i++) {
      int temp;
      for (int j = i + 1; j < nums1.length; j++) {
        if (nums1[i] > nums1[j]) {
          temp = nums1[i];
          nums1[i] = nums1[j];
          nums1[j] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(nums1));

  }

  // Find the single number
  public static void singleNumber() {
    int nums1[] = { 4, 4, 5, 1, 2, 1, 2, 5, 6 };
    int freq[] = new int[nums1.length + 1];
    for (int i = 0; i < nums1.length; i++) {
      freq[nums1[i]]++;
    }

    for (int i = 0; i < nums1.length + 1; i++) {
      if (freq[i] == 1) {
        System.out.println(i);
      }
    }
  }

  // Buy & Sell Stock Market
  public static void buyAndSell() {
    int prices[] = { 7, 6, 4, 3, 1 };
    int profit = 0, sub = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        sub = prices[j] - prices[i];
        if (profit <= sub) {
          profit = sub;
        }
      }
    }

    System.out.println("Maximum Profit : " + profit);
  }

  // Calculate the power
  public static void calPower(double num, double pow) {
    double output = Math.pow(num, pow);
    System.out.println("Output : " + output);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    double num = sc.nextDouble();
    System.out.print("Enter the power : ");
    double pow = sc.nextDouble();

    calPower(num, pow);

  }
}
