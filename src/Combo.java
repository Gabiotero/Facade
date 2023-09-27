import java.util.ArrayList;

public class Combo {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void criarCombo(int tipo){

        if(tipo == 2) {
            produtos.add(new Sobremesa("Sorvete", 5, "Grande"));
        }

        produtos.add(new Burguer("X-Bacon", 15, 200));
        produtos.add(new Bebida("Soda", 10, 500));
    }

    @Override
    public String toString() {
        String combo = "";

        for (Produto produto: produtos) {
            combo += produto.toString() + "\n";
        }

        return combo;
    }
}
