package Practice;

public class SkipListNode<T> {
    public int key;
    public T value;
    public SkipListNode<T> up, down, left, right;

    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int TAIL_KEY = Integer.MAX_VALUE;

    public SkipListNode(int k, T v) {
        this.key = k;
        this.value = v;
    }

    public void append(SkipListNode<T> node) {
        node.left = this;
        node.right = this.right;
        this.right.left = node;
        this.right = node;
    }

    @Override
    public String toString() {
        return "key-value:"+key+"-"+value;
    }

}
