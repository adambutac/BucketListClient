package edu.hawaii.adam359.bucketlist;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DisplayListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String data = intent.getStringExtra(MainActivity.EXTRA_LIST);
        Task[] list = MainActivity.gson.fromJson(data, Task[].class);
        setListAdapter(new ArrayAdapter<Task>(this, R.layout.list_text, list));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
    }
}
