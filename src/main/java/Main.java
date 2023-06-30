public class Main {
    public static void main(String[] args) {
        Chile chile = new Chile("CHL", "Chile", 756950);
        chile.setPopulacao(18050000);

        Bolivia bolivia = new Bolivia("BOL", "Bolívia", 1098581);
        bolivia.setPopulacao(10969049);

        chile.listarFronteiras();
        bolivia.listarFronteiras();

        chile.confirmarFronteira("Bolívia");
        bolivia.confirmarFronteira("Chile");

        chile.exibirPaisesEmComum(bolivia);
        bolivia.exibirPaisesEmComum(chile);

        chile.calcularDensidadePopulacional();
        bolivia.calcularDensidadePopulacional();

    }
}
