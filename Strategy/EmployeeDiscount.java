package Strategy;

public class EmployeeDiscount implements DiscountStrategy {

    @Override
    public double getDiscountedReate() {
        return .8;
    }
    
}
