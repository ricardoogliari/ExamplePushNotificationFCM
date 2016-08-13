package firebase.push.estudos.com.examplepushnotificationfcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by ricardoogliari on 8/11/16.
 */

public class MyFirebaseMessagingService
        extends FirebaseMessagingService {



    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Map<String, String> data = remoteMessage.getData();
        for (Map.Entry<String, String> entry : data.entrySet())
        {
            Log.e("TESTEFCM", "key: " + entry.getKey());
            Log.e("TESTEFCM", "value: " + entry.getValue());
        }

    }
}