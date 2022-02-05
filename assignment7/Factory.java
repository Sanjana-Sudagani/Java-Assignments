package assignment7;

interface Cycle1 {
    public void ride();
}

class UniCycle implements Cycle1 {
    public void ride() {
        System.out.println("riding a unicycle");
    }
}

class BiCycle implements Cycle1 {
    public void ride() {
        System.out.println("riding a BiCycle");
    }
}

class TriCycle implements Cycle1 {
    public void ride() {
        System.out.println("riding a tricycle");
    }
}

interface CycleFactory {
    Cycle1 getCycle();
}

class UniCycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new UniCycle();
    }
}

class BiCycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new BiCycle();
    }
}

class TriCycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new TriCycle();
    }
}

public class Factory {
    public static void ridingCycle(CycleFactory factory) {
        Cycle1 f = factory.getCycle();
        f.ride();
    }

    public static void main(String[] args) {
        ridingCycle(new UniCycleFactory());
        ridingCycle(new BiCycleFactory());
        ridingCycle(new TriCycleFactory());
    }
}
