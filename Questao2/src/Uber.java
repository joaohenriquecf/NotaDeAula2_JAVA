public class Uber {

    private double distancia, tarifaBase, fatorDemanda, ValorFinal;
    private int tempoEspera;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public void fdemanda() {
        if (fatorDemanda == 12 || fatorDemanda == 18) {
            fatorDemanda = 1.5;
        } else {
            fatorDemanda = 1.0;
        }
    }

    public void calcularValorCorrida() {
        fdemanda();
        ValorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
    }

    public void exibirDetalhesCorrida() {
        calcularValorCorrida();
        System.out.println("Detalhes da Corrida: ");
        System.out.println("valor final da corrida: R$" + ValorFinal);
        System.out.println("Distancia percorrida: " + distancia + " Km's");
        System.out.println("tempo de espera: " + tempoEspera + "min");
        System.out.println("fator em demanda: R$" + fatorDemanda);
    }
}
