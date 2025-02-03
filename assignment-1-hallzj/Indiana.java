public class Indiana extends State {

    //constructor
    public Indiana(String name) {
        super(name);
//        super.taxType = new SevenPercent();
    }

    @Override
    public void showTax(double value) {
        //when called, print out the value that the tax is being run on, the name, and the total tax
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getName(), taxType.compute(value));
    }
}
