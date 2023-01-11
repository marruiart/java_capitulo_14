/**
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 *
 * @author: Marina Ruiz Artacho
 **/

import excepciones.ExcepcionApareamientoImposible;

public class Ejercicio02 {
    public static void main (String[] args) throws ExcepcionApareamientoImposible {
        Gato garfield = new Gato("macho", "Garfield");
        Gato jerry = new Gato("macho", "Jerry");
        Gato lisa = new Gato("hembra", "Lisa");
        Gato cria = garfield.apareaCon(lisa);
        System.out.println(cria);
        Gato cria2 = garfield.apareaCon(jerry);
        System.out.println(cria2);
    }
}
