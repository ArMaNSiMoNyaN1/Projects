package arman.getset;

public class Bank {

    private String name;
    private int license;
    private boolean centralBank;
    private Branche branche;
    private Card card;
    private Transfer transfer;

    public Bank(String name, int license, boolean centralBank, Branche branche, Card card, Transfer transfer) {
        this.name = name;
        this.license = license;
        this.centralBank = centralBank;
        this.branche = branche;
        this.card = card;
        this.transfer = transfer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public void setCentralBnak(boolean centralBnak) {
        this.centralBank = centralBnak;
    }

    public void setBranche(Branche branche) {
        this.branche = branche;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public int getLicense() {
        return license;
    }

    public boolean isCentralBank() {
        return centralBank;
    }

    public Branche branche() {
        return branche;
    }

    public Card card() {
        return card;
    }

    public Transfer transfer() {
        return transfer;
    }

}

