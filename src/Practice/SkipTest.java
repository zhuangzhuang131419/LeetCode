package Practice;

public class SkipTest {
    public static void main(String[] args) {
        SkipList<String> list = new SkipList<>();
        System.out.println(list);
        list.put(2, "zheng");
        System.out.println(list);
        list.put(1, "chi");
        list.put(3, "cheng");
//        list.put(1, "bob");//测试同一个key值
//        list.put(4, "zhuang");
//        list.put(6, "zhuangzhuang");
        System.out.println(list);
    }
}
