package Builder;

public class VeganBurger extends BurgerBuilder{
    @Override
    void buildBun() {
        burger.setBun("Vegan Bread");
    }
    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }
    @Override
    void buildSalad() {
        burger.setSalad("Salad");
    }
    @Override
    void buildCheese() {
        burger.setCheese("Vegan Cheese");
    }
    @Override
    void buildSauce() {
        burger.setSauce("Viega Sauce");
    }
}
