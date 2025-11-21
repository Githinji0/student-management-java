package com.contoso;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.contoso.ui.fx.FxApp;

import javafx.application.Application;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        Application.launch(FxApp.class, args);
    }
}
