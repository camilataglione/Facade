public class Combo {

    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int pedido){

        if(pedido == 1) {
            burguer = new Burguer("X-Burguer", 15, 500);
            bebida = new Bebida("Coca-Cola", 10, 200);
        } else if (pedido == 2) {
            burguer = new Burguer("X-Burguer", 15, 500);
            bebida = new Bebida("Coca-Cola", 10, 200);
            sobremesa = new Sobremesa("Sunday", 15, "Médio");
        }

    }

    @Override
    public String toString() {
        String combo = "";

        if(burguer != null){
            combo += burguer.getDescricao() + " R$" + burguer.getPreco() + " " + burguer.getGramas() + "g\n";
        }

        if(sobremesa != null){
            combo += sobremesa.getDescricao() + " R$" + sobremesa.getPreco() + " " + sobremesa.getTamanho() + "\n";
        }

        if(bebida != null){
            combo += bebida.getDescricao() + " R$" + bebida.getPreco() + " " + bebida.getMl() + "ml\n";
        }

        return combo;
    }
}
