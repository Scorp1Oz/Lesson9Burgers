public class Project {
    public static void main(String[] args) {
        System.out.println("Creating a regular burger:");
        Burger regularBurger = new Burger("Regular Bun", "Beef Patty", "Cheddar Cheese", "Lettuce", "Mayonnaise");

        System.out.println("Creating a diet burger:");
        Burger dietBurger = new Burger("Whole Wheat Bun", "Grilled Chicken", "No cheese", "Spinach");

        System.out.println("Creating a double meat burger:");
        Burger doubleMeatBurger = new Burger("Sesame Bun", "Two Beef Patties");
    }
}
