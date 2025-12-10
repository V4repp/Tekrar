package homework03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        // ************************ Değişkenler ************************************

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double fedaralTaxRate = 0.26;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double fedaraltax = salaryBeforeTax * fedaralTaxRate;
        double totalTax = stateTax + fedaraltax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        // ************************* Nesneler **********************************

        GallonsToLiters gtolt_1 = new GallonsToLiters();
        KilosToPounds kgToPnd = new KilosToPounds();


        // ************************** Çözüm *************************************

        /*
        Bu çözümde ABD Maaş sistemi üzerine bir mantık oluşturdum.
         */

        System.out.println("Gross pay is : $" + salaryAfterTax);
        System.out.println("State tax is : $" + stateTax);
        System.out.println("Fedaral tax : $" + fedaraltax);
        System.out.println("Total Tax : $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


        // *************************** Görev **************************************

       /*
       Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0*/


    }
}
