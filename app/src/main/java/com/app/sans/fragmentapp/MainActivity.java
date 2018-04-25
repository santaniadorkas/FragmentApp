package com.app.sans.fragmentapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name_obj;
EditText email_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_frag_two=(Button)findViewById(R.id.btn_frag2);
        name_obj=(EditText)findViewById(R.id.txt_name);
        email_obj=(EditText)findViewById(R.id.txt_email);

        btn_frag_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==findViewById(R.id.btn_frag2)){
                    Fragment fragment=new Fragment();
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    Bundle bundle=new Bundle();
                    bundle.putString("name",String.valueOf((name_obj.getText())));
                    bundle.putString("email",String.valueOf(email_obj.getText()));
                    fragment.setArguments(bundle);
                    ft.replace(R.id.fragment_place,fragment);
                    ft.commit();
                }
            }
        });
    }
}
