public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      int length = intArray.length;
      int i = 0;
      while (i < length) {
         intArray[i] = (int)(Math.random() * 100);
         i += 1;
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int length = intArray.length;
      int i = startNum;
      while (i < length + startNum) {
         intArray[i] = i;
         i += 1;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int length = intArray.length;
      int i = 0;
      int highNum = -2147483648;
      while (i < length) {
         if (intArray[i] > highNum) {
            highNum = intArray[i];
         }
         i += 1;
      }
      return highNum;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      int length = intArray.length;
      int i = 0;
      int x = 0;
      boolean duplicate = false;
      while (i < length) {
         while (x < 100) {
            if (x == intArray[i]) {
               duplicate = true;
            }
            x += 1;
         }
         i += 1;
      }
      return duplicate;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      int length = intArray.length;
      int i = 0;
      while (i < length) {
         if (intArray[i] == intToFind) {
            return true;
         }
         i += 1;
      }
      return false;
   }

   // ===== UWHS ALGORITHMS =====

//   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
//   }

//   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
//   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms(100);
      arrayAlgorithms.populateArrayWithRandom();
      System.out.println(arrayAlgorithms.findMax());
      System.out.println(arrayAlgorithms.hasDuplicates());
      System.out.println(arrayAlgorithms.isInArray(58));
   }
}
