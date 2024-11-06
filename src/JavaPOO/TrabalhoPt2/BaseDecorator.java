package JavaPOO.TrabalhoPt2;

public class BaseDecorator extends Notifier {
    private Notifier wrappee;

    public BaseDecorator(Notifier notifier) {
        wrappee = notifier;
    }
    public void send(String message) {
        wrappee.send(message);
    }
}
