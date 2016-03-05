package lgd.cervezapp;

import android.app.Application;

import lgd.cervezapp.services.webServices.BreweryService;
import lgd.cervezapp.services.webServices.ServiceGenerator;

/**
 * Created by florencia on 23/02/16.
 */
public class CervezappApplication extends Application {

    private final BreweryService breweryService;

    public CervezappApplication(){
        breweryService = ServiceGenerator.createService(BreweryService.class);
    }

    public BreweryService getBreweryService() {
        return breweryService;
    }

}
