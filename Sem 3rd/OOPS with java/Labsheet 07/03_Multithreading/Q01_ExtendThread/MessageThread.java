public class MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Message " + i);
    }
    public static void main(String[] args) { new MessageThread().start(); }
}
