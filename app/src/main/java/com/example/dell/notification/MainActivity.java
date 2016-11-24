package com.example.dell.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        NotificationAdapter adapter = new NotificationAdapter(this,R.layout.single_row,getNotificationList());
        listView.setAdapter(adapter);

    }

    public ArrayList<Notification> getNotificationList() {
        ArrayList<Notification> notificationList =  new ArrayList<>();
        notificationList.add(new Notification(R.drawable.profile1,"Bikram posted in this group","4 hours ago"));
        notificationList.add(new Notification(R.drawable.profile2,"Bidhan posted in this group","4 hours ago"));
        notificationList.add(new Notification(R.drawable.profile3,"Kumar posted in this group","5 hours ago"));
        notificationList.add(new Notification(R.drawable.profile4,"Bijay posted in this group","4 hours ago"));
        notificationList.add(new Notification(R.drawable.profile5,"Jagat posted in this group","4 hours ago"));
        notificationList.add(new Notification(R.drawable.profile6,"Ayush posted in this group","6 hours ago"));

        return notificationList;

    }
}
