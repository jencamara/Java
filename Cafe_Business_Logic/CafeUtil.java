import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    public void militaryHoursTest(){
        int[] militaryHoursTest = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
            System.out.println(Arrays.toString(militaryHoursTest));
    }
    // public String specialsAlert(){
    //         String specialsAlert= "Buy one get one free for the next 15 minutes!";
    //         System.out.println(specialsAlert);
    //         return specialsAlert;
    // }
    public void specialsAlert(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Buy one get one free for the next 15 minutes!");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Buy one get one free for the next 15 minutes!");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Buy one get one free for the next 15 minutes!");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Stay tuned for deals announced throughout the day.");
        list.add("Buy one get one free for the next 15 minutes!");
            System.out.println(list);
    }
    public int leadsAtDay10(){
        int[] leadsAtDay10 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i : leadsAtDay10){
            sum += i;
        }
        return sum;
    }
    public void displayMenu(String[] menu){
            for(int i=0; i<menu.length; i++){
                System.out.println(menu[i]);
            }
    }
    
    public double getOrderTotal(double[] lineItems){
            double sum = 0;
                for(double price: lineItems){
                    sum +=price;
                }
            return sum;
        }
            
    public double getHighestPrice(double[] priceIndex){
        double highest = priceIndex[0];
            for (double currentPrice: priceIndex){
                if (currentPrice > highest);
                highest = currentPrice;
            }
        return highest;
    }
}
    // public String raffleWinners(){
    //     String[] customers = {
    //         "Cindhuri", "Noah", "Sam", "Jimmy", 
    //         "Ian Curtis", "Ada", "Brandon Stantman", 
    //         "Zoe", "Jesse"};
    //         Randon random = new Random();
    //         int select = random.nextInt(arr.length);

    //         System.out.println(arr.select)
    // }

    