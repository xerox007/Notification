package com.example.dell.notification;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 11/23/2016.
 */
public class NotificationAdapter extends ArrayAdapter<Notification> {

    private Context context;
    private ArrayList<Notification> notificationArrayList;
    private int resourceId;

    public NotificationAdapter(Context context, int resource, ArrayList<Notification> list) {
        super(context, resource, list);
        this.context = context;
        this.notificationArrayList = list;
        this.resourceId = resource;
    }

    @Override
    public int getCount() {
        return notificationArrayList.size();
    }

    @Nullable
    @Override
    public Notification getItem(int position) {
        return notificationArrayList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mLayoutInflater= LayoutInflater.from(context);
        View view= mLayoutInflater.inflate(R.layout.single_row, parent, false);

        TextView txtMessage= (TextView) view.findViewById(R.id.textView);
        TextView txtTime=(TextView)view.findViewById(R.id.textView2);
        ImageView ivProfile = (ImageView) view.findViewById(R.id.imageView);

        Notification mNotification = getItem(position);
        txtMessage.setText(mNotification.getMessage());
        txtTime.setText(mNotification.getTime());
        ivProfile.setImageResource(mNotification.getImage());

        return view;
    }


}
