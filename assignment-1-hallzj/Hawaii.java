public class Hawaii extends State {

    public Hawaii(String name) {
        super(name);
    }

    @Override
    public void showTax(double value) {
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getName(), taxType.compute(value));
    }
}
