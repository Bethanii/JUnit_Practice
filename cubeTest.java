/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
//importing libraries fpr testing
import static org.junit.Assert.*;
import org.junit.Test;

//class contaning my test cases
public class cubeTest 
{
    //methods to test cube surface area
    //using @test to indicate that this method is a test
    @Test
    public void surfAreaTest_1()
    {
    //calling the static method (surfaceArea) using classname
    int result = Cube.surfaceArea(1);
    //testing the expected versus the actual result
    assertEquals(6, result);
    }

    @Test
    public void surfAreaTest_2()
    {
        int result = Cube.surfaceArea(5);
        assertEquals(150, result);
    }

    //Failing test
    @Test 
    public void surfAreaTest_Fail()
    {
        int result = Cube.surfaceArea(1);
        assertEquals(5, result);
    }
}