public class HelpDeskStation {

    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public int issueQueueNumber(String visitor) {
        QueueManager queue = QueueManager.getInstance();
        return queue.getQueueNumber(visitor);
    }

    public void resetQueue(int newNumber) {
        QueueManager queue = QueueManager.getInstance();
        queue.resetQueue(stationName, newNumber);
    }

    public String getStationName() {
        return stationName;
    }
}