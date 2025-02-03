import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        //the state being created
        State state = new State("");

        //get name and amount information
//        String name = scan.nextLine();
//        double amount = Double.parseDouble(scan.nextLine());

        //args 0 = input name
        //args 1 = input amount
        String name = args[0];
        double amount = Double.parseDouble(args[1]);


        //check for which state was asked for
        if(name.equals("Indiana"))
        {
            //create the object, and print out tax info
            state = new Indiana("Indiana");
            //set tax type
            state.setTaxType(new SevenPercent());
            state.showTax(amount);
        }
        else if (name.equals("Alaska"))
        {
            //create the object, and print out tax info
            state = new Alaska("Alaska");
            //set tax type
            state.setTaxType(new NoTax());
            state.showTax(amount);
        }
        else if (name.equals("Hawaii"))
        {
            //create the object, and print out tax info
            state = new Alaska("Alaska");
            //set tax type
            state.setTaxType(new FourPointFivePercent());
            state.showTax(amount);
        }
        else
        {
            //Otherwise print out invalid value
            System.out.println("Invalid Value");
        }
    }
}
