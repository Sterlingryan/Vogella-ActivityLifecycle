package activity.lifecycle.android.vogella.com.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] values = getResources().getStringArray(R.array.operating_systems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, values);
        spinner.setAdapter(adapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, TracerActivity.class);
        startActivity(intent);
    }
}
