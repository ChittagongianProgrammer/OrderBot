
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class OrderBotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrderBotTest
{
    /**
     * Default constructor for test class OrderBotTest
     */
    public OrderBotTest()
    {
    }

    @Test
    public void calculateWaitTimeTest(){
        OrderBot bot = new OrderBot();
        assertEquals ( -1 , bot.calculateWaitTime (10 , 15 , 26 , 12));
        assertEquals ( -1 , bot.calculateWaitTime (10 , -10 , 10 , 30));
        assertEquals ( -1 , bot.calculateWaitTime (10 , 10 , 9 , 30));
        assertEquals (40 , bot.calculateWaitTime (10 , 10 , 10 , 50));
        assertEquals (80 , bot.calculateWaitTime (10 , 10 , 11 , 30));
    }

    @Test
    public void addDishTest(){
        OrderBot bot = new OrderBot();
        bot.addDish (" Ocean ␣pie");
        bot.addDish (" Chicago ␣ deep ␣ dish ␣ pizza ");
        bot.addDish (" Chocolate ␣ fudge ␣ cake ");
        assertEquals (" Ocean ␣pie", bot.getMenu().get(0));
        assertEquals (" Chicago ␣ deep ␣ dish ␣ pizza ", bot.getMenu().get (1));
        assertEquals (" Chocolate ␣ fudge ␣ cake ", bot.getMenu().get(2));

        bot.addDish("");
        assertEquals (3 , bot.getMenu().size());
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
