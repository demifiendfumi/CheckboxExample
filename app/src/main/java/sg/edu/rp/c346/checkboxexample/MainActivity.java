package sg.edu.rp.c346.checkboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = (CheckBox)findViewById(R.id.checkBoxDiscount);
        btnCheck = (Button)findViewById(R.id.buttonCheck);
        tvShow = (TextView) findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if (cbEnabled.isChecked()) {
                Toast toast = Toast.makeText(getApplicationContext(), "Button Click", Toast.LENGTH_LONG);
                toast.show();
                tvShow.setText("The discount is given");
                }
                else{
                Toast toast = Toast.makeText(getApplicationContext(), "Button Click", Toast.LENGTH_LONG);
                toast.show();
                tvShow.setText("The discount is not given");
                }
            }

        });

    }
}
