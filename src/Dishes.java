import java.util.stream.IntStream;

/**
 * Get all the information about individual dishes,
 * including name, id, price, quantity, half price or not,
 * and calculate the original price and half price.
 */
public class Dishes {
    String name;
    String id;
    int price;
    int num;
    boolean sale;
    int originalPrice;
    int halfPrice;
    private String[][] dishes = {{"黄焖鸡", "ITEM0001", "18"}, {"肉夹馍", "ITEM0013", "6"}, {"凉皮", "ITEM0022", "8"}, {"冰锋", "ITEM0030", "2"}};
    private String[] halfDishes = {"ITEM0001", "ITEM0022"};

    Dishes(String id, int num) {
        this.id = id;
        this.num = num;
    }

    public void getItems() {
        String[] dishesArr = new String[3];
        IntStream.range(0, dishes.length).filter(i -> this.id.equals(dishes[i][1])).forEach(i -> {
            this.name = dishes[i][0];

            this.price = Integer.parseInt(dishes[i][2]);
        });
    }

    public void isHalf() {
        IntStream.range(0, halfDishes.length).filter(i -> !this.sale).forEach(i -> {
            this.sale = this.id.equals(halfDishes[i]);
        });
    }

    public void countOriginalPrice() {
        this.originalPrice = this.price * this.num;
    }

    public void countHalfPrice() {
        this.halfPrice = this.sale ? this.originalPrice / 2 : this.originalPrice;
    }
}
