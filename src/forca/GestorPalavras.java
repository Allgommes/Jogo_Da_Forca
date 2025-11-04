/**
*(1) Atributos:
* palavras: List<String> - lista de palavras do ficheiro
• ficheiroPalavras: String - caminho do ficheiro ("palavras.txt")
• palavraAtual: String - palavra em jogo
*(2) Métodos:
• Getters e Setters
• carregarPalavras() - Lê palavras do ficheiro
• escolherPalavraAleatoria() - Seleciona palavra random da lista
• validarFicheiro() - Verifica se ficheiro existe
• obterTotalPalavras() - Retorna número de palavras disponíveis
 */


package forca;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GestorPalavras {
    //atributos privados
    private List<String> palavras;
    private String ficheiroPalavras;
    private String palavraAtual;

    //o construtor referente aos atributos privados
    public GestorPalavras() {
        this.palavras=new ArrayList<>();
        this.ficheiroPalavras="palavras.txt";
        this.palavraAtual="";
    }

    //getters e setters

    public List<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(List<String> palavras) {
        this.palavras = palavras;
    }

    public String getFicheiroPalavras() {
        return ficheiroPalavras;
    }

    public void setFicheiroPalavras(String ficheiroPalavras) {
        this.ficheiroPalavras = ficheiroPalavras;
    }

    public String getPalavraAtual() {
        return palavraAtual;
    }

    public void setPalavraAtual(String palavraAtual) {
        this.palavraAtual = palavraAtual;
    }
    // método carregar palavras do ficheiro
    public void carregarPalavras() {
        try (BufferedReader br = new BufferedReader(new FileReader(ficheiroPalavras))){

            String linha;
            while ((linha = br.readLine()) != null) {
                linha=linha.trim().toUpperCase();
                if(!linha.isEmpty()){
                    palavras.add(linha);
                }
            }
            console.log("Palavras carregadas com sucesso. Total: " + palavras.size());
        } catch (Exception e) {
            System.out.println("Erro ao carregar palavras: " + e.getMessage());
        }
    }
    //método escolher palavra aleatória
}
