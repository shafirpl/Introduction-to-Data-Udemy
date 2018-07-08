
public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasDuplicateChars("great"));
	}
	
	public static boolean hasDuplicateChars(String s) {
		for (int i=0; i<s.length();i++){
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

}
