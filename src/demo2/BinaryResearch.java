package demo2;

import java.util.Scanner;

/**
 * @author xiaowu
 * @create 2019-02-15  12:25
 */
public class BinaryResearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("请输入要查找的元素：");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        //记录数据开始的位置
        int start = 0;
        //记录结束的位置
        int end = arr.length-1;
        //记录中间位置
        int mid = (start+end)/2;
        //记录查找元素的目标位置
        int index = -1;
        //循环查找
        while(true){
            //先判断是否在中间位置
            if (arr[mid] == target){
                index = mid;
                break;
            }else {
                //判断中间位置的这个元素是否比目标元素大
                if (arr[mid] > target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
                mid = (start + end)/2;
            }
        }
        System.out.println("你所查找的元素在第"+(index+1)+"个位置");
    }
}
