public class OnlineMonitor {

    public void displayCurrentNumber() {
        QueueManager queue = QueueManager.getInstance();
        System.out.println("\n[Online Monitor]");
        System.out.println("Current queue number: " + queue.getCurrentNumber());
    }
}