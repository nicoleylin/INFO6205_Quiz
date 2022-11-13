import java.util.Arrays;

public class Question5 {
    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 12, 17]
    public static int[] getStartOfEachValues(int[] arr, int[] values){
        int[] indexes = new int[values.length];
        for(int i=0; i<values.length; i++){
            indexes[i] = -1
        }
        for(int i=0; i < arr.length; i++){
            indexes[i] = Arrays.binarySearch(arr, values[i]);
        }
        return indexes;
    }
}
