public class HitCommand extends Command {
    @Override
    public void doSomething(CommandOperation op) {
        op.doForHitCommand(this);
    }

    @Override
    public byte[] toByteArray() {

    }
}