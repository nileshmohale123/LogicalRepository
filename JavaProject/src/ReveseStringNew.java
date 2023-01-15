
public class ReveseStringNew {

	public static void main(String[] args) {

	String s="Nilesh", nts="";
	
	char ch;
	
	for(int i=0; i<s.length();i++) {
		
		ch=s.charAt(i);
		
		nts=ch+nts;
		
	}
	System.out.println(nts);
	}
}
