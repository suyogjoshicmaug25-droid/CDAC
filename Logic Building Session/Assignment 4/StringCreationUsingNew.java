class StringCreationUsingNew{
	public static void main(String[] args){
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//check object location 
		if(str1 == str2){
			System.out.println("Using == : true");
		}
		else{
			System.out.println("Using == : false");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// check content
		if(str1.equals(str2)){
			System.out.println("Using .equals : true");
		}
		else{
			System.out.println("Using .equals : false");
		}
	}
}