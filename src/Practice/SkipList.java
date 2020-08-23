package Practice;

import java.util.Random;

public class  SkipList <T> {
    private SkipListNode<T> head, tail;
    private int nodes; // 节点个数
    private int listLevel; // 层数
    private Random random;
    private static final double PROBABILITY = 0.5;
    public SkipList() {
        random = new Random();
        clear();
    }

    public void clear() {
        head = new SkipListNode<>(SkipListNode.HEAD_KEY, null);
        tail = new SkipListNode<>(SkipListNode.TAIL_KEY, null);
        head.right = tail;
        tail.left = head;
        listLevel = 0;
        nodes = 0;
    }


    // 找到要插入位置前面的key
    private SkipListNode<T> findNode(int key) {
        SkipListNode<T> p = head;
        while (true) {
            while (p.right.key != SkipListNode.TAIL_KEY && p.right.key <= key) {
                p = p.right;
            }
            if (p.down != null) {
                p = p.down;
            } else {
                break;
            }
        }
        return p;
    }

    public void put(int k, T v) {
        SkipListNode<T> p = findNode(k);
        if (p.key == k) {
            p.value = v;
            return;
        }

        SkipListNode<T> q = new SkipListNode<>(k, v);
        p.append(q);
        int curLevel = 0;
        // 抛硬币

        SkipListNode<T> curLevelHead = this.head;
        SkipListNode<T> curLevelTail = this.tail;
        while (random.nextDouble() < PROBABILITY) {
            // 上升一层

            // 如果超出当前高度，要新建一层
            if (curLevel >= listLevel) {
                listLevel++;
                SkipListNode<T> p1 = new SkipListNode<>(SkipListNode.HEAD_KEY, null);
                SkipListNode<T> p2 = new SkipListNode<>(SkipListNode.TAIL_KEY, null);
                // 水平连接
                p1.right = p2;
                p2.left = p1;

                // 竖直连接
                p1.down = curLevelHead;
                curLevelHead.up = p1;

                p2.down = curLevelTail;
                curLevelTail.up = p2;
            }



            while (p.up == null && p.key != SkipListNode.HEAD_KEY) {
                p = p.left;
            }
            if (p.up == null) {
                System.out.println("Debug");
            }

            p = p.up;


            SkipListNode<T> e = new SkipListNode<>(k, null); // 只保存key
            p.append(e);

            e.down = q;
            q.up = e;
            q = e;
            curLevel++;
            curLevelHead = curLevelHead.up;
            curLevelTail = curLevelTail.up;
        }

        nodes++;


    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (nodes == 0) {
            return "跳跃表为空！";
        }
        StringBuilder builder=new StringBuilder();
        SkipListNode<T> p=head;
        while (p.down!=null) {
            p=p.down;
        }

        while (p.left!=null) {
            p=p.left;
        }
        if (p.right!=null) {
            p=p.right;
        }
        while (p.right!=null) {
            builder.append(p);
            builder.append("\n");
            p=p.right;
        }

        return builder.toString();
    }


}
