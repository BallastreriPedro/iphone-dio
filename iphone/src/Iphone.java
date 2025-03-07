public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocar();
        reprodutor.selecionarMusica("Batata Quente");
        reprodutor.pausar();

        aparelho.ligar("11 94849-5677");

        navegador.exibirPagina("www.google.com");
    }
}
