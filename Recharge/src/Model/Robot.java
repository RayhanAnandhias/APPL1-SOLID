package Model;

import Interfaces.IRechargeable;

public class Robot extends Worker implements IRechargeable {
    private int capacity;
    private int currentPower;

    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public void Work(int hours) {
        if(hours > getCurrentPower()) {
            hours = currentPower;
        }
        super.Work(hours);
        this.currentPower -= hours;
    }

    @Override
    public void Recharge() {
        setCurrentPower(getCapacity());
    }
}
