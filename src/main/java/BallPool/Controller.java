package BallPool;

import BallPool.View.View;
import BallPool.Model;

public class Controller {
  // MVC Components
  private Model model_;
  private View view_;

  public void setView(View view) {
    view_ = view;
  }

  public void setModel(Model model) {
    model_ = model;
  }
}



