//see test cases.
public class ArraysAreEqual {
    /**
     * Check if two arrays are equal to each other. Return true if all of the values in a are
     * identical to the ones in b, and false otherwise. So, {1,2,3,4} is equal only to {1,2,3,4}.
     *
     * Note: attempting to solve this problem with an expression like array1==array2 will not work,
     * because even though the arrays may be equivalent, they can occupy different positions in memory,
     * which will cause a==b to fail. When working with Objects (arrays are special objects,) == just
     * compares locations in memory. Object1 == Object2 is only true when they are literally the same
     * object in memory.
     *
     * @param a the first array.
     * @param b the second array.
     * @return true if the values of a are equal to the values of b.
     */
    public boolean equal(int[] a, int[] b){
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ArraysAreEqual arrayComparator = new ArraysAreEqual();

    
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(arrayComparator.equal(arr1, arr2));  //true

        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = {1, 2, 3, 5};
        System.out.println(arrayComparator.equal(arr3, arr4));  //flase
        int[] arr5 = {1, 2, 3, 4};
        int[] arr6 = {1, 2, 3, 4, 5};
        System.out.println(arrayComparator.equal(arr5, arr6));  //flase
    }
}

