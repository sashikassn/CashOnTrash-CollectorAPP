package com.slash.cashontrash.Common;

import android.location.Location;

import com.google.android.libraries.places.api.internal.impl.net.pablo.PlaceResult;
import com.slash.cashontrash.Remote.FCMClient;
import com.slash.cashontrash.Remote.IFCMService;
import com.slash.cashontrash.Remote.IGoogleAPI;
import com.slash.cashontrash.Remote.RetrofitClient;

public class Common {

//    public static String currentToken = "";

    public static final String collector_tbl = "TrashCollectors";
    public static final String user_collector_tbl = "CollectorsInformation";
    public static final String user_resident_tbl = "ResidentsInformation";
    public static final String trashpickup_request_tbl = "TrashPickRequest";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;




    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }

    public static IFCMService getIFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);

    }
}
