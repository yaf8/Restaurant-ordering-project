import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantMain implements foodPrice, drinksPrice, tax
{
    public static void main(String[] args) throws Exception
    {   
        Scanner input = new Scanner(System.in);
        try 
        {
            Foods order[]; // Creating array of object reference with SUB class for FOODS
            Restaurant order1[]; // Creating array of object refernce with SUPER class for DRINKS
            
            char  cho;
            int choice1;

            Restaurant.welcome(); // Display welcome 
            System.out.println();
            
            System.out.print("\tPlease Enter your Name : " );
            String NAME = input.nextLine();
            System.out.println();
            
            do
            {
                int choice2;
                Restaurant.MainMenu(); // Displays Main Menu
                System.out.println();

                System.out.print("   Enter your choice : ");
                choice1 = input.nextInt();
                System.out.println();
                switch(choice1)
                {
                    case 1: // Food Menu
                    {
                        int choice3;
                        Foods.foodMenu(); // Displays Foods Menu
                        System.out.println();

                        System.out.print("   Enter your choice : ");
                        choice2 = input.nextInt();
                        System.out.println();
                        
                        if(choice2 == 1){
                            System.out.println("\tOrdered Food : " + Foods.F1N + "          Price : " + F_specialBurger + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 2){
                            System.out.println("\tOrdered Food : " + Foods.F2N + "          Price : " + F_specialPizza + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 3){
                            System.out.println("\tOrdered Food : " + Foods.F3N + "          Price : " + F_pasta + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 4){
                            System.out.println("\tOrdered Food : " + Foods.F4N + "          Price : " + F_ertib + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 5){
                            System.out.println("\tOrdered Food : " + Foods.F5N + "          Price : " + F_firfir + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 6){
                            System.out.println("\tOrdered Food : " + Foods.F6N + "          Price : " + F_kuantaFirfir + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 7){
                            System.out.println("\tOrdered Food : " + Foods.F7N + "          Price : " + F_tibs + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 8){
                            System.out.println("\tOrdered Food : " + Foods.F8N + "          Price : " + F_eggFirfir + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 9){
                            System.out.println("\tOrdered Food : " + Foods.F9N + "          Price : " + F_mahiberawi + " birr"); // Display Ordered Food
                        }
                        else if(choice2 == 10){
                            System.out.println("\tOrdered Food : " + Foods.F10N + "          Price : " + F_shiro + " birr"); // Display Ordered Food
                        }
                        else {
                            System.out.println("\t$ Wrong Input $");
                            break;
                        }

                        System.out.println();
                        
                        System.out.print("   Enter Quantity : "); // The quanity of the foods
                        int q = input.nextInt();

                        System.out.println();
                        order = new Foods[q]; // Creating an Array of object reference
                        
                        Foods.countF = 0;   // Initializing the Number of foods
                        for (int i = 0; i < order.length; i++)
                        {
                            order[i] = new Foods(NAME); // creating food object
                        }

                        do
                        {
                            System.out.println("\t1. Food Description                       ");
                            System.out.println("\t2. Total Price                            ");
                            System.out.println("\t3. Customer Name and Quantity of Order    ");
                            System.out.println("\t4. Exit                                   ");
                            System.out.println();

                            System.out.print("   Enter your choice : ");
                            choice3 = input.nextInt();
                            System.out.println();

                            switch(choice3)
                            {
                                case 1: // Food Description
                                {

                                    if(choice2 == 1)
                                        System.out.println( "\t Ingredients : " + Foods.F1D); // Display Food's Description
                                    else if(choice2 == 2)
                                        System.out.println( "\t Ingredients : " + Foods.F2D); // Display Food's Description
                                    else if(choice2 == 3)
                                        System.out.println( "\t Ingredients : " + Foods.F3D); // Display Food's Description
                                    else if(choice2 == 4)
                                        System.out.println( "\t Ingredients : " + Foods.F4D); // Display Food's Description
                                    else if(choice2 == 5)
                                        System.out.println( "\t Ingredients : " + Foods.F5D); // Display Food's Description
                                    else if(choice2 == 6)
                                        System.out.println( "\t Ingredients : " + Foods.F6D); // Display Food's Description
                                        else if(choice2 == 7)
                                        System.out.println( "\t Ingredients : " + Foods.F7D); // Display Food's Description
                                    else if(choice2 == 8)
                                        System.out.println( "\t Ingredients : " + Foods.F8D); // Display Food's Description
                                    else if(choice2 == 9)
                                        System.out.println( "\t Ingredients : " + Foods.F9D); // Display Food's Description
                                    else if(choice2 == 10)
                                        System.out.println( "\t Ingredients : " + Foods.F10D); // Display Food's Description
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    } 

                                    System.out.println();
                                }break;
                                
                                case 2: // Total Price
                                {
                                    Foods.totalPrice = 0; // Initializing Total Price
                                    for(int i = 0; i < q; i++)
                                    {
                                        if(choice2 == 1){
                                            Foods.totalPrice += F_specialBurger; // Increamenting Total Price
                                        }
                                        else if(choice2 == 2){
                                            Foods.totalPrice += F_specialPizza; // Increamenting Total Price
                                        }
                                        else if(choice2 == 3){
                                            Foods.totalPrice += F_pasta; // Increamenting Total Price
                                        }
                                        else if(choice2 == 4){
                                            Foods.totalPrice += F_ertib; // Increamenting Total Price
                                        }
                                        else if(choice2 == 5){
                                            Foods.totalPrice += F_firfir; // Increamenting Total Price
                                        }
                                        else if(choice2 == 6){
                                            Foods.totalPrice += F_kuantaFirfir; // Increamenting Total Price
                                        }
                                        else if(choice2 == 7){
                                            Foods.totalPrice += F_tibs; // Increamenting Total Price
                                        }
                                        else if(choice2 == 8){
                                            Foods.totalPrice += F_eggFirfir; // Increamenting Total Price
                                        }
                                        else if(choice2 == 9){
                                            Foods.totalPrice += F_mahiberawi; // Increamenting Total Price
                                        }
                                        else if(choice2 == 10){
                                            Foods.totalPrice += F_shiro; // Increamenting Total Price
                                        }
                                        else {
                                            System.out.println("\t$ Wrong Input $");
                                            break;
                                        } 
                                    }
                                    
                                    if(choice2 == 1){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##  " + Foods.F1N + "          " + Foods.countF + "                    " + Foods.F_specialBurger + "            " + (tax * 100) + "              " + (Math.ceil(tax * Foods.totalPrice)));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + (Math.ceil(((Foods.totalPrice + ( Foods.totalPrice * tax))))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 2){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##  " + Foods.F2N + "           " + Foods.countF + "                    " + Foods.F_specialPizza + "             " + (tax * 100) + "                  " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 3){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F3N + "               " + Foods.countF + "                    " + Foods.F_pasta + "             " + (tax * 100) + "                " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 4){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F4N + "               " + Foods.countF + "                    " + Foods.F_ertib + "               " + (tax * 100) + "                " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ====================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 5){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F5N + "              " + Foods.countF + "                    " + Foods.F_firfir + "               " + (tax * 100) + "                " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 6){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##  " + Foods.F6N + "           " + Foods.countF + "                    " + Foods.F_kuantaFirfir + "             " + (tax * 100) + "               " + (Math.ceil(tax * Foods.totalPrice)));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 7){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##  " + Foods.F7N + "         " + Foods.countF + "                    " + Foods.F_eggFirfir + "             " + (tax * 100) + "                " + (Math.ceil(tax * Foods.totalPrice)));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 8){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F8N + "                " + Foods.countF + "                    " + Foods.F_tibs + "               " + (tax * 100) + "               " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ====================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                        }
                                    else if(choice2 == 9){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F9N + "          " + Foods.countF + "                     " + Foods.F_mahiberawi + "              " + (tax * 100) + "                " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else if(choice2 == 10){
                                        System.out.println("\t**      Item             Quantity             Price (birr)        Tax (%)          Tax Price (birr) ");
                                        System.out.println("\t        ----             --------             ------------        -------          ---------------- ");
                                        System.out.println("\t##      " + Foods.F10N + "            " + Foods.countF + "                     " + Foods.F_shiro + "              " + (tax * 100) + "                " + Math.ceil(tax * Foods.totalPrice));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println("\t    Total Price  ===================================================================== " + Math.ceil( (Foods.totalPrice + ( Foods.totalPrice * tax))));
                                        System.out.println("\t----------------------------------------------------------------------------------------------------- ");
                                        System.out.println();
                                    }
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    } 

                                }break;

                                case 3: // Quantity
                                {
                                    System.out.println("\t\t                -----------");
                                    System.out.println("\t\t# Ordered By :  | " + order[0].getName() + " |");       // Display Customer Name
                                    System.out.println("\t\t                ------------");

                                    if(choice2 == 1){
                                        System.out.println("\tNumber of \'" + Foods.F1N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 2){
                                        System.out.println("\tNumber of \'" + Foods.F2N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 3){
                                        System.out.println("\tNumber of \'" + Foods.F3N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 4){
                                        System.out.println("\tNumber of \'" + Foods.F4N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 5){
                                        System.out.println("\tNumber of \'" + Foods.F5N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 6){
                                        System.out.println("\tNumber of \'" + Foods.F6N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 7){
                                        System.out.println("\tNumber of \'" + Foods.F7N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 8){
                                        System.out.println("\tNumber of \'" + Foods.F8N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 9){
                                        System.out.println("\tNumber of \'" + Foods.F9N + "\' ordered : " + Foods.countF);
                                    }
                                    else if(choice2 == 10){
                                        System.out.println("\tNumber of \'" + Foods.F10N + "\' ordered : " + Foods.countF);
                                    }
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    } 
                                    System.out.println();

                                }break;

                                case 4: // Exit
                                {
                                    System.out.println("\tExited From Food");
                                }break;
                                    
                                default: // other input
                                {
                                    System.out.println("\t$ Wrong Input $  Please try again... "); // Display wrong input
                                    System.out.println();
                                }break;
                            } 
                        }while(choice3 != 4);
                        order[0].TY();

                    }break;

                    case 2: // Drink Menu
                    {
                        int cho1;
                        Drinks.drinkMenu(); //Displays Drinks Menu

                        System.out.print("   Enter your choice : ");
                        cho = input.next().charAt(0);
                        System.out.println();

                        if(cho == 'a' || cho == 'A'){
                            System.out.println("\tordered Drink : " + Drinks.D1N + " Price : " + D1P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == 'b' || cho == 'B'){
                            System.out.println("\tordered Drink : " + Drinks.D2N + " Price : " + D1P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == 'c' || cho == 'C'){
                            System.out.println("\tordered Drink : " + Drinks.D3N + " Price : " + D1P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == 'd' || cho == 'D'){
                            System.out.println("\tordered Drink : " + Drinks.D4N + " Price : " + D1P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == '2'){
                            System.out.println("\tordered Drink : " + Drinks.D5N + " Price : " + D2P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == '3'){
                            System.out.println("\tordered Drink : " + Drinks.D6N + " Price : " + D3P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == '4'){
                            System.out.println("\tordered Drink : " + Drinks.D7N + " Price : " + D4P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == '5'){
                            System.out.println("\tordered Drink : " + Drinks.D8N + " Price : " + D5P + " birr"); // Display ordered Drinks
                        }
                        else if(cho == '6'){
                            System.out.println("\tordered Drink : " + Drinks.D9N + " Price : " + D6P + " birr"); // Display ordered Drinks
                        }else{
                            System.out.println("\t$ Wrong Input $");
                            break;
                        }
                            
                        System.out.println();

                        System.out.print("   Enter Quantity : "); // The quanity of the Drinks
                        int q = input.nextInt();

                        System.out.println();
                        order1 = new Restaurant[q]; // creating object reference

                        Drinks.countD = 0;   // Initializing the Number of Drinks
                        for (int i = 0; i < order1.length; i++)
                        {
                            order1[i] = new Drinks(NAME); // creating Drinks object from Restaurant object  ** upcasting
                        }
                        do
                        {
                            System.out.println("\t1. Drinks Description                     ");
                            System.out.println("\t2. Total Price                            ");
                            System.out.println("\t3. Customer Name and Quantity of Order    ");
                            System.out.println("\t4. Exit                                   ");
                            System.out.println();

                            System.out.print("   Enter your choice : ");
                            cho1 = input.nextInt();
                            System.out.println();

                            switch(cho1)
                            {
                                case 1: // Drinks Description
                                {

                                    if(cho == 'a' || cho == 'A' || cho == 'b' || cho == 'B' || cho == 'c' || cho == 'C' || cho == 'd' || cho == 'D')
                                        System.out.println( "\t Ingredients : " + Drinks.softdinksD);    // Display Drinks's Description
                                    else if(cho == '2')
                                        System.out.println( "\t Ingredients : " + Drinks.teaD);          // Display Drinks's Description
                                    else if(cho == '3')
                                        System.out.println( "\t Ingredients : " + Drinks.milkD);         // Display Drinks's Description
                                    else if(cho == '4')
                                        System.out.println( "\t Ingredients : " + Drinks.mikiatoD);      // Display Drinks's Description
                                    else if(cho == '5')
                                        System.out.println( "\t Ingredients : " + Drinks.predatorD);     // Display Drinks's Description
                                    else if(cho == '6')
                                        System.out.println( "\t Ingredients : " + Drinks.sofimaltD);     // Display Drinks's Description
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    }
                                    System.out.println();

                                }break;
                                
                                case 2: // Total Price
                                {
                                    Drinks.totalPrice = 0; // Initializing Total Price
                                    for(int i = 0; i < q; i++)
                                    {
                                        if(cho == 'a' || cho == 'A'){
                                            Drinks.totalPrice += D1P;       // Increamenting Total Price
                                        }
                                        else if(cho == 'b' || cho == 'B'){
                                            Drinks.totalPrice += D1P;       // Increamenting Total Price
                                        }
                                        else if(cho == 'c' || cho == 'C'){
                                            Drinks.totalPrice += D1P;       // Increamenting Total Price
                                        }
                                        else if(cho == 'd' || cho == 'D'){
                                            Drinks.totalPrice += D1P;       // Increamenting Total Price
                                        }
                                        else if(cho == '2'){
                                            Drinks.totalPrice += D2P;       // Increamenting Total Price
                                        }
                                        else if(cho == '3'){
                                            Drinks.totalPrice += D3P;       // Increamenting Total Price
                                        }
                                        else if(cho == '4'){
                                            Drinks.totalPrice += D4P;       // Increamenting Total Price
                                        }
                                        else if(cho == '5'){
                                            Drinks.totalPrice += D5P;       // Increamenting Total Price
                                        }
                                        else if(cho == '6'){
                                            Drinks.totalPrice += D6P;       // Increamenting Total Price
                                        }
                                        else {
                                            System.out.println("\t$ Wrong Input $");
                                            break;
                                        } 
                                    }
                                    
                                    if(cho == 'a' || cho == 'A'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D1N);
                                        System.out.println("\tPrice  : " + Drinks.D1P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D1P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D1P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == 'b' || cho == 'B'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D2N);
                                        System.out.println("\tPrice  : " + Drinks.D1P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D1P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D1P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == 'c' || cho == 'C'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D3N);
                                        System.out.println("\tPrice  : " + Drinks.D1P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D1P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D1P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == 'd' || cho == 'D'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D4N);
                                        System.out.println("\tPrice  : " + Drinks.D1P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D1P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D1P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == '2'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D5N);
                                        System.out.println("\tPrice  : " + Drinks.D2P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D2P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D2P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == '3'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D6N);
                                        System.out.println("\tPrice  : " + Drinks.D3P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D3P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D3P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == '4'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D7N);
                                        System.out.println("\tPrice  : " + Drinks.D4P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D4P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D4P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else if(cho == '5'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D8N);
                                        System.out.println("\tPrice  : " + Drinks.D5P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D5P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D5P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                        }
                                    else if(cho == '6'){
                                        System.out.println("\t=========================");
                                        System.out.println("\tItem : " + Drinks.D9N);
                                        System.out.println("\tPrice  : " + Drinks.D6P + " BIRR");
                                        System.out.println("\tTax : 15 %");
                                        System.out.println("\tTax Price  : " + Math.ceil(tax * Drinks.D6P) + " BIRR");
                                        System.out.println("\tQuantity : " + Drinks.countD);
                                        System.out.println("\tTotal Tax Price  : " + Math.ceil((Drinks.countD * (Drinks.D1P * tax))) + " BIRR");
                                        System.out.println("\t------------------------");
                                        System.out.println("\tTotal  : " + Math.ceil((Foods.totalPrice + ( Foods.totalPrice * tax))) + " BIRR");
                                        System.out.println("\t========================");
                                        System.out.println();
                                    }
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    } 

                                }break;

                                case 3: // Quantity
                                {

                                    if(order1[0] instanceof Drinks) // check if order1 is instanceof Drinks
                                    {
                                        Drinks dr = (Drinks) order1[0];     // Downcasting
                                        System.out.println("\t\t               ----------");
                                        System.out.println("\t\tOrdered By :   | " + dr.getName() + " |");      // Display Customer Name
                                        System.out.println("\t\t               ----------");
                                    }
                                           
                                    
                                    if(cho == 'a' || cho == 'A'){
                                        System.out.println("\tNumber of \'" + Drinks.D1N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == 'b' || cho == 'B'){
                                        System.out.println("\tNumber of \'" + Drinks.D2N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == 'c' || cho == 'C'){
                                        System.out.println("\tNumber of \'" + Drinks.D3N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == 'd' || cho == 'D'){
                                        System.out.println("\tNumber of \'" + Drinks.D4N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == '2'){
                                        System.out.println("\tNumber of \'" + Drinks.D5N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == '3'){
                                        System.out.println("\tNumber of \'" + Drinks.D6N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == '4'){
                                        System.out.println("\tNumber of \'" + Drinks.D7N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == '5'){
                                        System.out.println("\tNumber of \'" + Drinks.D8N + "\' ordered : " + Drinks.countD);
                                    }
                                    else if(cho == '6'){
                                        System.out.println("\tNumber of \'" + Drinks.D9N + "\' ordered : " + Drinks.countD);
                                    }
                                    else {
                                        System.out.println("\t$ Wrong Input $");
                                        break;
                                    } 
                                    System.out.println();

                                }break;

                                case 4: // Exit
                                {
                                    System.out.println("\tExited From Drinks");
                                }break;
                                    
                                default: // other input
                                {
                                    System.out.println("\t$ Wrong Input $  Please try again... "); // Display wrong input
                                    System.out.println();
                                }break;
                            } // switch 2
                        
                        }while(cho1 != 4);
                        order1[0].TY();

                    }break; //case 2

                    case 3:
                        System.out.println("\tExited");
                        break;
                    
                    default:
                        System.out.println("\t$ Wrong Input $");
                        break;
                } // swtich 1
            }while(choice1!=3);
            
        }catch(InputMismatchException IME) // Catches InputMissmatch Exceptions
        {
            System.out.println();
            System.err.println("\tInput Miss Matched");
        }catch(Exception e) // catches All Exceptions
        {
            System.out.println();
            System.err.println("\tExceptection Handled");
        }

        input.close();
    }
      
}

/*
                  Group Members
          Name                       ID
    1. Yafet Abebe                 UU78211R
    2. Metasebia Henok             UU78420R
    3. Mubarek Jemal               UU78215R
    4. Surafel Doju                UU82878R
    5. Yohannis Tilahun            UU80074R  
    6. Natnale abebe               UU78726R 
 */
