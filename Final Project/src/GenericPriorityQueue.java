/*Generic Priority Queue */
import java.util.*;

public class GenericPriorityQueue<QueueType> {
    private final int QUEUE_SIZE = 16;
    private QueueType[] data;
    private int head, tail, count, capacity;

    public GenericPriorityQueue() {
        data = (QueueType[]) new Object[QUEUE_SIZE];
        capacity = QUEUE_SIZE;
        count = tail = 0;
        head = QUEUE_SIZE - 1;
    }

    public void clear() {
        count = tail = 0;
        head = capacity - 1;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(QueueType d) {
        if (count == capacity) {
            int tmpCap = 2 * capacity;
            QueueType[] tmpData = (QueueType[]) new Object[tmpCap];

            if (tmpData == null) {
                throw new RuntimeException("Queue_is_full");
            }

            for (int i = 0; i < capacity; i++) {
                tmpData[i] = data[(head+i+1)%capacity];
            }

            head = tmpCap - 1;
            tail = capacity;

            data = tmpData;
            capacity = tmpCap;
        }

        data[tail] = d;
        tail = ++tail % capacity;
        count++;
    }

    public QueueType dequeue() {
        if (count == 0) {
            throw new RuntimeException("Queue is empty");
        }

        head = ++head % capacity;
        count--;

        return data[head];
    }
}


