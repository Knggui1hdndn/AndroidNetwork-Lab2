package com.example.lab2

import android.util.Log
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiClientPresenter(val view:ApiContract.View):ApiContract.Presenter {
    override fun getApiLab2_1(name: String, score: String) {
        ApiClient.apiInterface.getApiLab2_1(name,score).enqueue(object :Callback<ResponseBody>{
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                 if (response.isSuccessful) view.onSuccess(response.body()!!.string())
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
               view.onFailure(t.message.toString())
            }

        })

    }

    override fun getApiLab2_2(length: String, width: String) {
        ApiClient.apiInterface.getApiLab2_2(length,width).enqueue(object :Callback<ResponseBody>{
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                if (response.isSuccessful) view.onSuccess(response.body()!!.string() )
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                view.onFailure(t.message.toString())
            }

        })

    }

}