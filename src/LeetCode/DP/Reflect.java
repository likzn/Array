package LeetCode.DP;

import java.lang.reflect.Method;

/**
 * @auther: Li jx
 * @date: 2019/5/19 17:57
 * @description:
 */
public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Person.class;
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

    }
}
