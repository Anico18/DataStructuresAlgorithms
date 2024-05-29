package org.array;

public class ArrayUtil {
    // Create 'printArray' method. This will print in console each element of the passed array. To do so, this method
    // finds first the length of the array, and later, iterates through the whole array printing the value.
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayUtil arrUtil = new ArrayUtil(); // Declaration of the ArrayUtil instance.
        arrUtil.printArray(new int[] {5, 1, 2, 9, 10}); // Creation on the array.
    }
}
