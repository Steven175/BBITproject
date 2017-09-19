package strathmore.bbit.com.bbitbproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitySignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button button = (Button) findViewById(R.id.button);
        EditText txtFname = (EditText) findViewById(R.id.text);
        EditText txtLname = (EditText) findViewById(R.id.text);
        EditText txtEmail = (EditText) findViewById(R.id.text);
        EditText txtPhone = (EditText) findViewById(R.id.text);
        EditText txtPassword = (EditText) findViewById(R.id.text);

//        button.setOnClickListener(new View.



    }

}

