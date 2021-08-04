package stringlong;

public  class LongestWord {

	public static void main(String[] args) {
		String line ="helloooooooooooooooooo how aaaaaaaa are you doingaaaaaaaa";
		System.out.println("Expexted output is : ");
		System.out.println(longest( line));
	}
	public static String longest(String line) {
		String words[]=line.split(" ");
		String out="";
		int temp=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>temp) {
				temp =words[i].length();
			}
		}
			//System.out.println(temp);
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()==temp) {
				out=out+" "+words[i];
			}
		}
		
		//System.out.println(out);
		return out;
	}
}
