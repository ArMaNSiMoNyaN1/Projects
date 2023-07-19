package arman.bank;

public class Branches {
    String bankAddress;
    String bankAddress2;

    void BranchesInfo() {
        System.out.println("Sender's address - " + bankAddress + " Address of the recipient - " + bankAddress2);
    }

    public Branches(String bankAddress, String bankAddress2) {
        this.bankAddress = bankAddress;
        this.bankAddress2 = bankAddress2;

    }
}
