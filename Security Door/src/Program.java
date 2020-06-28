import Model.KeyCardCheck;
import Model.PinCodeCheck;
import Model.SecurityManager;

public class Program {
    public static void main(String[] args) {
        ScannerUI scannerUI = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUI);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUI);
        SecurityManager manager = new SecurityManager(keyCardCheck,pinCodeCheck);
        manager.Check();
    }
}
