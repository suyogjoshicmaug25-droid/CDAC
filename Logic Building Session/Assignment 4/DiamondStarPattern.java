class DiamondStarPattern{
	/*
	
	     *
	    ***
	   *****
	  *******
 	 *********
	***********
	 *********
	  *******
	   *****
	    ***
	     *
	*/
	public static void main(String[] args){
		int i,j,k;
		for(i=1;i<=6;i++){
			for(j=1;j<=(6-i);j++){
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=(2*(6-i)-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}