package modelo;

public abstract class Financiamento {
    //Atributos
    private double valorImovel;
    private double taxaJurosAnual;
    private int prazoFinanciamentoAnos; //em anos

    //Construtor
    public Financiamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamentoAnos){
        this.valorImovel = valorImovel;
        this.taxaJurosAnual = taxaJurosAnual;
        this.prazoFinanciamentoAnos = prazoFinanciamentoAnos;
    }


    //Getters
    public double getValorImovel(){
        return this.valorImovel;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public int getPrazoFinanciamentoAnos(){
        return this.prazoFinanciamentoAnos;
    }    

    

    //Setters
    public void setValorImovel(double valorImovel){
        this.valorImovel = valorImovel;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void setPrazoFinanciamento(int prazoFinanciamentoAnos) {
        this.prazoFinanciamentoAnos = prazoFinanciamentoAnos;
    }


    //Cálculos
    public abstract int getPrazoFinanciamentoMeses();

    public abstract double getTaxaJurosMensal();

    public abstract double calcularMensal();
    
    public abstract double calcularTotal();

}