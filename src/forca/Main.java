package forca;
/*
 Main:
(1) Atributos:
• scanner: Scanner - entrada do utilizador
• jogoForca: JogoForca - instância do jogo
• gestorPalavras: GestorPalavras - gestor de palavras
• continuar: boolean - controlo do loop principal
(2) Métodos:
• main(String[] args) - Método principal
• mostrarMenuPrincipal() - Exibe menu principal
• processarOpcao(int opcao) - Processa escolha do utilizador
• executarJogo() - Controla fluxo do jogo
• mostrarEstatisticas() - Lê e exibe estatísticas do ficheiro estatisticas.txt
• validarEntrada(String entrada) - Valida entrada do utilizador
 */
import java.util.Scanner;

public class Main {
    private Scanner scanner;
    private JogoForca jogoForca;
    private GestorPalavras gestorPalavras;
    private boolean continuar;

    // construtor da classe Main
    public Main() {
        this.scanner=new Scanner(System.in);
        this.gestorPalavras=new GestorPalavras();
        this.continuar=true;
    }
}
