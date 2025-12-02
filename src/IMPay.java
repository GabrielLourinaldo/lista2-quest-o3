// A Interface Target: O que o nosso sistema de e-commerce espera
public interface IMPay {
    
    // Métodos esperados pelo sistema antigo (MercadoPapo)
    String getCardOwnerName();
    String getCustCardNo();
    String getCardExpMonthDate();
    String getCVVNo();
    Double getTotalAmount();
}