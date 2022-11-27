public abstract class  Restaurant // Abstract class
{
    protected String name;

    public Restaurant(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    static void MainMenu()
    {
        System.out.println("\n\t\t1. Food Menu               2. Drink Menu");
        System.out.println("\n\t\t\t\t3. Exit                            ");
    }

    static double totalPrice = 0;       // Total Price initialized to 0

    static void welcome()
    {
        System.out.println("\n\t\t\tWELCOME TO UNITY UNIVESITY RESTAURANT");
    }

    public abstract void TY(); // Abstract Methiod
}