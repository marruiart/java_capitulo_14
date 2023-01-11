package excepciones;

public class ExcepcionApareamientoImposible extends Exception {
    public ExcepcionApareamientoImposible () {
    }

    @Override
    public String getMessage () {
        return "ExcepcionApareamientoImposible: No se pueden aparear si son del mismo sexo";
    }
}
