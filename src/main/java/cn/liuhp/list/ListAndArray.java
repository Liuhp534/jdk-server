package cn.liuhp.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: list和数组
 * @author: hz16092620
 * @create: 2019-04-29 14:51
 */
public class ListAndArray {


    public static void main(String[] args) {
        //m1();
        //m2();
        m3();
    }

    /*测试toString方法的实现 AbstractCollcetion里面*/
    private static void m3() {
        List<Object> list = new ArrayList<>();
        list.add("11111");
        list.add(list);//还可以这样操作？
        System.out.println(list);
    }
    /*
    * debug add /remove method
    * */
    public static void m2() {
        List<String> list = new ArrayList<>();
        list.add("11111");
        list.add("22222");
        list.add("11111");
        System.out.println(list.toString());
        //list.remove(-1);//报错
        list.remove("11111");//按照顺序只会删除一个
        System.out.println(list);
    }

    /*
    * list 和 array
    * */
    public static void m1() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("SQL");
        al.add("Data");

        System.out.println("ArrayList:" + al);
        String[] s1 = new String[al.size()];

        String[] s2 = al.toArray(s1);

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));//将数组打印，需要借助Arrays
        System.out.println("s2:" + Arrays.toString(s2));
        System.out.println("s2:" + s2.toString());
        System.out.println("al:" + al.toString());

        s1 = new String[1];
        s1[0] = "hello"; // Store hello in first element

        s2 = al.toArray(s1);//如果小于list的大小，那么会重新创建一个array

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1:" + Arrays.toString(s1));
        System.out.println("s2:" + Arrays.toString(s2));
    }
}
