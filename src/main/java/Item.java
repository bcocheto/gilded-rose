public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ValidityRule validityRule;

    private int MAX_QUALITY = 50;

    private int MIN_QUALITY = 0;

    public Item(String name, int sellIn, int quality, ValidityRule validityRule) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.validityRule = validityRule;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public boolean canIncreaseQuality() {
        if (quality == MAX_QUALITY) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canDecreaseQuality() {
        if (quality == MIN_QUALITY) {
            return false;
        } else {
            return true;
        }
    }

    public boolean canDecreaseQuality(int times) {
        if (quality - times >= MIN_QUALITY) {
            return true;
        } else {
            return false;
        }
    }
}