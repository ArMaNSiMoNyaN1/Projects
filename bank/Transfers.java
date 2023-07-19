package arman.bank;

public class Transfers {
    int accountNumber;
    String receiverName;
    String receiverSurname;
    int transferSum;
    int senderNumber;
    String senderName;
    String senderSurname;

    void TransfersInfo() {
        System.out.println("Account number - " + accountNumber + " Receiver name - " + receiverName + " Receiver surname - " + receiverSurname + " Transaction amount - " + transferSum + "\n" +
                "Sender card number - " + senderNumber + " Sender name - " + senderName + " Sender surname - " + senderSurname);
    }

    public Transfers(int accountNumber, String receiverName, String receiverSurname, int transferSum, int senderNumber, String senderName, String senderSurname) {
        this.accountNumber = accountNumber;
        this.receiverName = receiverName;
        this.receiverSurname = receiverSurname;
        this.transferSum = transferSum;
        this.senderNumber = senderNumber;
        this.senderName = senderName;
        this.senderSurname = senderSurname;

    }
}