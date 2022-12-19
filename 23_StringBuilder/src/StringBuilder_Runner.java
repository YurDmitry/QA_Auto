public class StringBuilder_Runner {
	
	public static void main(String[] args) {
		String str = "Beauty and wisdom are seldom found together.";
		StringBuilder  strBuffer = new StringBuilder(str);
		System.out.println("Capacity: " + strBuffer.capacity());
		strBuffer.ensureCapacity(62);
		System.out.println("Capacity: " + strBuffer.capacity()); 
		System.out.println("Length: " + strBuffer.length()); 
		
		System.out.println(str.substring(0, 17));
		System.out.println(str.substring(18)); 
		
		System.out.println(strBuffer);
		System.out.println(strBuffer.deleteCharAt(1));		
	}
}
