package ua.kryha;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.jws.WebParam;

import static org.junit.Assert.*;

public class ModelTest {

    Model model;

    @Before
    public void getModel(){
        model = new Model();
    }

    @Test
    public void testGetTrueRange() {

        assertTrue(model.getTrueRange(-1224 ,100));

    }

    @Test
    public void testSetKeyValue() {


        model.setMinBorder(0);
        model.setMaxBorder(100);
        int i = 0;
        while (i < 100) {
            model.setRandomValue();
            int rand = model.getRandomValue();
            assertTrue(rand > model.getMinBorder() && rand < model.getMaxBorder());
            i++;
        }
    }


}