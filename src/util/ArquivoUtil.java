package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoUtil {
    
    //Salva uma lista de strings dentro de um arquivo qualquer
    public static void salvarDados(String nomeArquivo, List<String> linhas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine(); // Pula para a próxima linha
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo " + nomeArquivo + ": " + e.getMessage());
        }
    }

    //Lê um arquivo qualquer e devolve uma lista de strings
    public static List<String> carregarDados(String nomeArquivo) {

    List<String> linhas = new ArrayList<>();

    System.out.println("=================================");
    System.out.println("Tentando abrir: " + nomeArquivo);
    System.out.println("=================================");

    try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

        String linha;

        while ((linha = br.readLine()) != null) {
            linhas.add(linha);
        }

        System.out.println("Linhas carregadas: " + linhas.size());

    } catch (IOException e) {

        System.err.println("ERRO AO LER O ARQUIVO");
        System.err.println("Arquivo: " + nomeArquivo);

        e.printStackTrace();
    }
    //oi

    return linhas;
}
}
