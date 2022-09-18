package exercises.technology;

public class Computer extends AbstractEntity {

    private int storage;
    private int CPUClockSpeed;
    private boolean hasPhysicalKeyboard;

    public Computer(int storage, int CPU, boolean hasPhysicalKeyboard){
        super();
        this.storage = storage;
        this.CPUClockSpeed = CPU;
        this.hasPhysicalKeyboard = hasPhysicalKeyboard;
    }

    public void increaseStorage(int amountIncreasing){
        this.storage = this.storage + amountIncreasing;
    }

    public int getStorage() {
        return storage;
    }

    public int getCPUClockSpeed() {
        return CPUClockSpeed;
    }

    public boolean isHasPhysicalKeyboard() {
        return hasPhysicalKeyboard;
    }
}
