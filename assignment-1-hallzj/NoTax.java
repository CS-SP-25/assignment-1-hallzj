public class NoTax implements SalesTaxBehavior {
    @Override
    public Double compute(double value) {
        //returns 0 for no tax
        return value * 0.0;
    }
}
