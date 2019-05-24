package audio.trimmer.android.audioTrimmer;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AudioTrimmer extends CordovaPlugin {
 public static CallbackContext callbackContext;
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      this.callbackContext = callbackContext;
        if (action.equals("showAudioEditor")) {	
          this.coolMethod();
          return true;
        }
        return false;
    }

    private void coolMethod() {
		Context context = this.cordova.getActivity().getApplicationContext();
		openNewActivity(context);
    }

	private void openNewActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        this.cordova.getActivity().startActivity(intent);
    }
}
