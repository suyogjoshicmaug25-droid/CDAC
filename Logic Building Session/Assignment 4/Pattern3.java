class Pattern3{
	/*
	
	1
	1*3
	1*3*5
	1*3*5*7
	1*2*5*7*9
	
	*/
	public static void main(String[] args){
		int i,j;
		for(i =1;i<=5;i++){
			for(j=1;j<=(2*i-1);j++){
				if(j % 2 == 0){
					System.out.print("*");
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}