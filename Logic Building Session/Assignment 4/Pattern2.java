class Pattern2{
	/* 
	
	1
	1*2
	1*2*3
	1*2*3*4
	1*2*3*4*5
	
	*/
	public static void main(String[] args){
		int i,j,k;
		for(i = 1;i<=5;i++){
			k=1;
			for(j=1;j<=(2*i-1);j++){
				
				if(j % 2 == 0){
					System.out.print("*");
				}
				else{
					System.out.print(k++);
				}
			}
			System.out.println();
		}
	}
}