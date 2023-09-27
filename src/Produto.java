public abstract class Produto {

    private String descricao;
    private double preco;

    public Produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public abstract String getMedida();

    @Override
    public String toString() {
        return descricao + " R$" + preco + " " + this.getMedida();
    }
}
