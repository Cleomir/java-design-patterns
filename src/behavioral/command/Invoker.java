package behavioral.command;

import behavioral.command.interfaces.Command;

public class Invoker {

  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }

  public void undoCommand() {
    command.undo();
  }
}
