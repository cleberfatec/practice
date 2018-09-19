package hackerRanck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	List<Long> numeros = convertToList(arr);
    	
    	numeros.sort(null);
    	
    	System.out.print(somarMinimo(numeros));
    	System.out.print(" ");
    	System.out.print(somarMaximo(numeros));
    }


	private static List<Long> convertToList(int[] arr) {

		List<Long> numeros = new ArrayList<>();
    	
    	for (int i : arr) { 
    		numeros.add((long)i);
    	}
		return numeros;
	}

	private static long somarMaximo(List<Long> numeros) {
		long total = 0;
    	for (int j = 0; j < numeros.size(); j++) {
    		
    		if (j == 0) {
    			continue;
    		}
    		total += numeros.get(j);
    	}
    	return total;
	}

	private static long somarMinimo(List<Long> numeros) {
		long total = 0;
    	for (int j = 0; j < numeros.size(); j++) {
    		
    		if (j == numeros.size() - 1) {
    			break;
    		}
    		total += numeros.get(j);
    	}
    	return total;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = {"256741038", "623958417", "467905213", "714532089", "938071625"};
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

//        scanner.close();
    }
}
