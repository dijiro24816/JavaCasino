package game.blackjack;

public class StandCommand extends Command {
    public void doSomething(CommandOperation op) {
        op.doForStandCommand();
    }
}