public class Ejercicio6 {
	public static void main(String[] args) {
		String trimString = " H o l a  Mu n do ";
		Ejercicio6 test =  new Ejercicio6();
		test.trimSpecial(trimString);
	}

	public void trimSpecial(String workString){
		String newString = "";
		for (int i=0; i<workString.length(); i++){
			if (workString.charAt(i) != ' '){
				newString = newString + workString.charAt(i);
			}
		}
		System.out.println(newString);
	}
}