
public class Main {
    public static void main(String[] args) {
        DeluxPizza deluxPizza = new DeluxPizza(true);
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        deluxPizza.takeAway();
        deluxPizza.getBill();
        basePizza.getBill();
    }
}