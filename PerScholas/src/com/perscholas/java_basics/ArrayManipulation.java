import java.util.*;

public class ArrayManipulation {

  public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // String printedArr = Arrays.toString(arr);
    //fills all values
    // Arrays.fill(arr, 9);

    // for (int arrs : arr) {
    //   System.out.print(arrs + " ");
    // }

    // Arrays.fill(arr, 0, 3, 1);

    // for (int arrs : arr) {
    //   System.out.print(arrs + " ");
    // }

    // Arrays.fill(arr, 1, 2, 2);
    // Arrays.fill(arr, 2, 3, 3);
    // Arrays.fill(arr, 3, 4, 4);
    // Arrays.fill(arr, 4, 5, 5);
    // for (int arrs : arr) {
    //   System.out.print(arrs + " ");
    // }

    // Arrays.fill(arr, 0, 1, 4);
    // Arrays.fill(arr, 1, 2, 88);
    // Arrays.fill(arr, 2, 3, 32);
    // Arrays.fill(arr, 3, 4, 12);
    // Arrays.fill(arr, 4, 5, 43);

    // for (int i : arr) {
    //   System.out.print(i + " ");
    // }

    // Arrays.sort(arr);

    //System.out.println(Arrays.toString(arr));
    System.out.println("----------Creating Copies of Arrays--------------\n");
    //Creating a deep copy of the array
    //creates a new array object
    //allocates a new memory address for the object
    //copies the values, but it's not the same array
    // int[] newArr = new int[arr.length];

    // for (int i = 0; i < newArr.length; i++) {
    //   newArr[i] = arr[i];
    // }

    //System.out.println(Arrays.toString(newArr));

    //shallow copies
    //int[] targerArr = arr; //only problem is that changes to original array affect the new array
    //int[] targerArr =arr.clone();

    // int[] sourceArray = { 1, 2, 3 };
    // int[] targetArray = { 0, 0, 0, 4, 5, 6 };
    // System.arraycopy(sourceArray, 0, targetArray, 0, 3); //last num is exclusive= length so 0,1,2
    // System.out.println("sourceArray " + Arrays.toString(sourceArray));
    // System.out.println("targetArray " + Arrays.toString(targetArray));

    // int[] templateArray = { 1, 2, 3 };
    // //copies into an array of the same length
    // int[] myNewArray = Arrays.copyOf(templateArray, templateArray.length);
    // System.out.println("myNewArray " + Arrays.toString(myNewArray));
    // //copies into an array of greater length---> rest of values are 0
    // myNewArray = Arrays.copyOf(templateArray, 10);
    // //copies into an array of smaller size
    // System.out.println("myNewArray " + Arrays.toString(myNewArray));
    // myNewArray = Arrays.copyOf(templateArray, 2);
    // System.out.println("myNewArray " + Arrays.toString(myNewArray));

    // Scanner input = new Scanner(System.in);
    // System.out.println("How many elements do you want in your array: ");
    // int numOfElements = input.nextInt();
    // input.nextLine();
    // int[] userArray = new int[numOfElements];
    // for (int i = 0; i < numOfElements; i++) {
    //   System.out.println("Enter your elements: ");
    //   userArray[i] = input.nextInt();
    // }
    // System.out.println(Arrays.toString(userArray));

    //initializing arrays with random values
    // double[] doubleArr = new double[6];
    // for (int i = 0; i < doubleArr.length; i++) {
    //   doubleArr[i] = Math.random();
    // }

    // System.out.println("Random double array: " + Arrays.toString(doubleArr));

    // int[] numbers = new int[] { 10, 20, 30, 40, 50 };
    // int sum = 0;
    // for (int number : numbers) {
    //   sum += number;
    // }

    // System.out.printf("The sum is %d%n", sum);

    int[] myArray = { 0, 2, 4, 6, 8, 10 };
    int minVal = Integer.MAX_VALUE;
    int maxVal = Integer.MIN_VALUE;
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] < minVal) {
        minVal = myArray[i];
      }
    }

    System.out.printf("The minimum value is %d%n", minVal);

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > maxVal) maxVal = myArray[i];
    }

    System.out.printf("The maximum value is %d%n", maxVal);

    //Reverse Print
    // for (int i = myArray.length - 1; i >= 0; i--) {
    //   System.out.print(myArray[i] + " ");
    // }

    //insertion
    int x = 28;
    int myNewArray[] = { 0, 1, 2, 45, 7, 5, 17 };
    //create a new array of bigger size (n+1)

    int newArray[] = new int[myNewArray.length + 1];
    System.out.println(newArray.length);

    for (int i = 0; i < myNewArray.length; i++) {
      newArray[i] = myNewArray[i];
    }
    newArray[myNewArray.length] = x;
    //insertion at the end is very efficient O(1)
    System.out.println("28 inserted: " + Arrays.toString(newArray));

    //deletion
    //to delete we remove an element and shift all the others left
    int[] array2delete = { 10, 25, 36, 58, 96, 74, 100 };

    int removeIndex = array2delete.length - 1;

    int deleted = array2delete[removeIndex];
    array2delete[removeIndex] = 0;

    for (int i = removeIndex; i < array2delete.length - 1; i++) {
      array2delete[i] = array2delete[i + 1];
    }
    System.out.println(
      removeIndex +
      " is deleted from the array " +
      Arrays.toString(array2delete)
    );

    //Binary Search
    //divide and conquer algorithm
    //must sort first
    int[] searchIntArray = { 1, 2, 35, 5, 2, 1, 9 };
    Arrays.sort(searchIntArray);
    System.out.println(Arrays.toString(searchIntArray));
    int indexOfFoundElement = Arrays.binarySearch(searchIntArray, 5);
    System.out.println(indexOfFoundElement);

    //Linear Search
    int element = 5;
    for (int i = 0; i < searchIntArray.length; i++) {
      if (searchIntArray[i] == element) {
        System.out.println(i);
      }
    }
  }
}
