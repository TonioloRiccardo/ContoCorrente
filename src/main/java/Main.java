public class Main {
    static void main() {
        ContoBancario conto = new ContoBancario(20);
        conto.preleva(5);
        conto.preleva(30);
        conto.preleva(-5);
    }
}
