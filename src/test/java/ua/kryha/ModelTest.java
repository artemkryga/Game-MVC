package ua.kryha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void testSetRange(){
        Model model = new Model();
        assertTrue(model.setRange(1, 3));
        assertFalse(model.setRange(1 , 2));
        assertFalse(model.setRange(1 , 1));

    }


}