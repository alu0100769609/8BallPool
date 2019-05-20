package BallPool;

import BallPool.View.View;
import BallPool.Controller;
import BallPool.Model;

public class App {
  public static void main(String[] args) {
    // Create MVC components
    Controller controller = new Controller();
    Model model = new Model();
    View view = new View(model, controller);

    // Link controller with the rest of components
    controller.setModel(model);
    controller.setView(view);

    // Show window
    view.setVisible(true);

    controller.addBall(50, 50);
    controller.addBall(150, 150);
    controller.addBall(250, 50);
    controller.addBall(350, 200);
    controller.addBall(490, 210);

    controller.startGame();
  }
}
