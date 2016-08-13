package firebase.push.estudos.com.examplepushnotificationfcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e("TESTEFCM", "token no service: " + token);

        //dFiNmy0nY8A:APA91bHLFPs55iKCTodUVnKISGAz-zFFJJe2dW_zi3As5Q5YGdY-F41CfbN6vXgcVAkTcnbb34F9XRkRZvitZLNbpi-uEoVPiKJJddOdzheMN6a8KuH5NLkjM_ajTsTVCcqtpLwnfAj9
        //dFiNmy0nY8A:APA91bHLFPs55iKCTodUVnKISGAz-zFFJJe2dW_zi3As5Q5YGdY-F41CfbN6vXgcVAkTcnbb34F9XRkRZvitZLNbpi-uEoVPiKJJddOdzheMN6a8KuH5NLkjM_ajTsTVCcqtpLwnfAj9
//fm5uWYKBIkg:APA91bG05v746Cx0b7WdgJ2WPsEMGVq_tYLiFXJQ2LYWokYwG8oc5XF1xJJ4ErCZxbpXxyj26C3DUbw8RbeEYx914AIfnx19M9vT-gk__xptpWwEPotzBTnfQuto7i6R2wE763udYWHZ
        /*
        URL obj = new URL("https://fcm.googleapis.com/fcm/send");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Authorization", "key=AIzaSyA9k6AzsOzMT4ilErhdlx-eqbS_iZsdoaA");
        con.setRequestProperty("Content-Type", "application/json");

        // For POST only - START
        con.setDoOutput(true);
        String toSend = "{\"to\":\"dFiNmy0nY8A:APA91bHLFPs55iKCTodUVnKISGAz-zFFJJe2dW_zi3As5Q5YGdY-F41CfbN6vXgcVAkTcnbb34F9XRkRZvitZLNbpi-uEoVPiKJJddOdzheMN6a8KuH5NLkjM_ajTsTVCcqtpLwnfAj9\",\"data\":{\"score\":\"3x1\"}}";
        OutputStream writer = con.getOutputStream();
        writer.write(toSend.getBytes());
        writer.flush();
        writer.close();
        * */
    }
}
