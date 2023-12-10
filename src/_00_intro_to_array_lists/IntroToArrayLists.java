package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> ppls = new ArrayList<String>();
		//2. Add five Strings to your list
		ppls.add("Boi");
		ppls.add("Man");
		ppls.add("Homie");
		ppls.add("Walter");
		ppls.add("Jesse");
		//3. Print all the Strings using a standard for-loop DONE
		for(int i = 0; i < ppls.size();i++ ) {
			String thing = ppls.get(i);
			System.out.println(thing);
		}
		
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop DONE
		for(String fEach : ppls){
			System.out.println(fEach);
		}
		
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list. DONE
		
		for(int i = 0; i < ppls.size();i++) {
			if (i % 2 == 0) {
				String numero = ppls.get(i);
				System.out.println(numero);
			}
		}
		
		System.out.println("\n");
		//6. Print all the Strings in reverse order. DONE
		for( int i = ppls.size(); i > 0;i-- ) {
			String rev = ppls.get(i - 1);
			System.out.println(rev);
		}
		
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them. DONE
		for(int i = 0; i < ppls.size();i++ ) {
			String eFinder = ppls.get(i);
			if(eFinder.contains("e")) {
				System.out.println(eFinder);
			}
		}
	}
}


// Nothing Else to Work on Here