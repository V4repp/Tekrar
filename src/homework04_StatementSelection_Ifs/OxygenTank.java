package homework04_StatementSelection_Ifs;

public class OxygenTank {
    //******************************** Task *********************************

    /*OxygenTank Task: Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far*/

    //******************************* if *********************************

    public static void main(String[] args) {
        int oxygenLevel = 0;

        if (100<oxygenLevel) {
            System.out.println("Your tank is cannot more than %100.");
        }else if (90<oxygenLevel){
            System.out.println("Your tank is full.");
        } else if (80<oxygenLevel) {
            System.out.println("Still ok.");
        } else if (70<oxygenLevel) {
            System.out.println("Dont go too far.");
        } else if (60<oxygenLevel) {
            System.out.println("Start to head back.");
        } else if (50==oxygenLevel) {
            System.out.println("Be careful, you're at 50%.");
        } else if (50<oxygenLevel) {
            System.out.println("Come back your tank less than %50.");
        } else if (oxygenLevel== 0) {
            System.out.println("Your tank is empty.");
        } else if (oxygenLevel<0) {
            System.out.println("Your tank is cannot be less than 0.");
        }

    }
}
