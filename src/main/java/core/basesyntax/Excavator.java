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
        System.out.println(getStartMessage());
        System.out.println("Excavator start working");
    }

    @Override
    public void stopWork() {
        System.out.println(getStopMessage());
        System.out.println("Excavator stop working");
    }
}

