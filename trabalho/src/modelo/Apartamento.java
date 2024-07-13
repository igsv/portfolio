package modelo;

public class Apartamento extends Financiamento {
    //Atributos
    int vagasGaragem;
    int andar;


    //Construtor
    public Apartamento(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, int vagasGaragem, int andar){
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    
    //Cálculos
        //Parcela mensal
        public double calcularMensal(){
            double pagamentoMensal;
            double taxaJurosMensal = getTaxaJurosAnual()/12; 
            

            pagamentoMensal = (getValorImovel() * Math.pow(1 + taxaJurosMensal, getPrazoFinanciamentoMeses())) / Math.pow(1 + taxaJurosMensal, getPrazoFinanciamentoMeses() - 1);

            return pagamentoMensal;
        }

        //Custo total
        public double calcularTotal() {
            double pagamentoTotal;

            pagamentoTotal = calcularMensal() * getPrazoFinanciamentoAnos() * 12;
            
            return pagamentoTotal;
        }

        //Prazo do financiamento em meses
        public int getPrazoFinanciamentoMeses(){
            int prazoFinanciamentoMeses;

            prazoFinanciamentoMeses = getPrazoFinanciamentoAnos()*12;

            return prazoFinanciamentoMeses;
        }

        //Transforma o juros anual em mensal
        public double getTaxaJurosMensal(){
            double taxaJurosMensal;

            taxaJurosMensal = getTaxaJurosAnual() / 12;

            return taxaJurosMensal;
        }

}