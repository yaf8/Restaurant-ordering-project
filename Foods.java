public class Foods extends Restaurant implements foodPrice
{
    
        // Food Name    //Ethiopian Foods
    static String F1N = "Special Burger"; 
    static String F2N = "Special Pizza";
    static String F3N = "Pasta";
    static String F4N = "Ertib";
    static String F5N = "Firfir";
    static String F6N = "Kuanta Firfir";
    static String F7N = "Enkualal Firfir";
    static String F8N = "Tibs";
    static String F9N = "Mahiberawi";
    static String F10N = "Tegabino";

        // Food Description
    static String F1D = "brioche burger buns, unsalted butter, minced beef, cheese slices, pickles";
    static String F2D = "Pizza dough, teaspoon salt, canned mushrooms, shredded mozzarella cheese, pepperoni, Boboli pizza crusts";
    static String F3D = "Eggs, Olive oil, Salt, All-purpose flour";
    static String F4D = "Eggs, Olive oli, bread, Chips, Paper";
    static String F5D = "Injera, Paper, Water, Salt, spices";
    static String F6D = "Beef, Injera, Paper, Water, Salt, Speices";
    static String F7D = "Eggs, Salt, bread, speices";
    static String F8D = "Beef, unsalted butter, Beef, injera, speices";
    static String F9D = "Shire, Misir, Tibs, Kikil, Atikilt, Alicha, Minchet";
    static String F10D = "Injera, Salt, Red and White Onion, Shiro, water, tomato, Food butter(choice)";

    // count number of Foods ordered
    static int countF = 0;
    
    public Foods(String name)
    {
        super(name);
        countF++;
    }

    public static void foodMenu() // Food Menu      /Ethiopian Food Menu
    {
        System.out.println("\t--------------------------------------------------------------  ");
        System.out.println("\t                         Food Menu                              ");
        System.out.println("\t--------------------------------------------------------------  ");
        System.out.println("\t1. Special Burger                         6. Kuanta Firfir      ");
        System.out.println("\t2. Special Pizza                          7. Enkualal Firfir    ");
        System.out.println("\t3. Pasta                                  8. Tibs               ");
        System.out.println("\t4. Ertib                                  9. Mahiberawi         ");
        System.out.println("\t5. Firfir                                10. Tegabino           ");
        System.out.println("\t--------------------------------------------------------------  ");
    }

    @Override
        public void TY(){ // Defining the Abstract class by overriding
        System.out.println("\n\tThank " + name + " you for Choosing Us!");
        System.out.println();
    }

}