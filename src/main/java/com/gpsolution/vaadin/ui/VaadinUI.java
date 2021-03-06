package com.gpsolution.vaadin.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.util.UUID;

@SpringUI(path = "vaadin")
@Theme("valo")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        final Label label = new Label("Hello, vaadin team!");
        final Button button = new Button("Push me!");

        button.setIcon(FontAwesome.YOUTUBE);
        button.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        button.addClickListener(clickEvent -> {
            label.setValue(UUID.randomUUID().toString());
            Notification.show("Ho-ho-ho!!!");
        });
        layout.addComponent(label);
        layout.addComponent(button);
        setContent(layout);
    }
}
