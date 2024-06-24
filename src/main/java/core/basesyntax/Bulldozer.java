package core.basesyntax;

public class Bulldozer extends Machine {
    public String getStartMessage() {
        return "Bulldozer start working";
    }

    public String getStopMessage() {
        return "Bulldozer stop working";
    }

    @Override
    public void doWork() {
        System.out.println(this.getClass().getName() + ": " + getStartMessage());

    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getName() + ": " + getStopMessage());

    }
}
