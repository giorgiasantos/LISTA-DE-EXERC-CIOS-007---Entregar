import java.util.ArrayList;
import java.util.List;
public class Chile extends Paises{

    //ATRIBUTOS
    private String codigoIso;
    private String nomePais;
    private double populacao;
    private double dimensaoTerritorial;
    Bolivia bolivia;
    private List<String> paisesFronteira = new ArrayList<>();

    //CONSTRUCTOR
    public Chile(String codigoIso, String nomePais, double dimensaoTerritorial) {
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

    //MÉTODOS
    public void listarFronteiras(){
        paisesFronteira.add("Peru");
        paisesFronteira.add("Argentina");
        paisesFronteira.add("Bolívia");
    }
    public void confirmarFronteira(String pais) {
        if (paisesFronteira.contains(pais)) {
            System.out.println(pais + " FAZ FRONTEIRA COM O CHILE!");
        } else {
            System.out.println(pais + " NÃO FAZ FRONTEIRA COM O CHILE.");
        }
    }

    public void calcularDensidadePopulacional(){
        double densidadeDemografica = getPopulacao() / getDimensaoTerritorial();
        System.out.printf("A DENSIDADE POPULACIONAL DO CHILE É DE ");
        System.out.printf("%,.2f", densidadeDemografica);
        System.out.printf(" HABITANTES POR QUILÔMETRO QUADRADO.");
        System.out.println();
    }

    public void exibirPaisesEmComum(Bolivia bolivia){
        bolivia = new Bolivia("BOL", "Bolívia", 1098581);
        bolivia.listarFronteiras();
        paisesFronteira.retainAll(bolivia.getPaisesFronteira());
        System.out.println("OS PAÍSES COM FRONTEIRAS EM COMUM ENTRE OS DOIS PAÍSES SÃO:");
        System.out.println(paisesFronteira);
    }


}
