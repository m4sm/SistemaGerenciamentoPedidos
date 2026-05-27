package util;

public class Validador {

    //Evita salvar campos em branco ou cheios de espaço
    public static boolean isCampoVazio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    //Garante que o usuário digitou apenas letras
    public static boolean isApenasLetras(String texto) {
        if (isCampoVazio(texto)) return false;
        return texto.matches("^[A-Za-zA-ZÀ-ÿ\\s]+$");
    }

    //Garante que o texto pode ser convertido em número inteiro (evita quebrar no ID ou Quantidade)
    public static boolean isNumeroInteiroValido(String texto) {
        if (isCampoVazio(texto)) return false;
        try {
            int num = Integer.parseInt(texto);
            return num >= 0; // Garante que não é um número negativo
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Garante que o texto pode ser convertido em dinheiro/peso (evita quebrar no Preço do Produto)
    public static boolean isNumeroDecimalValido(String texto) {
        if (isCampoVazio(texto)) return false;
        try {
            // Trata se o usuário digitar com vírgula em vez de ponto
            String textoTratado = texto.replace(",", ".");
            double num = Double.parseDouble(textoTratado);
            return num >= 0.0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}