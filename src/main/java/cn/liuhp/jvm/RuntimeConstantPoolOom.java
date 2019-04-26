package cn.liuhp.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 方法区及运行时常量池溢出
 * Error occurred during initialization of VM
 * MaxMetaspaceSize is too small. 这个不然配置那么小啊
 * @author: hz16092620
 * @create: 2019-04-24 16:57
 */
public class RuntimeConstantPoolOom {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {//
            list.add(String.valueOf(i++).intern());
        }
    }
}
