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

