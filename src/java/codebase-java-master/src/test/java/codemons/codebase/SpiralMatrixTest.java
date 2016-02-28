package codemons.codebase;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Shivaji on 2/2/2016.
 */
public class SpiralMatrixTest {

    @Test
    public void testCreateSpiralMatrix() throws Exception {
        int[][] output = SpiralMatrix.createSpiralMatrix(3),
                expected = new int[][]{{1,8,7},{2,9,6},{3,4,5}};

        if (!Arrays.deepEquals(output, expected) && output != expected){
            Assert.fail("Different");
        }

    }
}