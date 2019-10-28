class itemNota extends itemPrototype {
    
    protected itemNota(itemPrototype i){
        this.valorItem = i.getValorItem();
    }

    public itemNota(){
        nome = "";
        valorItem = 0;
    }

    @Override
    public String exibirInfo() {
        return "Nome = " + getNome() + "\nValor item: " + getValorItem();
    }

    @Override
    public itemPrototype clonar(){
        return new itemNota(this);
    }

}