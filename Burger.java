package Builder;

public class Burger {

    // O intuito do builder é "esconder" os códigos, separando a construção
    // do projeto da sua representação.

    private String bun = "No Bun";
    private String meat = "No Meat";
    private String salad = "No Salad";
    private String cheese = "No Cheese";
    private String sauce = "No Sause";

    public void setBun(String bun) { this.bun = bun; }
    public void setMeat(String meat) { this.meat = meat; }
    public void setSalad(String salad) { this.salad = salad; }
    public void setCheese(String cheese) { this.cheese = cheese; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void print() {
        System.out.println(
                "Burger{" +
                    "Bun: " + bun +
                    " - Meat: " + meat +
                    " - Salad: " + salad +
                    " - Cheese: " + cheese +
                    " - Sauce: " + sauce);
    }
}
