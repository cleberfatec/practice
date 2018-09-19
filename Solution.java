package hackerRanck;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
	
	private static Set<Character> convertStringToSet(String s) {
		Set<Character> set = new HashSet<Character>();											    
		
		for (char c : s.toCharArray()) {
			set.add(Character.valueOf(c));
		}
		return set;
	};

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
    	
    	final List<String> rochas = Arrays.asList(arr);
    	
    	if (!tamanhoComposicaoValida(rochas) && !quantidadeRochasValidas(rochas)) {
    		return -1;
    	};
    	
    	final List<String> elementosPossiveis = Arrays.asList("a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" "));
    	 
		final List<String> gemStones = 
				elementosPossiveis.stream().filter(elemento -> rochas.stream().filter(rocha -> rocha.contains(elemento))
																		      .count() == rochas.size())
												.collect(Collectors.toList());
    	
    	return gemStones.size();
    }
    
    /*
     * Validar o tamanho do elemento
     */
    public static boolean tamanhoComposicaoValida(List<String> rochas) {    	
    	return rochas.stream().filter(r -> r.length() > 100).collect(Collectors.toList()).size() > 0;
    }
    
    /*
     * Validar a quantidade de rochas
     */
    public static boolean quantidadeRochasValidas(List<String> rochas) {    	
    	return rochas.size() >= 1 && rochas.size() <= 100;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = {"abcdde", "baccd","eeabg"};

//        for (int i = 0; i < arr.; i++) {
//            String arrItem = scanner.nextLine();
//            arr[i] = arrItem;
//        }

        int result = gemstones(arr);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
