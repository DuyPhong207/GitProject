package Model;

public class Contract {
    private String contractsNumber;
    private String bookingId;
    private short moneyDeposit;
    private short moneyPay;
    private String customerId;

    public Contract(String contractsNumber, String bookingId, short moneyDeposit, short moneyPay, String customerId) {
        this.contractsNumber = contractsNumber;
        this.bookingId = bookingId;
        this.moneyDeposit = moneyDeposit;
        this.moneyPay = moneyPay;
        this.customerId = customerId;
    }

    public String getContractsNumber() {
        return contractsNumber;
    }

    public void setContractsNumber(String contractsNumber) {
        this.contractsNumber = contractsNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public short getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(short moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public short getMoneyPay() {
        return moneyPay;
    }

    public void setMoneyPay(short moneyPay) {
        this.moneyPay = moneyPay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractsNumber='" + contractsNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", moneyDeposit=" + moneyDeposit +
                ", moneyPay=" + moneyPay +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
