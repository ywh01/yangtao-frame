package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2023/11/26 17:48
 * @Author ywh
 */
public class MyTest {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        //     int a = in.nextInt();
        //     int h = 0;
        //
        // }

        // int h = 0;
        // h = hg(3, h);
        // System.out.println(h);

        // Scanner in = new Scanner(System.in);
        // while (in.hasNextInt()) {
        //     List<Integer> list = new ArrayList<>();
        //     // 注意 hasNext 和 hasNextLine 的区别
        //     int count = in.nextInt();
        //     for(int i = 0; i<count; i++){
        //         if(count == i){
        //             break;
        //         }
        //         int number = in.nextInt();
        //         if(number >= 1 && number <= 500 && !list.contains(number)){
        //             list.add(number);
        //         }
        //     }
        //     list.sort((o1, o2) -> o1 - o2);
        //     for(int i = 0; i<list.size(); i++){
        //         System.out.println(list.get(i));
        //     }
        // }

        int x=Integer.parseInt("0xAA", 16);
        System.out.println(x);
    }

    private static int hg(int sum, int h) {
        while (sum >= 3) {
            int a = sum % 3;
            int b = sum / 3;
            sum = a + b;
            h += b;
        }
        if(sum == 2){
            return h+1;
        }
        return h;
    }

    private static List<Integer> a2(int count, List<Integer> list) {
        list.sort((o1, o2) -> o1 - o2);
        return list;

    }
}
