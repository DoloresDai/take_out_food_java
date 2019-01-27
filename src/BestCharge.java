import java.util.Scanner;

public class BestCharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("请输入菜品id，以逗号分隔，例如ITEM0001,ITEM0013,ITEM0022");
        String[] idArr = scanner.nextLine().split(",");
        print("请输入菜品数量，以逗号分隔，例如1,2,3");
        String[] numStringArr = scanner.nextLine().split(",");
    }

    static void print(String arr) {
        System.out.println(arr);
    }
}
