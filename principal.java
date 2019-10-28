import java.util.*;

class principal{
    static void printNota(Nota nota){
        System.out.println("Items: ");
        for(itemNota item : nota.items){
            System.out.println("\tNome: " + item.getNome());
            System.out.println("\tValor: R$" + String.format("%.2f", item.getValorItem()) + "\n");
        }
        System.out.println("ID da nota: "+ nota.id +
            "\nValor total da nota: R$" + String.format("%.2f", nota.valorTotal) +
            "\nDesconto: " + String.format("%.2f", (nota.desconto * 100)) + "%" +
            "\nImpostos: " + String.format("%.2f", (nota.impostos * 100)) + "%" +
            "\nValor final da nota: R$" + String.format("%.2f", nota.valorFinal) +
            "\nData de Emissao: " + nota.dataEmissao +
            "\nData de Vencimento: " + nota.vencimento +
            "\nDestinatario da nota: " + nota.destinatario + "\n");
    }

    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        GeraIdentificador gerador = GeraIdentificador.getInstance();
        int id1 = gerador.getId();

        itemNota item1 = new itemNota();
        item1.setItem(1000, "Pao de Queijo");

        itemNota item2 = new itemNota();
        item2.setItem(1000, "Toddynho");

        ArrayList<itemNota> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        System.out.println("Insira o destinatário: ");
        String dest = sc.nextLine();

        NotaDiretor notaFiscal = new NotaDiretor(new NotaMinas());
        notaFiscal.buildNota(items, dest, id1);
        Nota nota = notaFiscal.getNota();

        printNota(nota);

        notaFiscal = new NotaDiretor(new NotaSP());
        int id2 = gerador.getId();
        notaFiscal.buildNota(items, dest, id2);
        Nota nota2 = notaFiscal.getNota();

        
        printNota(nota2);
    }
}