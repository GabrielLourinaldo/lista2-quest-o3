// O Adapter: Implementa a interface Target (IMPay) e usa o Adaptee (PPay)
public class PPayAdapter implements IMPay {
    
    // Referência para o objeto Adaptee
    private PPay pPay; 
    
    public PPayAdapter(PPay pPay) {
        this.pPay = pPay;
    }
    
    // Implementa o método Target e TRADUZ a chamada para o método Adaptee
    @Override
    public String getCardOwnerName() {
        // Tradução: getCardOwnerName() -> getHolderName()
        return pPay.getHolderName(); 
    }

    @Override
    public String getCustCardNo() {
        // Tradução: getCustCardNo() -> String.valueOf(getCardNumber())
        return String.valueOf(pPay.getCardNumber());
    }

    @Override
    public String getCardExpMonthDate() {
        // Tradução: getCardExpMonthDate() -> getExpiryDate()
        return pPay.getExpiryDate();
    }

    @Override
    public String getCVVNo() {
        // Tradução: getCVVNo() -> String.valueOf(getCVVNumber())
        return String.valueOf(pPay.getCVVNumber());
    }

    @Override
    public Double getTotalAmount() {
        // Tradução: getTotalAmount() -> getPaymentAmount()
        return pPay.getPaymentAmount();
    }
}