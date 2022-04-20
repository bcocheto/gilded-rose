public class ConjuredRule implements ValidityRule {

    public void passDay(Item item) {
        if (item.canDecreaseQuality()){
            item.quality -= 2;
        }
        item.sellIn -= 1;
    }
}