public class Katze extends Vierbeiner{

    // Instanzvariablen (Attribute / Eigenschaften)
    private String rasse;


    // Hier kommt der Konstruktor der denselben Namen haben muss wie die Klasse
    // Constructor

    public Katze(String name, int alter, String fellfarbe, String rasse) {
        super(name, alter, fellfarbe);
        this.rasse = rasse;
    }

    public void miauMachen(){
        System.out.println("miau! fick dich, human!");
    }



}
