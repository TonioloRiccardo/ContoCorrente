public class SaldoInsufficienteException extends Exception {
    public SaldoInsufficienteException(float saldoAttuale, float importoRichiesto) {
        super("Il saldo non è sufficiente. Deficit: " + (saldoAttuale - importoRichiesto) + "€");
    }
}
