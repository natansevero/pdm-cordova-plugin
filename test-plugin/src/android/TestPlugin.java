package com.example;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.app.Activity;
import android.content.Intent;

public class TestPlugin extends CordovaPlugin {
    
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext cbContext) throws JSONException {
        if(action.equals("test")) {
            String arg = args.getString(0);
            Log.d("TestPlugin", arg);

            Activity activity = cordova.getActivity();
            Intent intent = new Intent(activity, LogService.class);
            activity.startService(intent);

            cbContext.success("Esse é o arg: " + arg);
            return true;
        }

        cbContext.error("\"" + action + "\" não é conhecida.");
        return false;
    }
}