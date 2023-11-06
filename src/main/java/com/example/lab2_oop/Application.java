package com.example.lab2_oop;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 600, 600);
        stage.setTitle("Lab2");
        borderPane.setCenter(root);
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("Файл");
        Menu shapes = new Menu("Фігури");
        Menu info = new Menu("Довідка");

        menuBar.getMenus().addAll(file, shapes, info);

        ToggleGroup toggleGroup = new ToggleGroup();
        RadioMenuItem point = new RadioMenuItem("Крапка");
        RadioMenuItem line = new RadioMenuItem("Лінія");
        RadioMenuItem rectangle = new RadioMenuItem("Прямокутник");
        RadioMenuItem ellipse = new RadioMenuItem("Еліпс");
        point.setToggleGroup(toggleGroup);
        line.setToggleGroup(toggleGroup);
        rectangle.setToggleGroup(toggleGroup);
        ellipse.setToggleGroup(toggleGroup);

        shapes.getItems().addAll(point, line, rectangle, ellipse);
        borderPane.setTop(menuBar);

        point.setOnAction(actionEvent -> {
            ShapeObjectsEditor.startPointEditor(scene, root);
        });

        line.setOnAction(actionEvent -> {
            ShapeObjectsEditor.startLineEditor(scene, root);
        });

        rectangle.setOnAction(actionEvent -> {
            ShapeObjectsEditor.startRectEditor(scene, root);
        });

        ellipse.setOnAction(actionEvent -> {
            ShapeObjectsEditor.startEllipseEditor(scene, root);
        });

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}

