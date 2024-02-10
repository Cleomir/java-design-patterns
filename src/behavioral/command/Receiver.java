package behavioral.command;

public class Receiver {

  public void action() {
    System.out.println("Receiver: executing action...");
  }

  public void undo() {
    System.out.println("Receiver: undoing action...");
  }
}
