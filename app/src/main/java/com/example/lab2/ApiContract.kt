package com.example.lab2

interface ApiContract {
    interface View{
        fun onSuccess(rs:String);
        fun onFailure(e:String);
    }
    interface Presenter{
        fun getApiLab2_1(name:String,score:String)
        fun getApiLab2_2(length:String,width:String)
    }
}