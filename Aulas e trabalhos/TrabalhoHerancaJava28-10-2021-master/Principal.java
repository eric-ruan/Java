public class Principal {
    public static void main(String[] args) {
        Novo novo = new Novo();
        Velho velho = new Velho();

        novo.setEndereco("Rua do limão");
        novo.setPreco(250000);
        novo.setAdicionalPreco(0.2*novo.getPreco());
        System.out.println(novo.getPreco()+novo.getAdicionalPreco());


        System.out.println("Imovel usado: ");

        velho.setEndereco("Rua limão azedo");
        velho.setPreco(230000);

        velho.setDescontoPreco(0.1*velho.getPreco());
        System.out.println("Preço imvel velho:"+(velho.getPreco()-velho.getDescontoPreco()));
    }
}
