public class Main {

    public static void main(String[] args) {

        HelpDeskStation desk1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Help Desk 3");

        OnlineMonitor monitor = new OnlineMonitor();

        QueueManager q1 = QueueManager.getInstance();
        QueueManager q2 = QueueManager.getInstance();
        System.out.println("Same Queue Manager instance? " + (q1 == q2));
        System.out.println();

        desk1.issueQueueNumber("Kei");
        desk2.issueQueueNumber("Karen");
        desk3.issueQueueNumber("Tim");
        monitor.displayCurrentNumber();
        System.out.println();

        desk2.resetQueue(50);
        monitor.displayCurrentNumber();
        System.out.println();

        desk1.issueQueueNumber("Kyra");
        desk3.issueQueueNumber("Andrei");
        monitor.displayCurrentNumber();
        System.out.println();

        desk3.resetQueue(-5);
        monitor.displayCurrentNumber();

    }
}