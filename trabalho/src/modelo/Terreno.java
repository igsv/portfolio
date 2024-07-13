package modelo;

public class Terreno extends Financiamento {
    //Constante
    private final double ADICIONAL = 1.02;

    //Atributos
    String zona;


    //Construtor
    public Terreno(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, String zona){
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.zona = zona;
    }

    
    //Getters
    public double getAdicional(){
        return ADICIONAL;
    }


    //Cálculos
        //Parcelas mensais
        public double calcularMensal(){
        double pagamentoMensal;

        pagamentoMensal = pagamentoMensal = pagamentoMensal = (getValorImovel() / (getPrazoFinanciamentoAnos() * 12)) * (1 + (getTaxaJurosAnual()/12)) * ADICIONAL;

        return pagamentoMensal;
        }

        //Custo total
        public double calcularTotal() {
            double pagamentoTotal;

            pagamentoTotal = calcularMensal() * getPrazoFinanciamentoAnos() * 12;
            
            return pagamentoTotal;
        }

        //Transforma prazo anual em meses
        public int getPrazoFinanciamentoMeses(){
            int prazoFinanciamentoMeses;

            prazoFinanciamentoMeses = getPrazoFinanciamentoAnos()*12;

            return prazoFinanciamentoMeses;
        }

        //Transforma juros anuais em mensal
        public double getTaxaJurosMensal(){
            double taxaJurosMensal;

            taxaJurosMensal = getTaxaJurosAnual() / 12;

            return taxaJurosMensal;
        }

}