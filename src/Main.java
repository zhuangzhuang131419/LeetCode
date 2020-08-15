<<<<<<< HEAD
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        new Thread(new PrintThread("A",0)).start();
        new Thread(new PrintThread("B",1)).start();
        new Thread(new PrintThread("C",2)).start();
    }

    public static class PrintThread implements Runnable{
        private String letter;
        private int go;

        private static int turn = 0;

        public PrintThread(String letter,int go) {
            this.letter = letter;
            this.go = go;
        }


        @Override
        public void run() {
            while (true){
                lock.lock();
                try {
                    try {
                        while (turn % 3 != go) {
                            condition.await();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(go + ":" + letter);
                    turn++;
                    turn = turn % 3;
                    condition.signalAll();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
=======
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");


        Map m = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }
>>>>>>> 82136ce03a5121050bffe6ce23150abd7b38d640

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };
    }
}
