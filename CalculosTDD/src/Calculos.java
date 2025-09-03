
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        throw new UnsupportedOperationException("En construcción.");
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        int contador = 0;
        frase = frase.toLowerCase(); // convertir todo a minúsculas

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(c) != -1) {  // si es vocal
                contador++;
            }
        }
        return contador;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        throw new UnsupportedOperationException("En construcción.");
    }

}
