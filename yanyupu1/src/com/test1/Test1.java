package com.test1;

import java.util.Scanner;

public class Test1 {

    /*
    有一个已经排好序的数组[1, 8, 26, 45, 60, 78, 99]，
    现在键盘录入一个0-100之间（范围无需代码判断）的数字，
    将该数字按从小到大顺序插入到该数组（如输入数字50,
    那么这个数组的结果为：[1, 8, 26, 45, 50, 60, 78, 99]）。并在控制台中打印插入前和插入后的数组。
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 26, 45, 60, 78, 99};
        //新数组 newArr
        int[] newArr = new int[arr.length + 1];
        System.out.println("现在键盘录入一个0-100之间（范围无需代码判断）的数字:");
        Scanner sc = new Scanner(System.in);
        //接收录入数字
        int num = sc.nextInt();
        int index = 0;
        //求出大于arr元素的索引
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]) {
                index++;
            }
        }
        //将<index索引的元素直接赋值给newArr ,>index索引的+1赋值
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = num;

        //重新遍历数组newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
