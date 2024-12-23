package TASK3;

import java.util.concurrent.CopyOnWriteArrayList;

public class ListModifier extends Thread {
    private CopyOnWriteArrayList<Integer> list;

    public ListModifier(CopyOnWriteArrayList<Integer> list) {
        this.list = list;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
            System.out.println(Thread.currentThread().getName() + " added: " + i);
        }
    }
}
