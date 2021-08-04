package vowelproblem;


import java.util.Arrays;
import java.util.Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UniqueVowelCount {
	public static void main(String args[]) {
		
		String line="aaaaaaa ensure that you are present by in a well lit room and free from external noise and disturbances";
		System.out.println(line);
		System.out.println("--------------------------------------");
		System.out.println("-----------converted output----------");
		System.out.println();
		System.out.println(vowelUniquetSort(line));
		
		
	}

	public static String vowelUniquetSort(String line) {
		Map<Integer, String> tm =new TreeMap<>();
		String ar[]=line.split(" ");
		Arrays.sort(ar,Collections.reverseOrder());
		//System.out.println(Arrays.toString(ar));
		for (String word : ar) {
			int uniqueVowelCount=0-uniqueVowel(word);
			if(tm.containsKey(uniqueVowelCount)) {
				String temp=tm.get(uniqueVowelCount);
				temp=temp+" "+word;
				tm.put(uniqueVowelCount, temp);
			}
			else {
				tm.put(uniqueVowelCount, word);
			}
		}
		//System.out.println(tm);
		StringBuilder sb =new StringBuilder();
		for(Entry<Integer, String> e : tm.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		
		return sb.toString().trim();
	}

	private static int uniqueVowel(String word) {
		int count=0;
		if(word.contains("a") || word.contains("A")) count++;
		if(word.contains("e") || word.contains("E")) count++;
		if(word.contains("i") || word.contains("I")) count++;
		if(word.contains("o") || word.contains("O")) count++;
		if(word.contains("u") || word.contains("U")) count++;
		return count;
	}

}
