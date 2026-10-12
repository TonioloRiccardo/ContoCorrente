public class ContoBancario {
    float saldo;

    public ContoBancario(float saldo) {
        this.saldo = saldo;
    }

    public void preleva(float importo) {
        if(importo <= 0) {
            throw new ImportoNonValidoException();
        }

        try {
            if(importo > saldo) {
                throw new SaldoInsufficienteException(saldo, importo);
            }
            else {
                saldo -= importo;
                IO.println("Prelievo di " + importo + "€ effettuato correttamente!");
            }
        } catch (SaldoInsufficienteException e) {
            IO.println(e);
        }
    }
}
