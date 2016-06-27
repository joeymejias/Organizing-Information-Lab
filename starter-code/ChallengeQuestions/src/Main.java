
import java.util.*;

public class Main {
    static List<Integer> myIntList = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));
        findLargestAndSmallest(myArray);

        int j;
        for (j = 1; j <= 10; j++) {
            myIntList.add(j);
            myIntList.add(j);
        }
        System.out.println(Arrays.toString(myIntList.toArray()));
        sumOfTwoLargest(myIntList);

        removeDuplicatesFromList(myIntList);
    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     * <p/>
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the smallest and the largest.
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int array[]) {
        int[] minAndMax = new int[2];

        int i;
        for (i = 0; i <= array.length; i++) {
            if (i <= minAndMax[0] || i == 1) {
                minAndMax[0] = i;
            }
            if (i > minAndMax[1]) {
                minAndMax[1] = i;
            }
        }
        System.out.println(Arrays.toString(minAndMax));
        System.out.println();
        return minAndMax;
    }


    /**
     * Questions 2
     * <p/>
     * Given a List of Integers, return the sum of the two largest values.
     * <p/>
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * @param intList A List of integers of any size.
     * @return Sum of the two largest values
     */
    public static int sumOfTwoLargest(List intList) {
        int maxInt1 = 0;
        int maxInt2 = 0;
        if (intList.size() == 0) {
            return 0;
        } else if (intList.size() == 1) {
            return (int) intList.get(0);
        } else {
            int i;
            for (i = 0; i < intList.size(); i++) {
                if ((int) intList.get(i) > maxInt1) {
                    maxInt1 = (int) intList.get(i);
                }
                if (((int) intList.get(i) > maxInt2 ||
                        (int) intList.get(i) == 1)) {
                    maxInt2 = (int) intList.get(i);
                }
            }
            System.out.println(maxInt1);
            System.out.println(maxInt2);
            System.out.println(maxInt1 + maxInt2);
            System.out.println();
            return maxInt1 + maxInt2;
        }
    }


        /**
         * Question3: Remove duplicates from a List
         *
         * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
         * and return a List that doesn't contain duplicates. The order of the elements in the original List
         * does not need to be kept the same.
         *
         * You MAY use any collections types you wish, but the method must return a List.
         *
         * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
         *
         * @param intList A List of Integers that may or may not include duplicates
         * @return A List of Integers that doesn't contain duplicates.
         */
        public static List removeDuplicatesFromList(List intList){
            int i;
            for (i = 0; i < intList.size(); i++){
                try{
                    if ((int) intList.get(i) == (int) intList.get(i -1)){
                        intList.remove(i);
                    }
                } catch (ArrayIndexOutOfBoundsException aioobe){
                    aioobe.getSuppressed();
                }
            }
            System.out.println(intList);
            return intList;
        }


        //BONUS QUESTION IS BELOW

        /**
         * BONUS:
         *
         * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
         * All valid numbers in these arrays are greater than 0.
         *
         * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
         * combined. The returned array must be array1 with the new values merged in.
         *
         * For example:
         *      array1 = [1,4,7,9,0,0,0]
         *      array2 = [1,5,11]
         *      returned array = [1,1,4,5,7,9,11]
         *
         * No test cases are provided for this method, you will need to test it on your own.
         *
         * @param array1 Array of sorted integers
         * @param array2 Array of sorted integers
         * @return Array of sorted integers, merged from array1 and array2
         */
        public static int[] mergeSortedArrays(int[] array1, int[] array2){
            return null;
        }
     }

