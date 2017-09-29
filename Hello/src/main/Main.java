/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewMessage;
import models.ModelMessage;
import controller.ControllerMessage;

/**
 *
 * @author mark
 */
public class Main {
        private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage ControllerMessage;

    public static void main(String[] args) {
        viewMessage = new ViewMessage();
        modelMessage = new ModelMessage();
        ControllerMessage = new ControllerMessage(viewMessage, modelMessage);
    }
    
}
