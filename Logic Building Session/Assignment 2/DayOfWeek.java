class DayOfWeek {
	public static void main( String[] args) {
		int dayNumber = 9;
		
		switch(dayNumber){
			case 1:
				System.out.println("This day is Monday");
				break;
			case 2:
				System.out.println("This day is Tuesday");
				break;
			case 3:
				System.out.println("This day is Wednesday");
				break;
			case 4:
				System.out.println("This day is Thursday");
				break;
			case 5:
				System.out.println("This day is Friday");
				break;
			case 6:
				System.out.println("This day is Saturday");
				break;
			case 7:
				System.out.println("This day is Sunday");
				break;
			default:
				System.out.println("Invalid Day number.");
			
		}
	}
}