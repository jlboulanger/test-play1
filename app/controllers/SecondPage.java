package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class SecondPage extends Controller {


    public Result index() {
        return ok(views.html.second.index.render("new page"));
    }
}
