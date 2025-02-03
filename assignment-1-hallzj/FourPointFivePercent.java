public class FourPointFivePercent implements SalesTaxBehavior{
    @Override
    public Double compute(double value) {
        //return value times 4.5%
        return value * 0.045;
    }
}
