package ua.kryha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.jws.WebParam;

import static org.junit.Assert.*;

public class ModelTest {


    @Test
    public void testSetKeyValue() {
        Model model = new Model();

        model.setMinBorder(0);
        model.setMaxBorder(100);
        int i = 0;
        while (i < 1000000000) {
            model.setRandomValue();
            int rand = model.getRandomValue();
            assertTrue(rand > model.getMinBorder() && rand < model.getMaxBorder());
            i++;
        }
    }


}