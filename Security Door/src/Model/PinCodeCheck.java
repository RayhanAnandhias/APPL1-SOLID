package Model;

import Interfaces.IRequestPinCode;
import Interfaces.ISecurityUI;
import Model.SecurityCheck;

public class PinCodeCheck extends SecurityCheck {
    private IRequestPinCode securityUI;

    public PinCodeCheck(IRequestPinCode securityUI) {
        this.securityUI = securityUI;
    }

    public IRequestPinCode getSecurityUI() {
        return securityUI;
    }

    public void setSecurityUI(IRequestPinCode securityUI) {
        this.securityUI = securityUI;
    }

    private boolean IsValid(int pin) {
        return true;
    }

    @Override
    public boolean ValidateUser() {
        int pin = getSecurityUI().RequestPinCode();
        if(IsValid(pin)) {
            return true;
        }
        return false;
    }
}
