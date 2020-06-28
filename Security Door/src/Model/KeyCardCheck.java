package Model;

import Interfaces.IRequestKeyCard;
import Interfaces.ISecurityUI;
import Model.SecurityCheck;

public class KeyCardCheck extends SecurityCheck {
    private IRequestKeyCard securityUI;

    public KeyCardCheck(IRequestKeyCard securityUI) {
        this.securityUI = securityUI;
    }

    public IRequestKeyCard getSecurityUI() {
        return securityUI;
    }

    public void setSecurityUI(IRequestKeyCard securityUI) {
        this.securityUI = securityUI;
    }

    private boolean IsValid(String code) {
        return true;
    }

    @Override
    public boolean ValidateUser() {
        String code = getSecurityUI().RequestKeyCard();
        if(IsValid(code)) {
            return true;
        }
        return false;
    }
}
