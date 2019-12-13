package com.example.dietapp


import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent
import android.graphics.Color
import android.widget.Button
import androidx.fragment.app.FragmentContainer
//import android.R
import com.example.dietapp.ui.EggTimerFragment



class NotificationActivity : Fragment() {
    lateinit var v: View
    lateinit var fragview: View
    private var notificationManager: NotificationManager? = null
    private var button_notify: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        super.onCreate(savedInstanceState);
//        fragview = inflater.inflate(R.layout.fragment_add_food,container,false)
//        button_notify = findViewById(R.id.notify)
//        button_notify.setOnClickListener(View.OnClickListener { sendNotification() })
//        v = inflater.inflate(R.layout.fragment_notification, container, false);
//
//        val mNotificationManager =
//            activity!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//
//        createNotificationChannel("com.example.dietapp",
//            "Notification Demo",
//            "Demo Test")
//
        return inflater.inflate(R.layout.fragment_notification,container,false)
//    }
//
//    private fun createNotificationChannel(id:String,name:String,description:String){
//
//        val importance = NotificationManager.IMPORTANCE_LOW
//        val channel = NotificationChannel(id,name,importance)
//        channel.description = description
//
//        notificationManager?.createNotificationChannel(channel)
//    }

//    fun sendNotification(view: View){
//
//        val notificationId = 101
////        val resultIntent = Intent(context, ShowNotification::class.java)
//
//        val pendingIntent = PendingIntent.getActivity(context,0,resultIntent,PendingIntent.FLAG_UPDATE_CURRENT)
//
//
//        val channelId= "notification.kotlin.com.kotlinnotificationdemo"
//
//        val notification = Notification.Builder(context, channelId)
//            .setContentTitle("Demo Notification")
//            .setContentText("Hi Buddy")
//            .setSmallIcon(android.R.drawable.ic_dialog_info)
//            .setChannelId(channelId)
//            .setContentIntent(pendingIntent)
//            .build()
//
//        notificationManager?.notify(notificationId, notification)
//
//    }
//}
    }
}