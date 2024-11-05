package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContainerWithMostWaterTest {

    @Test
    public void verifyMaxContainerArea(){
        int[] height = {1, 2, 3};
        int target = 2;

        int result = ContainerWithMostWater.mostContainerArea(height);

        assertEquals(target, result);

    }

}
