package com.slash.cashontrash.Remote;

import com.slash.cashontrash.Model.FCMResponse;
import com.slash.cashontrash.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAADHH72R4:APA91bHef-JDWAh0uZ_7WiyKZbBpTq-g15SCoVs4L1R43XHhOBwrYDk_eC9hlXoTQb1nJwmzX2HFUlVB8tr61B_71DCQYgj6cMQ7CEMk0Ii2fA_qRSBvSApmfEuMD5rgnj8Yu2pS6q4u"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);

}
