package edu.hawaii.adam359.bucketlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    public static final Gson gson = new GsonBuilder().create();
    public static final String EXTRA_MESSAGE = "edu.hawaii.adam359.bucketlist.MESSAGE";
    public static final String EXTRA_LIST = "edu.hawaii.adam359.bucketlist.LIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText editText = findViewById(R.id.editText);
        editText.setText("");
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void addTask(View view) {
        Log.e(TAG,"addTask");

        final Intent intent = new Intent(this, DisplayListActivity.class);
        EditText editText = findViewById(R.id.editText);
        String task = editText.getText().toString();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://www.superultramegadeathagon.com")
                .build();

        BucketListAPI service = retrofit.create(BucketListAPI.class);
        Call<ServerResponse> call = service.post(task);
        call.enqueue(new Callback<ServerResponse>() {
            @Override
            public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                Log.e(TAG,"Success");
                // start list view activity
                intent.putExtra(EXTRA_LIST, response.body().getData());
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<ServerResponse> call, Throwable t) {
                // handle execution failures like no internet connectivity
                Log.e(TAG,"Failure");
                // error activity or message
            }
        });
    }
}
