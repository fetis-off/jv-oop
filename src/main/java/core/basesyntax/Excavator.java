package core.basesyntax;

public class Excavator extends Machine {
    public String getStartMessage() {
        return "Excavator start working";
    }

    public String getStopMessage() {
        return "Excavator stop working";
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

