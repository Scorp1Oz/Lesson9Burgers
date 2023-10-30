public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        displayIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, "no mayo");
    }

    public Burger(String bun, String meat) {
        this(bun, meat, "no cheese", "no greens", "no mayo");
    }

    private void displayIngredients() {
        System.out.println("Burger Ingredients:");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
        System.out.println("Mayo: " + mayo);
        System.out.println();
    }
}