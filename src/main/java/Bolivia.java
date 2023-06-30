import java.util.ArrayList;
import java.util.List;
public class Bolivia extends Paises{

    //ATRIBUTOS
    private String codigoIso;
    private String nomePais;
    private double populacao;
    private double dimensaoTerritorial;
    Chile chile;
    private List<String> paisesFronteira = new ArrayList<>();

    //CONSTRUCTOR
    public Bolivia(String codigoIso, String nomePais, double dimensaoTerritorial) {
        this.codigoIso = codigoIso;
        this.nomePais = nomePais;
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    // GETTERS E SETTERS
    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    public void setDimensaoTerritorial(double dimensaoTerritorial) {
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    public List<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(List<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }

    // MÉTODOS
    public void listarFronteiras() {
        paisesFronteira.add("Argentina");
        paisesFronteira.add("Brasil");
        paisesFronteira.add("Chile");
        paisesFronteira.add("Paraguai");
        paisesFronteira.add("Peru");
    }

    public void confirmarFronteira(String pais) {
        if (paisesFronteira.contains(pais)) {
            System.out.println(pais + " FAZ FRONTEIRA COM A BOLÍVIA!");
        } else {
            System.out.println(pais + " NÃO FAZ FRONTEIRA COM A BOLÍVIA.");
        }
    }

    public void calcularDensidadePopulacional() {
        double densidadeDemografica = getPopulacao() / getDimensaoTerritorial();
        System.out.printf("A DENSIDADE POPULACIONAL DA BOLÍVIA É DE ");
        System.out.printf("%,.2f", densidadeDemografica);
        System.out.printf(" HABITANTES POR QUILÔMETRO QUADRADO.");
        System.out.println();
    }

    public void exibirPaisesEmComum(Chile chile){
        chile = new Chile("CHL", "Chile", 756950);
        chile.listarFronteiras();
        paisesFronteira.retainAll(chile.getPaisesFronteira());
        System.out.println("OS PAÍSES COM FRONTEIRAS EM COMUM ENTRE OS DOIS PAÍSES SÃO:");
        System.out.println(paisesFronteira);
    }


}


