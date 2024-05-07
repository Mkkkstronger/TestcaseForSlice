public class Utils {
    public void printMessage(String message) {
        // 此处将会引发空指针异常，因为message是null
        if (message.equals("Hello")) {
            System.out.println("Message is Hello");
        } else {
            System.out.println("Message is not Hello");
        }
    }
}
