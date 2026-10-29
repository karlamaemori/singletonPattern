public class QueueManager {
    
    private static QueueManager instance;

    private int currentNumber;

    private QueueManager() {
        currentNumber = 0;
    }

    public static synchronized QueueManager getInstance() {
        if (instance == null)
            instance = new QueueManager();
        return instance;
    }

    public synchronized int getQueueNumber(String visitor) {
        currentNumber++;
        System.out.println(visitor + " obtained queue number " + currentNumber);
        return currentNumber;
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void resetQueue(String station, int newNumber) {
        if (newNumber < 0) {
            System.out.println(station + ": Invalid number.");
            return;
        }
        currentNumber = newNumber;
        System.out.println(station + " reset the queue number to " + currentNumber);
    }
}