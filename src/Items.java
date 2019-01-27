/**
 *Get all the information about individual dishes,
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
}