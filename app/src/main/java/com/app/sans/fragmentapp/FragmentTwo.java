package com.app.sans.fragmentapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentTwo extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
    View view= inflater.inflate(R.layout.fragment_two, container,
        false);
    TextView name=view.findViewById(R.id.tv_name_val);
    TextView email=view.findViewById(R.id.tv_email_val);
    Bundle bundle=getArguments();
    if (bundle !=null){
        if(bundle.containsKey("name")){
        name.setText("name:" + bundle.getString("name"));
        }
        if(bundle.containsKey("email")){
        email.setText("email:" + bundle.getString("email"));
        }
        }
        return view;
}
}