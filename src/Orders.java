/***
 * This is a menu class, used to collect information about all dishes,
 * and can automatically generate the original price, preferential price.
 */
public class Orders {
    int sumOriginalPrice;
    int sumHalfPrice;
    int sumLessPrice;
    StringBuffer halfItems = new StringBuffer();

    Orders(String[] idArr, int[] numArr) {
        for (int j = 0; j < idArr.length; j++) {
            Dishes dishes = new Dishes(idArr[j], numArr[j]);
            dishes.getItems();
            dishes.isHalf();
            dishes.countOriginalPrice();
            dishes.countHalfPrice();
            Tool.print(dishes.name + " x " + dishes.num + " = " + String.valueOf(dishes.price * dishes.num) + "元");
            this.sumOriginalPrice += dishes.originalPrice;
            this.sumHalfPrice += dishes.halfPrice;
            if (dishes.sale) {
                try {
                    halfItems = halfItems.append(dishes.name + ",");
                } catch (NullPointerException e) {
                    Tool.print("空指针" + e);
                }
            }
        }
        try {
            if (!halfItems.equals("")) {
                halfItems.setLength(halfItems.length() - 1);
            }
        } catch (NullPointerException e) {
            Tool.print("空指针" + e);
        }
        sumLessPrice = countLessPrice(sumOriginalPrice);
    }

    static int countLessPrice(int originalPrice) {
        return originalPrice >= 30 ? originalPrice - 6 : originalPrice;
    }
}

