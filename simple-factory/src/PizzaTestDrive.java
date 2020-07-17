public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore= new PizzaStore(factory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("greek");
        pizzaStore.orderPizza("pepperoni");
    }
}
