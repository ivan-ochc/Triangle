package test.java;

import main.java.Rtriangle;
import main.java.RtriangleProvider;
import org.junit.Test;

import static java.util.Arrays.sort;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestTriangle {

    Rtriangle tr = RtriangleProvider.getRtriangle();

    private int x1 = tr.getApexX1();
    private int y1 = tr.getApexY1();
    private int x2 = tr.getApexX2();
    private int y2 = tr.getApexY2();
    private int x3 = tr.getApexX3();
    private int y3 = tr.getApexY3();

    private int firstSide = (int)Math.pow(x1-x2,2)+(int)Math.pow(y1-y2,2);
    private int secondSide = (int)Math.pow(x1-x3,2)+(int)Math.pow(y1-y3,2);
    private int thirdSide = (int)Math.pow(x2-x3,2)+(int)Math.pow(y2-y3,2);


    @Test
    public void testTriangleSquare(){
        if (firstSide!=0 && secondSide!=0 && thirdSide!=0) {
            int[] sides = new int[]{firstSide, secondSide, thirdSide};
            sort(sides);
            int leg1 = sides[0];
            int leg2 = sides[1];
            int hypotenuse = sides[2];
            assertEquals("sum of legs must be equals to hypotenuse ", leg1 + leg2, hypotenuse);
        } else {
            fail("Sides aren't correct");
        }
    }

    @Test
    public void testTriangleAngles()  {
        if(((x1 == x2) && (y1 == y2)) || ((x2 == x3) && (y2 == y3)) || ((x3 == x1) && (y3 == y1))){
            fail("Points are the same");
        }   else {
                boolean ab = (((y1 - y2)*(y2 - y3) + (x2 - x1)*(x3 - x2)) == 0);
                boolean bc = (((y2 - y3)*(y3 - y1) + (x3 - x2)*(x1 - x3)) == 0);
                boolean ca = (((y3 - y1)*(y1 - y2) + (x1 - x3)*(x2 - x1)) == 0);
                assertTrue("Angle isn't right",ab || bc || ca);
        }
    }
}
