package ua.kryha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.jws.WebParam;

import static org.junit.Assert.*;

public class ModelTest {


    @Test
    public void testSetRange(){
        Model model = new Model();
        assertTrue(model.setRange(1, 3));
        assertFalse(model.setRange(1 , 2));
        assertFalse(model.setRange(1 , 1));
    }

    @Test
    public void testSetKeyValue() {
        Model model = new Model();
        model.setMinBorder(0);
        model.setMaxBorder(100);
        int i = 0;

        while (i < 10000) {
            int rand = model.getRandomValue();
            assertFalse(rand > model.getMinBorder() && rand < model.getMaxBorder());
            i++;
        }
    }


}