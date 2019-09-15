import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        String value1 = args[0];

	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        hmap.put('I', 1); 
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);

	int x = toNumbers(hmap, value1);
	System.out.println(x);
  }

	public static int toNumbers(HashMap<Character,Integer> values, String input){
		int numerals = 0;
	for (int i = 0; i < (input.length()) -1; i++){
		int first = values.get(input.charAt(i));
		int next = values.get(input.charAt(i + 1));
		if (next <= first) numerals += first;
		else numerals -= first;
	}
	//account for last numeral
	numerals += values.get(input.charAt(input.length() - 1));
	return numerals;	
	}			
    
}
