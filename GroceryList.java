import java.util.*;


class Untitled {
	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("Enter words the items that you would like to add to your grocery list, when done type done");
		Scanner reader = new Scanner(System.in); 
		List grocery= new ArrayList();
		boolean check = true; 
		do {
		grocery.add(reader.nextLine().toLowerCase()); 
		
		if(grocery.get(i).equals("done")){
			check = false; 
			grocery.remove(i);
		}

		i++;
		
		} while (check == true);
		
		
		Collections.sort(grocery);
		
		for(int j = 0; j < grocery.size(); j++){
		System.out.println(grocery.get(j));
		}
	}
}