package ua.kryha;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minBorder;
    private int maxBorder;
    private int randomValue;
    private View view = new View();
    private List<Integer> logger = new ArrayList<Integer>();

    public boolean checkValue(int value) {
        logger.add(value);

        if (value == this.randomValue) {
            return false;
        } else if (value > this.randomValue) {
            this.maxBorder = value;
            view.printMessage(View.TRY_VALUE_LESS);

        } else {
            this.minBorder = value;
            view.printMessage(View.TRY_VALUE_MORE);
        }
        return true;
    }

    private int random(int minBarrier, int maxBarrier) {
        return (int) Math.ceil(Math.random() * (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public boolean getTrueRange(int minBorder, int maxBorder) {
        return (maxBorder - minBorder) >= 2;
    }

    public int getMinBorder() {
        return minBorder;
    }

    public void setMinBorder(int minBorder) {
        this.minBorder = minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setMaxBorder(int maxBorder) {
        this.maxBorder = maxBorder;
    }


    public void setRandomValue() {
        this.randomValue = random(getMinBorder(), getMaxBorder());
    }

    public int getRandomValue() {
        return this.randomValue;
    }

    public List<Integer> getLogger() {
        return logger;
    }
}