package controllers;

import java.util.stream.Stream;

import model.FormData;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import play.data.Form;

public class SecondPage extends Controller {


    public Result index() {
        return ok(views.html.second.index.render("new page"));
    }
    
    public Result indexWithForm() {
        Form<FormData> form = Form.form(FormData.class);
        //TODO
        return ok(views.html.second.index.render(form.bindFromRequest(request(), "field1").get().getField1()));
    }
}
