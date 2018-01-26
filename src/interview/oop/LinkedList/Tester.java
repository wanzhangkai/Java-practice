package interview.oop.LinkedList;

/**
 * @author wanzhangkai@foxmail.com
 * @date 2018/1/26 22:45
 */
public class Tester {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }

        for (Integer value : list) {  //因为我们的LinkedList中实现了Iterable接口，所以支持foreach操作
            System.out.println(value);
        }

    }
}