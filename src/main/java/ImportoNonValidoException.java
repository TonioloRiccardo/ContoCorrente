public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException() {
        super("Importo minore o uguale a zero");
    }
}
