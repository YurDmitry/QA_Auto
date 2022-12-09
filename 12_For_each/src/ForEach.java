public class ForEach {
	
	public static void main(String[] args) {
		String[] str = {"I'm still the same."
				, "My heart is still the same."
				, "Like cornflowers in rye, eyes bloom in the face."
				, "A stele of poems, green matting,"
				, "I want to tell you gently."};

		for(String element : str) {	
			System.out.println(element);		
		}
	}
}
