package game.blackjack;

import game.CommandOperation;
import game.Room;
import game.Command;

public class CommandReceivingClientOperation extends CommandOperation {
    public ReceivingClient(Room room) {
        super(room);
    }

    @Override
    public void doForHitCommand(Command cmd) {
        
    }

    @Override
    public void doForStandCommand(Command cmd) {

    }

}