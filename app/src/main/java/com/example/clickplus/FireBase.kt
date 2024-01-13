package com.example.clickplus

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FireBase {
    val db = Firebase.firestore



   fun counter(count:Int) {
       val x = hashMapOf(
           "value" to count
       )

       db.collection("MyFolder")
           .document("MyMrji")
           .set(x)
   }
}