package uni.edu.pe;

public class ScooterException extends RuntimeException {
    private static String msgError = "Se produjo el siguiente error";
    public ScooterException ( String string ){
        super(msgError + " -> " + string );
    }
    public ScooterException(){
        super(msgError);
    }

}
