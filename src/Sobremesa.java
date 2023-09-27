public class Sobremesa extends Produto{

    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho){
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String getMedida() {
        return tamanho;
    }
}
