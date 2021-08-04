package vowelproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class VowelCount {

	public static void main(String[] args) {
		String line="ensure that you are present by in a well-lit room and free from external noise and disturbances";
		System.out.println(line);
		System.out.println("--------------------------------------");
		System.out.println("-----------converted output----------");
		System.out.println();
		System.out.println(vowelCountSort(line));
	}
	public static String vowelCountSort(String line) {
		Map<Integer, String> mp=new TreeMap<>();
		String ar[]=line.split(" ");
		Arrays.sort(ar,Collections.reverseOrder());
		//System.out.println(Arrays.toString(ar));
		for (String word : ar) {
			int vowelCount=0-vowelLength(word);
			if(mp.containsKey(vowelCount)) {
				String temp=mp.get(vowelCount);
				temp=temp+" "+word;
				mp.put(vowelCount, temp);
			}
			else {
				mp.put(vowelCount, word);
			}
		}
		//System.out.println(mp);
		StringBuilder sb =new StringBuilder();
		
		for(Entry<Integer, String> e:mp.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	private static int vowelLength(String ar) {
		
		String s=ar.replaceAll("[^A E I O U a e i o u]","");
		
		
		
		return s.length();
	}
	
}
