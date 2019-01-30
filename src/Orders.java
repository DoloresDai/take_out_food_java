/***
 * This is a order class, used to collect information about all dishes,
 * and can automatically generate the original price, preferential price.
 */
public class Orders {
    int sumOriginalPrice;
    int sumHalfPrice;
    int sumLessPrice;
    StringBuffer halfOrders = new StringBuffer();

    Orders(String[] idArr, int[] numArr) {
        for (int j = 0; j < idArr.length; j++) {
            Dishes dish = new Dishes(idArr[j], numArr[j]);
            dish.getItems();
            dish.isHalf();
            dish.countOriginalPrice();
            dish.countHalfPrice();
            if(dish.name==null)throw new InputWrongException("输入id有误，请重新输入");
            Tool.print(dish.name + " x " + dish.num + " = " + String.valueOf(dish.price * dish.num) + "元");
            this.sumOriginalPrice += dish.originalPrice;
            this.sumHalfPrice += dish.halfPrice;
            if (dish.sale) {
                try {
                    halfOrders = halfOrders.append(dish.name + ",");
                } catch (NullPointerException e) {
                    Tool.print("空指针" + e);
                }
            }
        }
        try {
            if (halfOrders.length() >= 1) {
                halfOrders.setLength(halfOrders.length() - 1);
            }
        } catch (NullPointerException e) {
            Tool.print("空指针" + e);
        } catch (StringIndexOutOfBoundsException s) {
            Tool.print("越出索引边界" + s);
        }
        sumLessPrice = countLessPrice(sumOriginalPrice);
    }

    static int countLessPrice(int originalPrice) {
        return originalPrice >= 30 ? originalPrice - 6 : originalPrice;
    }
}

