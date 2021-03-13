package pay_train_weekind.class03;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] array=new int[10];
        int[] array1={1,2,3,4,5};
        int[] array2=new int[]{1,2,3,4,5};
        System.out.println(array2[array1.length-1]);
        System.out.println(array1.toString());
        array2=Arrays.copyOf(array2,array2.length+1);//效果等同于数组扩容
        array2[5]=6;
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);//排序
    }
}
