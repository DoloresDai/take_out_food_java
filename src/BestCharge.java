public class BestCharge {
    public static void main(String[] args) {
        String[] idArr = getDishesId();
        int[] numArr = getDishesNum();
        Tool.print("============= 订餐明细 =============");
        Orders orders = new Orders(idArr, numArr);
        int sumOriginalPrice = orders.sumOriginalPrice;
        int sumHalfPrice = orders.sumHalfPrice;
        int sumLessPrice = orders.sumLessPrice;
        StringBuffer halfOrders = orders.halfOrders;
        Tool.print("-----------------------------------");
        printSaleDetails(sumHalfPrice, sumLessPrice, sumOriginalPrice, halfOrders);
        Tool.print("===================================");
    }

    static String[] getDishesId() {
        Tool.print("请输入菜品id，以逗号分隔，例如ITEM0001,ITEM0013,ITEM0022");
        return Tool.getControlStatic().split(",");
    }

    static int[] getDishesNum() {
        Tool.print("请输入菜品数量，以逗号分隔，例如1,2,3");
        String[] numStringArr = Tool.getControlStatic().split(",");
        try {
            Tool.convertToIntArr(numStringArr);
        } catch (NumberFormatException e) {
            System.out.println("输入格式错误，请重新输入");
        }
        return Tool.convertToIntArr(numStringArr);
    }

    static void printSaleDetails(int sumHalfPrice, int sumLessPrice, int sumOriginalPrice, StringBuffer halfDishes) {
        if (sumHalfPrice == sumLessPrice && sumHalfPrice == sumOriginalPrice) {
            Tool.print("总计：" + sumOriginalPrice + "元");
        } else if (sumHalfPrice < sumLessPrice) {
            Tool.print("使用优惠：\n指定菜品半价(" + halfDishes + ")，省" + String.valueOf(sumOriginalPrice - sumHalfPrice) + "元");
            Tool.print("-----------------------------------");
            Tool.print("总计：" + sumHalfPrice + "元");
        } else {
            Tool.print("使用优惠:\n满30减6元，省" + String.valueOf(sumOriginalPrice - sumLessPrice) + "元");
            Tool.print("-----------------------------------");
            Tool.print("总计：" + sumLessPrice + "元");
        }
    }
}
