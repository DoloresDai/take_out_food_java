import java.util.stream.IntStream;

/**
 * Get all the information about individual dishes,
 * including name, id, price, quantity, half price or not,
 * and calculate the original price and half price.
 */
public class Items {
    String name;
    String id;
    int price;
    int num;
    boolean sale;
    int originalPrice;
    int halfPrice;
    private String[][] items = {{"黄焖鸡", "ITEM0001", "18"}, {"肉夹馍", "ITEM0013", "6"}, {"凉皮", "ITEM0022", "8"}, {"冰锋", "ITEM0030", "2"}};
    private String[] halfItems = {"ITEM0001", "ITEM0022"};

    Items(String id, int num) {
        this.id = id;
        this.num = num;
    }

    public void getItems() {
        String[] itemsArr = new String[3];
        IntStream.range(0, items.length).filter(i -> this.id.equals(items[i][1])).forEach(i -> {
            this.name = items[i][0];
            this.price = Integer.parseInt(items[i][2]);
        });
    }

    public void isHalf() {
        IntStream.range(0, halfItems.length).filter(i -> !this.sale).forEach(i -> {
            this.sale = this.id.equals(halfItems[i]);
        });
    }

    public void countOriginalPrice() {
        this.originalPrice = this.price * this.num;
    }

    public void countHalfPrice() {
        this.halfPrice = this.sale ? this.originalPrice / 2 : this.originalPrice;
    }
}
