package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tutlane.listview.CustomListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.user_list);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem user = (ListItem) lv.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Selected :" + " " + user.getName()+", "+ user.getLocation(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<>();

        ListItem user1 = new ListItem();
        user1.setName("başlık 1");
        user1.setDesignation("Team Leader");
        user1.setLocation("Hyderabad");
        results.add(user1);

        ListItem user2 = new ListItem();
        user2.setName("Rohini Alavala");
        user2.setDesignation("Agricultural Officer");
        user2.setLocation("Guntur2");
        results.add(user2);

        ListItem user3 = new ListItem();
        user3.setName("Trishika Dasari");
        user3.setDesignation("Charted Accountant");
        user3.setLocation("Guntur3");
        results.add(user3);

        ListItem user4 = new ListItem();
        user4.setName("Trishika Dasari");
        user4.setDesignation("Charted Accountant");
        user4.setLocation("Guntur4");
        results.add(user4);

        ListItem user5 = new ListItem();
        user5.setName("Trishika Dasari");
        user5.setDesignation("Charted Accountant");
        user5.setLocation("Guntur5");
        results.add(user5);
        return results;
    }




    }
