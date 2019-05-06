
public class Palindrome {
	public static void main (String[] args) {
		System.out.println("Tacocat is palindrome? " + isPal1("tacocat"));
		System.out.print("Tacocat is palindrome? " + isPal2("tavtcat", 0));
	}

public static boolean isPal1(String S) {
	S = S.toLowerCase();
	for(int i = 0, j = S.length()-1; i<=(S.length()/2); i++, j--) {
		if(S.charAt(i)!=S.charAt(j)) {
			return false;
		}
	}
	return true;
}

public static boolean isPal2(String S, int i) {
	int j = (S.length()-1)-i;
	if(i >= j) return true;
	if (S.charAt(i) != S.charAt(j)) return false;
	return isPal2(S, ++i);
}




}