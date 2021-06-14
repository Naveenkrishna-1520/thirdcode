package testingClass;

public class TestMethods {	
	public int square(int x) {
		return x * x;
	}
	
	public int getCount(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
		
	}
	
}
