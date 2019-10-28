import java.util.ArrayList;

public abstract class NotaBuilder {
    protected Nota nota;

    public NotaBuilder(){
        nota = new Nota();
    }

    public abstract void buildId(int id);
    public abstract void buildValorTotal();
    public abstract void buildValorFinal();
    public abstract void buildDesconto();
    public abstract void buildImpostos();
    public abstract void buildDataEmissao();
    public abstract void buildVencimento();
    public abstract void buildDestinatario(String dest);
    public abstract void buildItems(ArrayList<itemNota> it); 

    public Nota getNota(){
        return nota;
    }
}