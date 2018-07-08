
public class Anagrams {

	private String s,y;
	private int uniqueCharacters;
	private int uniqueCharacters2;
	
	Anagrams(String s,String y){
		this.s = s;
		this.y = y;
	}
	
	public boolean isAnagram() {
		
		int charArray[] = new int[128];
		
		if(s.length()!=y.length()) return false;
		
		for(int i=0;i<s.length();i++) {
			int position = (int)s.charAt(i);
			if(charArray[position]==0) {
				uniqueCharacters++;
			}
			charArray[position]++;
		}
		
		for(int i=0;i<y.length();i++) {
			int position = (int)y.charAt(i);
			if(charArray[position]==0) return false;
			charArray[position]--;
			if(charArray[position]==0) uniqueCharacters2++;
			
		}
		if(uniqueCharacters==uniqueCharacters2) return true;
		
		return false;
	}
	
	
}
