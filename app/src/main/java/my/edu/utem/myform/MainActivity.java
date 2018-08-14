package my.edu.utem.myform;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, phoneEditText, cellEditText, messageEditText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.main_nameEditText);
        emailEditText = findViewById(R.id.main_emailEditText);
        phoneEditText = findViewById(R.id.main_phoneEditText);
        cellEditText = findViewById(R.id.main_cellEditText);
        messageEditText = findViewById(R.id.main_messsageEditText);
        sendButton = findViewById(R.id.main_sendButton);

    }

    public void btnPressed(View view) {
        //link to another activity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //send together with extra info

        intent.putExtra("name", nameEditText.getText().toString());
        intent.putExtra("email", emailEditText.getText().toString());
        intent.putExtra("phone", phoneEditText.getText().toString());
        intent.putExtra("cell", cellEditText.getText().toString());
        intent.putExtra("message", messageEditText.getText().toString());
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_about_us:
            {
                //call webactivity page
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
                break;}
            case R.id.menu_contact_us:
            {
                Toast.makeText(MainActivity.this, "The is a simple toast", Toast.LENGTH_LONG).show();
                break;}
            case R.id.menu_share:
            {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setTitle("Are you sure?");
                alertDialogBuilder.setMessage("Are you sure you want to share this app?");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDialogBuilder.show();
                break;}
            case R.id.menu_exit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
