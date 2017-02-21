package isima.fr.devicemovingspeed;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DeviceMovingSpeed extends Activity// implements Runnable
{
    public static final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 1;
    public static final int MY_PERMISSIONS_REQUEST_COARSE_LOCATION = 1;
    public static final int PERMISSION_LOCATION_REQUEST_CODE = 1;

    public static Activity ctx;
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v("Debug", "Activity started..");
        ctx = this;
        //showPermissionDialog();
        Intent myIntent=new Intent(this,MyService.class);
        startService(myIntent);
    }

    /*public void showPermissionDialog() {

        if (!MyService.checkPermission(this)) {
            Log.v("Debug", "CHECK PERM..");
            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSION_LOCATION_REQUEST_CODE);
        }
    }*/


}