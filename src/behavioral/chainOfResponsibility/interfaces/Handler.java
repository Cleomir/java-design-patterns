package behavioral.chainOfResponsibility.interfaces;

public interface Handler {
  Handler setNextHandler(Handler handler);
  void handleRequest(String request);
}
