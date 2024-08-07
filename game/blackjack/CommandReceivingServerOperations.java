package game.blackjack;

public class CommandReceivingServerOperation extends Operation {
    public CommandReceivingServerOperation(Room room) {
        super(room);
    }

    @Override
    public void doForHitCommand(Command cmd) {
        
    }

    @Override
    public void doForStandCommand(Command cmd) {

    }

}