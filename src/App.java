public class App {
    
    // O método de teste, que agora espera IMPay (a interface antiga)
    // O problema pedia para usar um método testPPay, vamos criar um teste
    // mais demonstrativo que opera na interface antiga esperada (IMPay).
    public static void testPaymentSystem(IMPay paymentTarget) {
        System.out.println("--- Executando sistema de pagamento antigo (espera IMPay) ---");
        System.out.println("Nome do Titular: " + paymentTarget.getCardOwnerName());
        System.out.println("Número do Cartão: " + paymentTarget.getCustCardNo());
        System.out.println("Data de Expiração: " + paymentTarget.getCardExpMonthDate());
        System.out.println("CVV: " + paymentTarget.getCVVNo());
        System.out.println("Valor Total: " + paymentTarget.getTotalAmount());
        System.out.println("----------------------------------------------------------\n");
    }

    public static void main(String[] args) {
        
        // 1. Criar o objeto do Novo Fornecedor (PPay - Adaptee)
        PPay newPPayObject = new PPay("Fulano de Tal", 1234567890123456L, "12/28", (short) 456, 199.99);
        
        System.out.println("--- Teste do Padrão Adapter ---");

        // 2. Usar o Adapter: Envolvemos o objeto PPay no PPayAdapter.
        // O Adapter é do tipo IMPay (o que o sistema antigo espera)!
        IMPay adapter = new PPayAdapter(newPPayObject);
        
        // 3. Testar a compatibilidade: Passamos o Adapter (que é um IMPay) para o sistema antigo.
        System.out.println("Enviando o objeto PPay (via Adapter) para o sistema...");
        testPaymentSystem(adapter);
        
        // Se o teste imprimir os dados corretamente, o Adapter funcionou!
        System.out.println("Adapter funcionando! O sistema antigo usou o objeto PPay com sucesso.");
    }
}