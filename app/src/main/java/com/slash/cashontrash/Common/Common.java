package com.slash.cashontrash.Common;

import com.slash.cashontrash.Remote.IGoogleAPI;
import com.slash.cashontrash.Remote.RetrofitClient;

public class Common {

    public static final String collector_tbl = "TrashCollectors";
    public static final String user_collector_tbl = "CollectorsInformation";
    public static final String user_resident_tbl = "ResidentsInformation";
    public static final String trashpickup_request_tbl = "TrashPickRequest";


    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }
}
