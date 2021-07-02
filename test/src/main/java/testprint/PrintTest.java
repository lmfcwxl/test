package testprint;

public class PrintTest {
    public static void main(String[] args) {
        int size = 5;
        //上层菱形外层循环
        for (int i = 1; i <= size; i++) {
            //size 5; 第一次执行4次
            for (int j = size; j > i ; j--) {
                System.out.print(" ");
            }
            //i 1,2,3...; k 1,3,5... ; ->k = 2 * i -1
            for (int k = 1; k <= 2 * i - 1 ; k++){
                System.out.print("*");
            }

            //每次内层循环完成后换行
            System.out.println();

        }

        //菱形下层外层循环
        for (int i = 1; i <= size - 1; i++){
            //下层空格正序打印
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            //size 5 ; (size - i) * 2 - 1
            for (int k = 1; k <= (size - i) * 2 - 1 ; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
