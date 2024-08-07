package game;

public abstract class CommandOperation {
    public Room room;
    public CommandOperation(Room room) {
        this.room = room;
    }
    public abstract void doForHitCommand(Command cmd);
    public abstract void doForStandCommand(Command cmd);
}