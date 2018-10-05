package assignment1;
import java.util.ArrayList;
import java.util.Arrays;


public class Q_1_4_12 {
	
    private static void sortedNumbers(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        boolean isArray1Empty = false;
        
        while(!arr1.isEmpty() && !arr2.isEmpty()) {
        	
            if (arr1.get(0) < arr2.get(0)) {
                System.out.print(arr1.get(0) + " ");
                arr1.remove(0);
            } else {
                System.out.print(arr2.get(0) + " ");
                arr2.remove(0);
            }

            isArray1Empty = arr1.isEmpty();
        }

        ArrayList<Integer> nonEmptyArrayList = isArray1Empty ? arr2 : arr1;

        if (isArray1Empty) {
            for (Integer number :
                    nonEmptyArrayList) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
    	
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3,5,6));

        sortedNumbers(arr1, arr2);
    }
}