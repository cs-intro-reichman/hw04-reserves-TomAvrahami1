public class ArrayOps {
    public static void main(String[] args) {
        int [] a1 = {1,2,2,2,3,3,4};
        int [] a2 = {4,3,2,1,1};
        int [] a3 = {1,2,3,2};
        System.out.println(findMissingInt(new int[] {0,1,3,5,4}));
        System.out.println(secondMaxValue(new int[] {1, 2, 4, 5, 7, -30, 40, 37}));
        System.out.println(secondMaxValue(a1));
        System.out.println(containsTheSameElements(a1, a2));
        System.out.println(containsTheSameElements(a1, a3));
        System.out.println(isSorted(a1));
        System.out.println(isSorted(a2));
        System.out.println(isSorted(a3));
    }
    
    public static int findMissingInt (int [] array) {
        for (int i = 0; i <= array.length; i++){
            int check = indexOf(array, i);
            if (check == -1)
                return i;
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = findMax(array);
        int secondmax = array[0];
        for (int i =1; i < array.length; i++){
            if( array[i] < max && array[i] >secondmax )
                secondmax = array[i];
        }
        return secondmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length ; i++){
            if ( indexOf(array2, array1[i]) == -1) 
                return false;
        }
        for (int j = 0; j < array2.length; j++){
            if ( indexOf(array1, array2[j]) == -1)
                return false;

        }
        return true;
    }

    public static boolean isSorted(int [] array) {
       return ( isDecreasing(array) || isIncreasing(array));
    }

    //helper function to find the first index of a given value
    public static int indexOf (int [] array, int value){ 
        for (int i = 0; i <array.length ; i++){
            if( array[i] == value)
                return i;
        }
        return -1;
    }

    //helper function that finds the maximum value in given array
    public static int findMax (int [] array){
        int max= array[0];
        for (int i = 1; i < array.length; i++){
            if( array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static boolean isIncreasing(int [] array){
        for( int i =1; i < array.length; i++ ){
            if ( array[i] > array [i-1] )
                return false;
        }
        return true;
    }

    public static boolean isDecreasing(int [] array){
        for( int i =1; i < array.length; i++ ){
            if ( array[i] < array [i-1] )
                return false;
        }
        return true;
    }


}
