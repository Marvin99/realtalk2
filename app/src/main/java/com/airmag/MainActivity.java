package com.airmag;


import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] magazines = {"GQ", "Maxim", "Forbes", "Maybeline", "Playboy"};
        ListAdapter magazinesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, magazines);
        ListView magazinesListView = (ListView) findViewById(R.id.magazinesListView);
        magazinesListView.setAdapter(magazinesAdapter);

        magazinesListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                    }
                }
        );
    }
}
