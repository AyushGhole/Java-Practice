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

  // ARRAY DAY - 2
  // Kadden's Algorithm
  public static void MaxSubArraySum() {
    int nums[] = { 5, 4, -1, 7, 8 };
    int currSum = 0, maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      currSum = currSum + nums[i];
      if (currSum < 0) {
        currSum = 0;
      }
      if (maxSum < currSum) {
        maxSum = currSum;
      }
    }

    System.out.println("Maximum SubArrays Sum : " + maxSum);

  }

  // Search the target in the 2D arrays
  public static boolean searchElement(int nums[][], int target) {
    int i = 0;
    int j = nums[0].length - 1;
    while (i <= nums.length - 1 && j >= 0) {
      if (target == nums[i][j]) {
        // System.out.println("Found at index : ( " + i + " , " + j + " )");
        return true;
      } else if (target < nums[i][j]) {
        j--;
      } else if (target > nums[i][j]) {
        i++;
      } else {
        System.out.println("Not Found");
      }
    }
    return false;
  }

  // Sorting the arrays
  public static void SortArrays(int nums[]) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }

    System.out.println("Sorted Arrays : " + Arrays.toString(nums));

  }

  // Sum of the 3 triplets/3Sum
  public static Boolean tripletSum(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          if (sum == 0) {
            if (i != j && i != k && j != k) {
              System.out.println("( " + nums[i] + " , " + nums[j] + " , " + nums[k] + " )");

              // DISTINCT LOGIC #2
              while (j + 1 < nums.length && nums[j] == nums[j + 1])
                j++;
              while (k + 1 < nums.length && nums[k] == nums[k + 1])
                k++;

            }
          }
        }
      }
    }
    return false;
  }

  // Sum of the 4sum
  public static void quadretSum(int nums[], int target) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          for (int l = k + 1; l < nums.length; l++) {
            sum = nums[i] + nums[j] + nums[k] + nums[l];
            if (sum == target) {
              System.out.println("( " + nums[i] + " , " + nums[j] + " , " + nums[k] + " , " + nums[l] + " ) ");
              while (j > 0 && nums[j] == nums[j + 1])
                j++;
              while (k > 0 && nums[k] == nums[k + 1])
                k++;
              while (l > 0 && nums[l] == nums[l - 1])
                l++;
            }
          }
        }
      }
    }

  }

  // Container with the maximum height
  public static int maxArar(int nums[]) {
    int left = 0;
    int right = nums.length - 1;
    int maxArea = 0;

    while (left < right) {
      int width = right - left;
      int minArea = Math.min(nums[left], nums[right]);
      int Area = width * minArea;

      maxArea = Math.max(maxArea, Area);

      if (nums[left] < nums[right]) {
        left++;
      } else {
        right--;
      }

    }

    return maxArea;
  }

  // Permutation number
  public static void Permutation(int nums[]) {

    // Arrays sort
    Arrays.sort(nums);
    // Sorted Arrays
    System.out.println(Arrays.toString(nums));

    // [1,2,3]
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[j] <= nums[k]) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;

          }
          System.out.println("Next : " + Arrays.toString(nums));
          break;
        }

      }
    }

  }

  public static void main(String[] args) {
    // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int nums[] = { 2, 3, 1 };
    Permutation(nums);
  }
}
