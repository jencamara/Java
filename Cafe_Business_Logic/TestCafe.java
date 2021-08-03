
public class TestCafe {
    public static void main(String[] args) {
        // All you need to add in this file:
        // Create an instance of the CafeUtil class
        // in order to use the methods. Hint: it will need 
        // to correspond with the variable name used below..
        // App Test Cases
        CafeUtil appTest = new CafeUtil();
        System.out.println("----- Military Hours Test -----");
        appTest.militaryHoursTest();
        
        System.out.println("----- Special Alerts Test -----");
        appTest.specialsAlert();

        System.out.println("Leads at day 10: %s \n", appTest.leadsAtDay10());

        System.out.println("----- Display Menu Test-----");
        appTest.displayMenu(menu1);   
        appTest.displayMenu(menu2);   
        
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

        System.out.printf("Highest price: %s \n",appTest.getHighestPrice(priceIndex));

        System.out.println(appTest.raffleWinners(customers));
        
    }
}
