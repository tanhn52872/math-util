package mathutil.test.core;

import org.example.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.beans.ExceptionListener;
import java.sql.SQLException;
@RunWith(value = Parameterized.class)
public class MathUtilityTest {

    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
        };
    }
    @Parameterized.Parameter(value = 0)
    public int actual;
    @Parameterized.Parameter(value = 1)
    public long expected;
    @Test
    public void testIfFactorialThrowException(){
        Assert.assertEquals(expected,MathUtil.Factorial(actual));
    }
}
