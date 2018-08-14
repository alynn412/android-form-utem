package my.edu.utem.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView emailTextView;
    TextView phoneTextView;
    TextView cellTextView;
    TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        nameTextView = findViewById(R.id.second_nameTextView);
        emailTextView = findViewById(R.id.second_emailTextView);
        phoneTextView = findViewById(R.id.second_phoneTextView);
        cellTextView = findViewById(R.id.second_cellTextView);
        messageTextView = findViewById(R.id.second_messageTextView);

        //define object to get data
        Intent intent = getIntent();
        //get value from previous activity
        String name = intent.getStringExtra("name");
        nameTextView.setText(name);
        String email = intent.getStringExtra("email");
        emailTextView.setText(email);
        String phone = intent.getStringExtra("phone");
        phoneTextView.setText(phone);
        String cell = intent.getStringExtra("cell");
        cellTextView.setText(cell);
        String message = intent.getStringExtra("message");
        //messageTextView.setText(message);
        messageTextView.setText("my name is " +name+ ". You can send me the file at " +email+ ". You can contact me either " +phone+ " or " +cell+ ".");

    }
}
