package BallPool;

import BallPool.View.View;
import BallPool.Controller;
import BallPool.Model;

public class App {
  public static void main(String[] args) {
    // Create MVC components
    Controller controller = new Controller();
    View view = new View(controller);
    Model model = new Model();

    // Link controller with the rest of components
    controller.setModel(model);
    controller.setView(view);

    // Show window
    view.setVisible(true);
  }
}
