public class Drinks extends Restaurant implements drinksPrice
{
        // Price of Soft Drinks     ** not usefull
    private double cocaCola = D1P;
    private double mirinda = D1P;
    private double sprite = D1P;
    private double fanta = D1P;

        // Drink name   //Ethiopian Drinks
    static String D1N = "Coca Cola";
    static String D2N = "Mirinds";
    static String D3N = "Sprite";
    static String D4N = "Fanta";
    static String D5N = "Tea";
    static String D6N = "Milk";
    static String D7N = "Matkiato";
    static String D8N = "Predator";
    static String D9N = "Sofi Malt";
    

        // Drinks description
    static String softdinksD = "carbonated water, high fructose corn syrup (sugar), caramel color, caffeine, citric acid, natural flavors";
    static String teaD = "Tannins (Catechins), Caffeine, Theanine, Saponins";
    static String milkD = "Milk, unsaturated sugar(Lactose)";
    static String mikiatoD = "Milk, Coffie";
    static String predatorD = "Carbonated water, sugar(fructose), caremel color, citric acid, caffeine";
    static String sofimaltD = "Barley, Chabonated water, sugar(fructose), caermal color, citric acid, caffiene"; 

    static int countD = 0;

    public Drinks(String name)
    {
        super(name);
        countD++;
    }

    // Get Price of Soft Drinks     ** not usefull
    public double getCocaCola(){
        return cocaCola;
    }
    public double getMirinda(){
        return mirinda;
    }
    public double getSprite(){
        return sprite;
    }
    public double getFanta(){
        return fanta;
    }

            // Drinks Menu      //Ethiopian Drinks Menu
    public static void drinkMenu()
    {
        System.out.println("\t*  Softdrinks    ");
        System.out.println("\t    a. Cola Cola ");
        System.out.println("\t    b. Mirinda    ");
        System.out.println("\t    c. Sprite    ");
        System.out.println("\t    d. Fanta     ");
        System.out.println("\t2. Tea           ");
        System.out.println("\t3. Milk          ");
        System.out.println("\t4. Mikiato       ");
        System.out.println("\t5. Predator      ");
        System.out.println("\t6. Sofi Malt     ");
        System.out.println();
    }

    @Override
    public void TY() // Defining the Abstract class by overriding
    {
        System.out.println("\n\tThank you for Choosing Us!");
        System.out.println();
    }
}