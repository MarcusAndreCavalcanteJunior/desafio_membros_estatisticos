public class CalculoGeometrico {
/*"qual palavra-chave usamos quando o valor nunca pode ser alterado"
é final, mas para criar uma constante de classe completa, combinamos
com static.*/

    public static final double PI = 3.14;

    static double calcularAreaDoQuadrado(double ladoDoQuadrado) {
        return ladoDoQuadrado * ladoDoQuadrado;
    }
/*Por que um metodo static acessa PI diretamente?
Porque PI é static e está na mesma classe. Membros estáticos da mesma
classe se enxergam diretamente — sem precisar de prefixo ou instância.
Se PI estivesse em outra classe, aí precisaria do prefixo:
CalculoGeometrico.PI.*/
    static double calcularAreaDoCirculo(double raioDoCirculo ) {
        return PI * raioDoCirculo * raioDoCirculo;
    }

}
/*OBS foi para o metodo calcularAreaDoQuadrado exatamente virou o
ladoDoQuadrado creio que agora eu entendi ele se transformou no valor do
parametro como mostra na figura abaixo é isso ?
Exatamente isso! O Java Visualizer mostrou perfeitamente:
No main: lado = 4.0
Dentro do metodo: ladoDoQuadrado = 4.0*/
