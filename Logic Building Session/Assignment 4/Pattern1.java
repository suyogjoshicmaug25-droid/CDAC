class Pattern1{
	/*
	
	1
	2*2
	3*3*3
	4*4*4*4
	5*5*5*5*5
	5*5*5*5*5
	4*4*4*4
	3*3*3
	2*2
	
	*/
	public static void main(String[] args){
		int i,j;
		//increasing part
		for(i = 1;i<=5;i++){
			for(j = 1;j<=(2*i-1);j++){
				if(j % 2 == 0){
					System.out.print("*");
				}
				else{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		//decreasing part
		for(i = 5;i > 1;i--){
			for(j=1;j<=(2*i-1);j++){
				if(j % 2 == 0){
					System.out.print("*");
				}
				else{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
	}
}