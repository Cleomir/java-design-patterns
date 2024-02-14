package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.interfaces.Handler;

public abstract class AbstractHandler implements Handler {

  private Handler nextHandler;

  public Handler setNextHandler(Handler handler) {
    this.nextHandler = handler;
    return handler;
  }

  public void handleRequest(String request) {
    if (this.nextHandler != null) {
      this.nextHandler.handleRequest(request);
    }
  }
}
