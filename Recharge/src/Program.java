import Interfaces.*;
import Model.*;

public class Program {
    public static void main(String[] args) {
        Employee a = new Employee("123456");
        Robot b = new Robot("654321", 4000);
        a.Work(8);
        a.Sleep();

        b.Work(24);
        RechargeStation station = new RechargeStation();
        station.Recharge(b);
    }
}
