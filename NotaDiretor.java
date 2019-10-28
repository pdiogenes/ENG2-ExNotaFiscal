import java.util.ArrayList;

class NotaDiretor{
    protected NotaBuilder nota;
    public NotaDiretor (NotaBuilder nota){
        this.nota = nota;
    }

    public void buildNota(ArrayList<itemNota> it, String dest, int id){
        nota.buildId(id);
        nota.buildItems(it);
        nota.buildValorTotal();
        nota.buildDesconto();
        nota.buildImpostos();
        nota.buildValorFinal();
        nota.buildDataEmissao();
        nota.buildVencimento();
        nota.buildDestinatario(dest);
    }

    public Nota getNota(){
        return nota.getNota();
    }
}