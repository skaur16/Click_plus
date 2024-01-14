package com.example.clickplus

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FireBase {
    val db = Firebase.firestore



   fun counter(count:Int) {

       Log.d("myTag", "This is FireBase")
       Log.d("Value of count", count.toString())


       val x = hashMapOf(
           "value" to count
       )

       db.collection("MyFolder")
           .document("MyMrji")
           .set(x)
   }
}