import excepciones.ExcepcionApareamientoImposible;

public class Gato {
    private String color, raza, sexo, nombre;
    private int edad;
    private double peso;

    Gato (String s, String nombre) {
        this.sexo = s;
        this.nombre = nombre;
    }

    String getSexo () {
        return this.sexo;
    }

    String getNombre () {
        return this.nombre;
    }

    void maulla () {
        System.out.println("Miauuuu");
    }

    void ronronea () {
        System.out.println("mrrrrrr");
    }

    void come (String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    void peleaCon (Gato contrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo().equals("hembra")) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }

    public Gato apareaCon (Gato pareja) throws ExcepcionApareamientoImposible {
        Gato cria = null;
        try {
            if (this.sexo.equals(pareja.getSexo()))
                throw new ExcepcionApareamientoImposible();
            cria = new Gato(Math.random() < 0.5 ? "hembra" : "macho", "cria");
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println("Error: " + e.getMessage());
        }
        return cria;
    }

    @Override
    public String toString () {
        return "Es " + (this.getSexo().equals("macho") ? "gato" : "gata") + " se llama " + getNombre();
    }
}
