package Exo_Observer;

public interface Subject {
    void inscription(Observer observer);
    void desinscription(Observer observer);
    void notifayAllinscription();
}
