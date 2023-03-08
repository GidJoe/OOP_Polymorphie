public class Main {

    //hier ist die Klassenebene
    //hier kannst du nur Instanzvariablen, Konstruktor und Methoden deklarieren
    public static void main(String[] args) {


        //hier befinden wir uns in der STATIC Methode Main,
        // die muss ja Static sein damit sie Objekt unabhängig funktioniert.


        Katze Katie = new Katze("Katie", 0, "Gelb", "Norweger");

        Vierbeiner Dukie = new Katze("Dukie", 0, "grün", "Norweger");

        Katie.alterErhoehen();
        Katie.alterErhoehen();
        Katie.alterErhoehen();
        Katie.detailsAusgeben();



    }
}