package com.example.customelistexample.mine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.customelistexample.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<MyContact> contacts;
    LayoutInflater inflater;

    public CustomAdapter(Context appContext, ArrayList<MyContact> contacts){
        this.context=appContext;
        this.contacts=contacts;
        inflater=(LayoutInflater.from(appContext));
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_item_layout,null);

        TextView tvName=view.findViewById(R.id.tvContactTitle);
        ImageView imgIcon = view.findViewById(R.id.imgContactIcon);
        TextView tvPhone=view.findViewById(R.id.tvContactNumber);
        ImageButton btnCall = view.findViewById(R.id.btnContactCall);
        ConstraintLayout clHost=view.findViewById(R.id.cl_host_item);

        tvName.setText(contacts.get(position).getName());
        tvPhone.setText(contacts.get(position).getPhone());
        tvPhone.setText(contacts.get(position).getPhone());

        clHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, tvName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Calling "+tvPhone.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        imgIcon.setImageResource(contacts.get(position).getIcon());

        return view;
    }
}
