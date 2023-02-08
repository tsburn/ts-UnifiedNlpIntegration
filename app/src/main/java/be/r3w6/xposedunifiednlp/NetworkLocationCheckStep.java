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
        this.context = c