/***
 * This is a menu class, used to collect information about all dishes,
 * and can automatically generate the original price, preferential price.
 */
public class Menu {
    int sumOriginalPrice;
    int sumHalfPrice;
    int sumLessPrice;
    StringBuffer halfItems = new StringBuffer();

    Menu(String[] idArr, int[] numArr) {
        for (int j = 0; j < idArr.length; j++) {
            Items item = new Items(idArr[j], numArr[j]);
            item.getItems();
            item.isHalf();
            item.countOriginalPrice();
            item.countHalfPrice();
            Tool.print(item.name + " x " + item.num + " = " + String.valueOf(item.price * item.num) + "元");
            this.sumOriginalPrice += item.originalPrice;
            this.sumHalfPrice += item.halfPrice;
            if (item.sale) {
                try {
                    halfItems = halfItems.append(item.name + ",");
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

