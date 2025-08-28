 class LargestAmongThree {
    public static void main(String[] args) {
        int num1 = 10; // Example value for num1
        int num2 = 20; // Example value for num2
        int num3 = 15; // Example value for num3

        // if (num1 >= num2 && num1 >= num3) {
        //     System.out.println("Largest number is: " + num1);
        // } else if (num2 >= num1 && num2 >= num3) {
        //     System.out.println("Largest number is: " + num2);
        // } else {
        //     System.out.println("Largest number is: " + num3);
        // }
        int largest = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
        System.out.println("Largest number is: " + largest);
    }
}
