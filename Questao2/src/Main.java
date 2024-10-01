import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Uber u = new Uber();

        System.out.println("Digite a distância percorrida em km: ");
        u.setDistancia(sc.nextDouble());

        System.out.println("Digite o tempo de espera em minutos: ");
        u.setTempoEspera(sc.nextInt());

        System.out.println("Digite o valor da tarifa base: ");
        u.setTarifaBase(sc.nextDouble());

        System.out.println("Digite o fator em demanda: ");
        u.setFatorDemanda(sc.nextDouble());
        
        u.exibirDetalhesCorrida();

        sc.close();
    }
}