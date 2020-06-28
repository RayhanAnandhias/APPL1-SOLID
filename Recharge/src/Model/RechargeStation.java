package Model;

import Interfaces.IRechargeable;

public class RechargeStation {
    public void Recharge(IRechargeable rechargeable) {
        rechargeable.Recharge();
    }
}
