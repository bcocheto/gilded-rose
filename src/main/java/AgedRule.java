public class AgedRule implements ValidityRule {

    public void passDay(Item item) {
        if (item.canIncreaseQuality()){
            item.quality += 1;
        }
    }
}