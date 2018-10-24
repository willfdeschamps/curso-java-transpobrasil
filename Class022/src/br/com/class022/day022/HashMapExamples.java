package br.com.class022.day022;

import java.util.HashMap;
import java.util.Map;


public class HashMapExamples {
	
	public static void main(String[] args) {
		
		Map<Integer, String> nomes = new HashMap<Integer, String>();
		
		nomes.put(88, "Fred");
		nomes.put(77, "Anthue");
		//nomes.put(66, null);
		System.out.println();
		
		System.out.println(nomes.get(88));
		System.out.println(nomes.get(77));
		
		System.out.println(nomes.size());
		
		if (nomes.isEmpty()){
			System.out.println("Est� vazio.");
		}else{
			System.out.println("N�o est� vazio.");
		}
		
		if (nomes.containsValue("Fred")){
			System.out.println("Fred est� entre os nomes.");
		}else{
			System.out.println("Fred n�o est� entre os nomes.");
		}
		
		if (nomes.containsKey(77)){
			System.out.println("O n�mero 77 est� entre as chaves.");
		}else{
			System.out.println("o n�mero 77 n�o est� entre as chaves.");
		}
		
		for (Map.Entry<Integer, String> item : nomes.entrySet()) {
			System.out.printf("%d = %s\n",item.getKey(), item.getValue());
		}


	}

}