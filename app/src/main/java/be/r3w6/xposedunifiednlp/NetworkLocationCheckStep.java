package be.r3w6.xposedunifiednlp;

import android.content.Context;
import android.location.LocationManager;

/**
* Created on 13.02.2015.
*/
class NetworkLocationCheckStep extends CheckStep {
    private Context context;

    public NetworkLocationCheckStep(Context context) {
        super("Network-based geolocation");
        this.context = context;
    }

    @Override
    public void runStep() {
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        if(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            setState(StepState.SUCCESS);
        } else {
            setState(StepState.FAIL);
        }
    }

    @Override
    public String getSolution() {
        return "Please activate netw