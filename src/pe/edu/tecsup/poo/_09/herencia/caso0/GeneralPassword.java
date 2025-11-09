package pe.edu.tecsup.poo._09.herencia.caso0;

public class GeneralPassword {

    private String keyword = "ABC123";

    protected String version = "1.0";

    protected String encrytarWord(String word) {
        return this.keyword + word + this.version;
    }
}
