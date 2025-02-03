public class SevenPercent implements SalesTaxBehavior{

    @Override
    public Double compute(double value) {
        //returns 7 percent
        return value * 0.07;
    }
}
