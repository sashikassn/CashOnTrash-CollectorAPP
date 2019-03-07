package com.slash.cashontrash.Service;

import android.content.Intent;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.slash.cashontrash.ResidentCall;

public class MyFirebaseMessaging extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {


        LatLng resident_location = new Gson().fromJson(remoteMessage.getNotification().getBody(),LatLng.class);

        Intent intent = new Intent(getBaseContext(), ResidentCall.class);
        intent.putExtra("lat",resident_location.latitude);
        intent.putExtra("lng",resident_location.longitude);


        startActivity(intent);

    }
}
