package controllers;

import com.sun.deploy.uitoolkit.impl.fx.Utils;

import play.Logger;
import play.mvc.*;
import services.DBConnection;
import views.html.*;

import com.egnaro.models.Expenses;
import com.egnaro.utils.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.jmkgreen.morphia.Datastore;

import play.api.libs.json.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	Logger.info("/  Initiaed ");
    	Datastore dataStore = DBConnection.getDBconnection(Constants.DB_SERVER_IP, Constants.DB_NAME, Constants.DB_PORT);
    	
    	Expenses expObj = new Expenses();
    	expObj.setClosingBalance(234234);
    	dataStore.save(expObj);
        return ok(index.render("Your new application is ready."));
    }
    
    
    public Result addTransaction(){
    	
    	Logger.info("addTransaction Required");
    	JsonNode requestJson = request().body().asJson();
    	
    	if(requestJson.isNull()){
    		Logger.error("Request JOSN is null");
    		return badRequest("Bad JSON");
    	}else{
    		Logger.trace("Request Json", requestJson.toString());
        	return ok("Added");

    	}
    }

}
