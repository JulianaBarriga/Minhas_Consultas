package Builder;

public class CheeseBurger extends BurgerBuilder {
    @Override
    void buildBun() {
        burger.setBun("White Bread");
    }
    @Override
    void buildMeat() {
        burger.setMeat("Beef");
    }
    @Override
    void buildSalad() {
        burger.setSalad("Iceberg");
    }
    @Override
    void buildCheese() {
        burger.setCheese("American Cheese");
    }
    @Override
    void buildSauce() {
        burger.setSauce("Secret Sauce");
    }
}
