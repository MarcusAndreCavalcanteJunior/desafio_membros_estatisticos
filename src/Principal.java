public class Principal {
/*Como seus métodos utilitários (como calcularAreaDoQuadrado e
calcularAreaDoCirculo)e a constante PI foram declarados como static,
 você NÃO precisa criar objetos (instâncias) da classe.Você pode chamar
os métodos diretamente pelo nome da classe dentro do main*/
    public static void main(String[] args) {
        double lado = 4;
        double raio = 5;

        double areaDoQuadrado = CalculoGeometrico.calcularAreaDoQuadrado(lado);
        double areaDoCirculo = CalculoGeometrico.calcularAreaDoCirculo(raio);

        System.out.printf("A área do quadrado foi de: %.2f%n", areaDoQuadrado);
        System.out.printf("A área do círculo foi de: %.2f%n", areaDoCirculo);
    }
}
