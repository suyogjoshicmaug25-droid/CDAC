class GoodMorning {
   public static void main(String args[]) {
        int time = 10;
        if (time >= 5  && time < 12) {
            System.out.println("Good Morning!");
        } else if (time >= 12 && time < 17) {
            System.out.println("Good Afternoon!");
        } else if (time >= 17 && time < 21) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }
   }


}
