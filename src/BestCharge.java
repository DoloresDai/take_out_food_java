import java.util.Scanner;

public class BestCharge {
    public static void main(String[] args) {
        String[] idArr =getDishesId();
        int[] numArr=getDishesNum();
    }

    static String[] getDishesId(){
        Tool.print("请输入菜品id，以逗号分隔，例如ITEM0001,ITEM0013,ITEM0022");
        return Tool.getControlStatic().nextLine().split(",");

    }
    static int[] getDishesNum(){
        Tool.print("请输入菜品数量，以逗号分隔，例如1,2,3");
        String[] numStringArr = Tool.getControlStatic().nextLine().split(",");
        return Tool.convertToIntArr(numStringArr);
    }
}
