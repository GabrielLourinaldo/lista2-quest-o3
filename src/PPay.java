// O Adaptee: O novo fornecedor (PayPal) que tem uma interface incompatível
public class PPay {
    // Note os nomes de atributos/métodos diferentes do IMPay
    private String holderName;
    private long cardNumber;
    private String expiryDate; // Representação diferente
    private short cvvNumber;
    private double amount;
    
    public PPay(String name, long card, String date, short cvv, double amount) {
        this.holderName = name;
        this.cardNumber = card;
        this.expiryDate = date;
        this.cvvNumber = cvv;
        this.amount = amount;
    }

    // Métodos do PPay (com nomes e tipos incompatíveis com IMPay):
    public String getHolderName() {
        return holderName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public short getCVVNumber() {
        return cvvNumber;
    }

    public double getPaymentAmount() { // Nome do método diferente
        return amount;
    }
}