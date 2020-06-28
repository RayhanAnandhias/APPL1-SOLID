package Model;

import Model.KeyCardCheck;
import Model.PinCodeCheck;

import java.util.Scanner;

public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }

    public KeyCardCheck getKeyCardCheck() {
        return keyCardCheck;
    }

    public PinCodeCheck getPinCodeCheck() {
        return pinCodeCheck;
    }

    public void setKeyCardCheck(KeyCardCheck keyCardCheck) {
        this.keyCardCheck = keyCardCheck;
    }

    public void setPinCodeCheck(PinCodeCheck pinCodeCheck) {
        this.pinCodeCheck = pinCodeCheck;
    }

    public void Check() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");
        int option = Integer.parseInt(scan.nextLine());

        switch (option) {
            case 1 :
                System.out.println(getKeyCardCheck().ValidateUser());
                break;
            case 2 :
                System.out.println(getPinCodeCheck().ValidateUser());
                break;
        }
    }
}
