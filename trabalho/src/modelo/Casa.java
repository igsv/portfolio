package modelo;

public class Casa extends Financiamento {
    //Constantes
    private final int ADICIONAL = 80; 
    
    //Atributos
    private double areaConstruida;
    private double tamanhoTerreno;


    //Construtor
    public Casa(double valorImovel, double taxaJurosAnual, int prazoFinanciamento, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, taxaJurosAnual, prazoFinanciamento);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }


    //Getters
    public int getAdicional(){
        return ADICIONAL;
    }


    //Cálculos
        //Parcela mensal
        public double calcularMensal(){
            double pagamentoMensal;
            
            pagamentoMensal = pagamentoMensal = (getValorImovel() / (getPrazoFinanciamentoAnos() * 12)) * (1 + (getTaxaJurosAnual()/12)) + ADICIONAL;

            return pagamentoMensal;
        }

        //Custo total
        public double calcularTotal() {
            double pagamentoTotal;

            pagamentoTotal = calcularMensal() * getPrazoFinanciamentoAnos() * 12;
            
            return pagamentoTotal;
        }

        //Transforma prazo de anos em meses
        public int getPrazoFinanciamentoMeses(){
            int prazoFinanciamentoMeses;

            prazoFinanciamentoMeses = getPrazoFinanciamentoAnos()*12;

            return prazoFinanciamentoMeses;
        }

        //Transforma juros anual em mensal
        public double getTaxaJurosMensal(){
            double taxaJurosMensal;

            taxaJurosMensal = getTaxaJurosAnual() / 12;

            return taxaJurosMensal;
        }
}