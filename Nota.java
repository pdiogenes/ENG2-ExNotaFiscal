import java.time.LocalDate;
import java.util.ArrayList;

public class Nota{
    public double valorTotal, valorFinal, desconto, impostos;
    public LocalDate dataEmissao, vencimento;
    public String destinatario;
    public int id;
    public ArrayList<itemNota> items = new ArrayList<>();
}