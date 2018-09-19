package hackerRanck;

import java.io.IOException;
import java.util.Scanner;

public class Sherlock {

    // Complete the squares function below.
    static int squares(int a, int b) {

		int inicio = a;
		int fim = b;
		int count = 0;

		for (long i = inicio; i <= fim; i++) {

			//verifica se é raiz quadrada perfeita
			if (isSquareInteger(i)) {
				
				long sqrt = (long) Math.sqrt(i);
				i = i + sqrt + sqrt;
				count++;
			}

		}

		return count;
    }

    
    public static boolean isSquareInteger(long valor) {
    	long square = (long) Math.sqrt(valor);
    	return square * square == valor;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    	
        for (int qItr = 0; qItr < 1; qItr++) {
            String[] ab = {"17", "24"};//scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);
            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

//        scanner.close();
    }
}
