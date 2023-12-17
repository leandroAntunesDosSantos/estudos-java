import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) throws ParseException {
            // Lê os dados de Entrada conforme descrito neste Desafio.
            Scanner scanner = new Scanner(System.in);
            String dataInicial = scanner.nextLine();
            String dataFinal = scanner.nextLine();

            SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
            List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

            for (String analise: analises) {
                System.out.println(analise);
            }
        }
    }
}
