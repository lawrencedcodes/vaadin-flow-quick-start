package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "/greeting")
public class MainView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    private Button goodbyeButton;


    public MainView() {
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        goodbyeButton = new Button("Goodbye", e -> Notification.show("Goodbye!"));
        add(goodbyeButton);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
