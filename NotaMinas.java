import java.time.LocalDate;
import java.util.ArrayList;

class NotaMinas extends NotaBuilder{
    @Override
    public void buildId(int id) {
        nota.id = id;
    }

    @Override
    public void buildItems(ArrayList<itemNota> it) {
        nota.items = it;
    }

    @Override
    public void buildValorTotal(){
        double valor = 0;
        for(itemNota item : nota.items){
            valor += item.getValorItem();
        }
        nota.valorTotal = valor;
    }

    @Override
    public void buildDesconto(){
        nota.desconto = 0.05;
    }

    @Override
    public void buildImpostos(){
        nota.impostos = 0.07;
    }

    @Override
    public void buildValorFinal(){
        nota.valorFinal = (nota.valorTotal * (1 - nota.desconto)) * (1 + nota.impostos);
    }

    @Override
    public void buildDataEmissao(){
        nota.dataEmissao = LocalDate.now();
    }

    @Override
    public void buildVencimento(){
        nota.vencimento = nota.dataEmissao.plusDays(7);
    }

    @Override
    public void buildDestinatario(String dest){
        nota.destinatario = dest;
    }
}