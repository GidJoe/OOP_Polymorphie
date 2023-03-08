public class Vierbeiner {
    // Übung von falconbyte zu Klassen und Objekten
    //Oberklasse für katze, Hunde und Zentauren

    // Hier bitte Instanzvariablen
    private String name, superkraft;
    private int alter;
    private String fellfarbe;

    // Konstruktor
    public Vierbeiner(String name, int alter, String fellfarbe) {
        this.name = name;
        this.alter = 0;
        this.fellfarbe = fellfarbe;
        super
    }


    public void alterErhoehen(){
        this.alter++;
    }

    public void detailsAusgeben(){
        System.out.println("Name: "+name);
        System.out.println("Alter: "+alter);
        System.out.println("Rasse: "+rasse);
        System.out.println("Superkraft: ");
    }


}
