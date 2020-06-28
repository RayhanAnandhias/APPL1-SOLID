import Interfaces.ISecurityUI;

import java.util.Scanner;

public class ScannerUI implements ISecurityUI {
    @Override
    public String RequestKeyCard() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Slide your key card");
        return scan.nextLine();
    }

    @Override
    public int RequestPinCode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your pin code:");
        return Integer.parseInt(scan.nextLine());
    }
}
