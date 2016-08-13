package firebase.push.estudos.com.examplepushnotificationfcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ricardoogliari on 8/11/16.
 */

public class MyFirebaseInstanceIdService
        extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e("TESTEFCM", "token no service: " + token);
    }
}
