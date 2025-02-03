public class Alaska extends State{

    //constructor
    public Alaska(String name) {
        //assign name
        super(name);
        //assign the sales tax behavior
//        super.taxType = new NoTax();
    }

    @Override
    public void showTax(double value) {
        //when called, print out the value that the tax is being run on, the name, and the total tax
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getName(), taxType.compute(value));
    }
}
