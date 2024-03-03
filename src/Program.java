import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//declaration of local variables
		String textInput;
		double numberInput;
		Motorcycle motorcycle;
		String report;
		//Instantiate Class Motorcycle
		motorcycle = new Motorcycle();
		//output message
		System.out.println("please enter vehicle identification number: ");
        //Instantiate Class Scanner
		Scanner scanner = new Scanner(System.in);
		//enter VIN at next line
        textInput = scanner.nextLine();
        motorcycle.setVIN(textInput);
        
        //output message
        System.out.println("please enter engine size (cc): ");
        //enter engineSize at next line
        numberInput = scanner.nextDouble();
        motorcycle.setEngineSize((int)numberInput);
        
       //output message 
        System.out.println("please enter invoice price: ");
        //enter invoicePrice at next line
        numberInput = scanner.nextDouble();
        motorcycle.setInvoicePrice(numberInput);
        
        //set result of function to report
        report = motorcycle.toString();
        //printout report
        System.out.println(report);
        //printout the message
        System.out.println("program by Liying Guo" );
        
        scanner.close();
        
        
        
        
        
        
	}

}
