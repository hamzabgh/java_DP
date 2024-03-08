package Exo_Observer;

/**
 * Etudiant
 */
public class Etudiant implements Observer {

    private String name;

    Etudiant(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " " + message);
    }
}