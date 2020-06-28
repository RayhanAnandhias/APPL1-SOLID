package Model;

import Interfaces.ISleeper;

public class Employee extends Worker implements ISleeper {

    public Employee(String id) {
        super(id);
    }

    @Override
    public void Sleep() {
        System.out.println("Employee ID<" + super.getId() + "> is sleep...");
    }
}
