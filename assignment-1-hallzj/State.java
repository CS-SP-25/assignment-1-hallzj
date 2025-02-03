public class State {

    private String name;
    protected SalesTaxBehavior taxType;

    //constructor
    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SalesTaxBehavior getTaxType() {
        return taxType;
    }

    //used to dynamically set tax type
    public void setTaxType(SalesTaxBehavior taxType) {
        this.taxType = taxType;
    }

    //shows the tax on the input value
    public void showTax(double value)
    {
        System.out.println("The sales tax on $[SALE] in [STATE] is $[TAX].");
    }

}
