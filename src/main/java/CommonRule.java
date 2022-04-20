public class CommonRule implements ValidityRule {

    public void passDay(Item item) {
        if (item.canDecreaseQuality()){
            item.quality -= 1;
        }
        item.sellIn -= 1;
    }
}