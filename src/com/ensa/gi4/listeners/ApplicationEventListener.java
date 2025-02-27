package com.ensa.gi4.listeners;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListener<T extends Materiel> implements ApplicationListener<MyEvent<T>> {
  /*  @Override
    public void onApplicationEvent(MyEvent<T> event) {
        System.out.println("Event triggered");
        System.out.println("event.getEventType() = " + event.getEventType());
        System.out.println("event.getSource() = " + event.getSource());
    } */
    @Override
    public void onApplicationEvent(MyEvent<T> event) {

        if (event.getEventType().toString().equals("ADD")) {
            if (event.getSource() instanceof Materiel) {
                System.out.println("un materiel a été ajouté");
            }
        }
        if (event.getEventType().toString().equals("UPDATE")) {
            if (event.getSource() instanceof Materiel) {
                System.out.println("un materiel a été modifie");
            }
        }

    }
}
