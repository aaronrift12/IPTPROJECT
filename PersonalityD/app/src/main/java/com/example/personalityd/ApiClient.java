package com.example.personalityd;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiClient {
    // Define the API call you want to make
    @POST("predict")  // Replace with your actual API endpoint
    Call<PredictionResponse> getPrediction(@Body TextRequest textRequest);
}
