public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesciption() {
        return beverage.getDesciption() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
