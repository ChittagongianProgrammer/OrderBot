import java.util.ArrayList;

/**
 * Write a description of class OrderBot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderBot
{
    // instance variables - replace the example below with your own
    private int tableNumber;
    private String Order;
    private OrderBot bot;
    private ArrayList<String> menu;
    private int waitTime;
    /**
     * Constructor for objects of class OrderBot
     */
    public OrderBot()
    {
        menu = new ArrayList<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOrder(int tableNumber, int orderHour, int orderMinute, String Order)
    {
        System.out.println(tableNumber);
        System.out.println(orderHour + ":" + orderMinute);
        System.out.println(Order);
    }

    public int calculateWaitTime(int orderHour, int orderMinute, int cookHour, int cookMinute){
        int orderTime = ((orderHour*60) + orderMinute);
        int cookTime =((cookHour*60) + cookMinute);
        int waitTime = cookTime - orderTime;
        
        if (cookHour < 0 || cookHour > 23){
            waitTime = -1;
        }
        if (cookMinute < 0 || cookMinute > 59){
            waitTime = -1; 
        }
        if (orderMinute < 0 || orderMinute > 59){
            waitTime = -1; 
        }
        if (orderHour < 0 || orderHour > 23){
            waitTime = -1;
        }
        if (orderTime > cookTime){
            waitTime = -1;
        }
        return waitTime;
    }
    
    public ArrayList<String> getMenu(){
        return menu;
    }
    
    public void addDish(String makingMenu){
        if (makingMenu != ""){
            menu.add(makingMenu);
        } 
    }
    
    public void printOrderByNumber(int dishNumbers, int tableNumbers, int orderHour, int orderMinute){
        String dishNames = menu.get(dishNumbers);
        System.out.println(dishNumbers);
        this.printOrder(tableNumbers, orderHour, orderMinute, dishNames);
    }
}
