import java.util.ArrayList;

public class ArrayListAlgorithms {



   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayListAlgorithms() {
      intArray = new ArrayList<Integer>();
   }

   public int getArraySize() {
      return intArray.size();
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      int r = (int)(Math.random() * 100);
      int i = 0;

      while (i < r) {
         intArray.add((int)(Math.random() * 100));
         i += 1;
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int r = (int)(Math.random() * 100);
      int i = startNum;
      while (i < r + startNum) {
         intArray.add(i);
         i += 1;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int length = intArray.size();
      int i = 0;
      int highNum = -2147483648;
      while (i < length) {
         if (intArray.get(i) > highNum) {
            highNum = intArray.get(i);
         }
         i += 1;
      }
      return highNum;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      int length = intArray.size();
      int i = 0;
      int x = 0;
      boolean duplicate = false;
      while (i < length) {
         while (x < length) {
            if (x != i && intArray.get(x) == intArray.get(i)) {
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
      int length = intArray.size();
      int i = 0;
      while (i < length) {
         if (intArray.get(i) == intToFind) {
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
      ArrayListAlgorithms test = new ArrayListAlgorithms();
      test.populateArrayWithRandom();
      System.out.println(test.getArraySize());
      System.out.println(test.findMax());
      System.out.println(test.hasDuplicates());
      System.out.println(test.isInArray(50));
      System.out.println(test.intArray);
   }
}
