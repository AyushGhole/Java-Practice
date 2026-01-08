import java.util.*;
import java.util.Arrays;
import java.util.Collections;

// Main Java class
public class Java {

  // IsPrime
  public static Boolean isPrime(int a) {
    // check the condition
    if (a % 2 == 0) { // Check for the not prime number
      return false;
    } else { // else condition for the prime
      return true;
    }
  }

  // Check Prime function
  public static void checkPrime(int a) {
    for (int i = 1; i <= a; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  // Decimal to Binary Number
  public static void BinToDeci(int BinNumber) {
    int pow = 0;
    int decNum = 0;
    int myDecimal = BinNumber;
    while (BinNumber > 0) {
      int lastDigit = BinNumber % 10;
      decNum = decNum + (int) (lastDigit * Math.pow(2, pow));

      pow++;
      BinNumber = BinNumber / 10;
    }

    System.out.println("Decimal Number of " + myDecimal + " = " + decNum);
  }

  // Function for Decimal to Binary
  public static void DecToBin(int n) {
    int myDecimal = n;
    int BinNumber = 0;
    while (n > 0) {
      int pow = 0;
      n = n % 2;
      int lastNumber = 0;
      BinNumber = lastNumber + (int) (n * Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println(BinNumber);
  }

  // Calculate average function
  public static void calculateAvg(double a, double b, double c) {
    double avg = (a + b + c) / 3;
    System.out.println("Average of the numbers " + a + ", " + b + ", " + c + " = " + avg);
  }

  // Method to check Even
  public static Boolean checkEven(int a) {
    if (a % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // Palindrome Function
  public static void checkPalindrom(int a) {
    int num = 0;
    int original = a;
    while (a > 0) {
      int pow = 0;
      num = (num * 10) + (int) ((a % 10) * Math.pow(10, pow));

      pow++;
      a = a / 10;
    }

    if (num == original) {
      System.out.println(original + " is a Palindrome");
    } else {
      System.out.println(original + " is not a Palindrome");
    }

  }

  // To find the sum of the digits
  public static void sum(int n) {
    int sum = 0;
    while (n > 0) {
      int pow = 0;
      int lastDigit = (int) ((n % 10) * Math.pow(10, pow));
      sum = sum + lastDigit;
      pow++;
      n = n / 10;
    }
    System.out.println("Sum is " + sum);
  }

  // Print Hollow Rectangular Matrix
  public static void Pattern() {
    for (int i = 1; i < 5; i++) {
      for (int j = 1; j < 6; j++) {
        if ((i == 2 && j == 2) || (i == 3 && j == 3) || (i == 3 && j == 2) || (i == 2 && j == 3) || (i == 2 && j == 4)
            || (i == 3 && j == 4)) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }

  // Inverted & Rotated Half - Pyramid/Numberic as well as * patttern
  public static void RotatedHalf() {
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 6; j++) {
        if (j == 1 || (i == 2 && j < 5) || (i == 3 && j < 4) || (i == 4 && j < 3) || i == 1) {
          System.out.print(j + " ");
        } else {
          System.out.print("  ");
        }

      }
      System.out.println();
    }
  }

  // Floyd's Triangle
  public static void Floyds() {
    int count = 2;

    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 6; j++) {

        if ((i == 1 && j == 1)) {
          System.out.print(i);
          break;
        } else if (i == 2 && j < 3) {
          System.out.print(count + " ");
          count++;
        } else if (i == 3 && j < 4) {
          System.out.print(count + " ");
          count++;
        } else if (i == 4 && j < 5) {
          System.out.print(count + " ");
          count++;
        } else if (i == 5) {
          System.out.print(count + " ");
          count++;
        }
      }
      System.out.println();
    }
  }

  // 0 - 1 Triangle
  public static void ZeroOneTriangle() {
    int count = 1;
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 6; j++) {
        if (i == 1 && j == 1) {
          System.out.print(count + " ");
          count--;
        } else if (i == 2 && j < 3) {
          System.out.print(count + " ");
          count++;
        } else if (i == 3 && j < 4) {
          if (i == 3 && j == 3) {
            count = count + 1;
            System.out.print(count + " ");
          } else {
            count--;
            System.out.print(count + " ");
          }
        } else if (i == 4 && j < 5) {
          if (i == 4 && j == 3) {
            count = count - 3;
            System.out.print(count + " ");
            count += 2;
          } else {
            count--;
            System.out.print(count + " ");
            count += 2;
          }
        } else if (i == 5) {
          if (count == 3) {
            count = count - 3;
          }
          count++;
          System.out.print(count + " ");
          if (count == 1) {
            count -= 2;
          }
        }

      }
      System.out.println();
    }
  }

  // Solid Rhombus Pattern
  public static void SolidRhombus() {
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 10; j++) {
        if (i == 1 && j > 4) {
          System.out.print("* ");
        } else if (i == 2 && j > 3) {
          if (j == 9) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 3 && j > 2) {
          if (j > 7) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 4 && j > 1) {
          if (j > 6) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 5) {
          if (j > 5) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  // Hollow Rhombus
  public static void HollowRhombus() {
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 10; j++) {
        if (i == 1 && j > 4) {
          System.out.print("* ");
        } else if (i == 2 && j > 3) {
          if (j == 9) {
            System.out.print("  ");
          } else if (j > 4 && j < 8) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 3 && j > 2) {
          if (j > 7) {
            System.out.print("  ");
          } else if (j > 3 && j < 7) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 4 && j > 1) {
          if (j > 6) {
            System.out.print("  ");
          } else if (j > 2 && j < 6) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else if (i == 5) {
          if (j > 5) {
            System.out.print("  ");
          } else {
            System.out.print("* ");
          }
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  // Diamond Pattern
  public static void DiamondPattern() {
    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 8; j++) {
        if (i == 1 || i == 8) {
          if (j == 4) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        } else if (i == 2 || i == 7) {
          if (j > 2 && j < 6) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        } else if (i == 3 || i == 6) {
          if (j > 1 && j < 7) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
        } else if (i == 4 || i == 5) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  // Linear Search in Array
  public static int linearSearch(int numbers[], int key) {

    for (int i = 0; i <= numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }

    return -1;
  }

  // Largest in Array
  public static void largestNum(int numbers[], int key) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }
    System.out.println("Largest Number : " + largest);
  }

  // Binary Search Code
  public static void binarySearch(int numbers[], int key) {
    int starts = 0;
    int end = numbers.length - 1;
    int mid = numbers.length / 2;

    while (starts > end) {
      if (numbers[mid] == key) {
        System.out.print("Key found at index " + mid);
      } else if (numbers[mid] > key) {
        starts = mid + 1;
      } else {
        end = mid - 1;
      }
      starts++;
    }

    for (starts++; starts <= end; starts++) {
      if (numbers[starts] == key) {
        System.out.println("Key found at index : " + starts);
      } else {
        System.out.println("Key not found");
        break;
      }
    }

  }

  // Reverse the array
  public static void ReverseArray(int numbers[]) {
    int temp = 0;
    int end = numbers.length - 1;
    for (int i = 0; i < 4; i++) { // 0 1 2 3 4
      temp = numbers[i];
      numbers[i] = numbers[end]; // numbers[0] = numbers[7]
      numbers[end] = temp;
      end--;

    }

    System.out.println(Arrays.toString(numbers));
  }

  // Possible pairs of the array
  public static void PossiblePairs(int numbers[]) {
    for (int i = 0; i <= numbers.length - 1; i++) {
      for (int j = i + 1; j <= numbers.length - 1; j++) {
        System.out.print("( " + numbers[i] + "," + numbers[j] + " )" + " ");
      }
      System.out.println();
    }
  }

  // bubble sort
  public static void BubbleSort(int numbers[]) {
    for (int turns = 0; turns < numbers.length - 1; turns++) { // Track the turns
      for (int j = 0; j < numbers.length - 1 - turns; j++) { // Track the numbers
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }

  public static void printArray(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  // Selection Sort
  public static void selectionSort(int numbers[]) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int minpos = i;
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[minpos] > numbers[j]) {
          minpos = j;
        }
      }

      int temp = numbers[minpos];
      numbers[minpos] = numbers[i];
      numbers[i] = temp;
    }
    System.out.println(Arrays.toString(numbers));
  }

  // insertion sort
  public static void insertionSort(int numbers[]) {

    for (int i = 1; i < numbers.length; i++) {
      int curr = numbers[i];
      int prev = i - 1;
      while (prev >= 0 && numbers[prev] > curr) {
        numbers[prev + 1] = numbers[prev];
        prev--;
      }
      numbers[prev + 1] = curr;
    }
    System.out.println(Arrays.toString(numbers));

  }

  // Practice bubble sort
  public static void bubbleSort(int numbers[]) {
    for (int turns = 0; turns < numbers.length; turns++) {
      for (int j = 0; j < numbers.length - 1 - turns; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(numbers));
  }

  // Practice selectionsort
  public static void SelectionSort(int numbers[]) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int minpos = i;
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[minpos] > numbers[j]) {
          minpos = j;
        }
      }

      int temp = numbers[i];
      numbers[i] = numbers[minpos];
      numbers[minpos] = temp;

    }
    System.out.println(Arrays.toString(numbers));
  }

  // Practice inserstion sort
  public static void InsertionSort(int numbers[]) {
    for (int i = 1; i < numbers.length; i++) {
      int curr = numbers[i];
      int prev = i - 1;
      while (prev >= 0 && numbers[prev] > curr) {
        numbers[prev + 1] = numbers[prev];
        prev--;
      }

      numbers[prev + 1] = curr;
    }
    System.out.println(Arrays.toString(numbers));
  }

  // counting sort
  public static void countSort(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      largest = Math.max(largest, numbers[i]);
    }

    int count[] = new int[largest + 1];
    for (int i = 0; i < numbers.length; i++) {
      count[numbers[i]]++;
    }

    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        numbers[j] = i;
        j++;
        count[i]--;
      }
    }

    System.out.println(Arrays.toString(numbers));
  }

  public static void main(String[] args) {

    int array[] = { 5, 8, 9, 12, 10, 45, 77 };
    int numbers[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

    // selectionSort(array);
    // printArray(array);
    // insertionSort(numbers);
    countSort(numbers);
  }
}
