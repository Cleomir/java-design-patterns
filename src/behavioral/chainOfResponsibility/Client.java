package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.interfaces.Handler;

public class Client {

  Handler handler;

  public Client(Handler handler) {
    this.handler = handler;
  }

  public void makeRequest(String request) {
    handler.handleRequest(request);
  }
}
