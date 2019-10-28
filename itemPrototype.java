abstract class itemPrototype{
    
    protected double valorItem;
    protected String nome;

    public abstract itemPrototype clonar();
    public abstract String exibirInfo();
    
    public double getValorItem() {
        return valorItem;
    }

    public String getNome() {
        return nome;
    }
    
    public void setItem(int valorItem, String nome) {
        this.valorItem = valorItem;
        this.nome = nome;
    }

}