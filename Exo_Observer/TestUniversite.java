package Exo_Observer;

public class TestUniversite {
    public static void main(String[] args) {
        Cours java = new Cours("Java");

        Etudiant hamza = new Etudiant("hamza");
        Etudiant nissrin = new Etudiant("nissrin");

        java.inscription(nissrin);
        java.inscription(hamza);

        java.setAvaliable(true);
   
    }
}
