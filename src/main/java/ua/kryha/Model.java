package ua.kryha;

public class Model {
    private int minBorder;
    private int maxBorder;

    public boolean setRange(int minBorder , int maxBorder){
        if (getTrueRange(minBorder , maxBorder)){
            setMinBorder(minBorder);
            setMaxBorder(maxBorder);
            return true;
        }
        return false;
    }

    public boolean getTrueRange(int minBorder , int maxBorder) {
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
}
