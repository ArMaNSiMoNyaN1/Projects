package arman.bank;

public class Arm {

    public static void main(String[] args) {
        Cards thisCards = new Cards("Arm", 522552225, "Hovsep", "Hoveyan", 2000000, "MasterCard", 555);
        thisCards.CardsInfo();

        Transfers thisTransfer = new Transfers(12345678, "David", "Melqonyan", 2000000, 522552225, "Hovsep", "Hoveyan");
        thisTransfer.TransfersInfo();

        Branches thisBranch = new Branches("North avenue 11", "Artyom Mikoyan 29");
        thisBranch.BranchesInfo();
    }
}