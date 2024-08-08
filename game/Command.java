package game;

import game.CommandOperation;
import game.CommandInput;

public abstract class Command {
    public abstract void doSomething(CommandOperation op);
    public abstract byte[] toByteArray();
    public static Command parse(CommandInput cmdIn) {
        String name = cmdIn.getToken();
        if (name) {
            if ((name != null && name.equals("stand")) || ()) {
                return new StandCommand();
            } else if (name.equals("hit")) {
                return new HitCommand();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
