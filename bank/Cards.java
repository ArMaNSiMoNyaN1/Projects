package arman.bank;

public class Cards {
    String bank;
    int cardNumber;
    String name;
    String surname;
    int amountSend;
    String paymentSystem;
    int cardCvv;

    void CardsInfo() {
        System.out.println("Bank - " + bank + " Sender card number - " + cardNumber + " Sender name - " + name + " Sender surname - " + surname + " \n" + "Amount to send - " + amountSend + " Sender card payment system - " + paymentSystem
                + " CVV of card - " + cardCvv);
    }

    public Cards(String bank, int cardNumber, String name, String surname, int amountSend, String paymentSystem, int cardCvv) {
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.name = name;
        this.surname = surname;
        this.amountSend = amountSend;
        this.paymentSystem = paymentSystem;
        this.cardCvv = cardCvv;
    }
}
