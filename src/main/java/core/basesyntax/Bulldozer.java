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
        System.out.println(getStartMessage());
        System.out.println("Bulldozer start working");
    }

    @Override
    public void stopWork() {
        System.out.println(getStopMessage());
        System.out.println("Bulldozer stop working");
    }
}
