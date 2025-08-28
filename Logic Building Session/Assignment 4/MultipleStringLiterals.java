class MultipleStringLiterals{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hello";
		
		if( (str1 == str2) && (str2 == str3)){
			System.out.println("All strings point to the same object? : true");
		}
		else{
			System.out.println("All strings point to the same object? : false");
		}
	}
}