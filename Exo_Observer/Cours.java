package Exo_Observer;

import java.util.ArrayList;
import java.util.List;

public class Cours implements Subject {
    private String name_cours ;
    private String avaliable;
    private List<Observer> list_observer ;

    public Cours(String name)
    {
        this.name_cours = name;
        this.list_observer = new ArrayList<>();
    }

    @Override
    public void inscription(Observer observer) {
        list_observer.add(observer);

    }

    @Override
    public void desinscription(Observer observer) {
        list_observer.remove(observer);
    }

    @Override
    public void notifayAllinscription() {
        for(Observer observer : list_observer)
        {
            observer.update(avaliable);
        }
    }

    public void setAvaliable(boolean avaliable_boo) {
        avaliable = this.name_cours + (avaliable_boo ? " Avalibale" : " Not Avalibale");
        notifayAllinscription();
    }
}
