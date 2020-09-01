package com.example.freecodecamp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtSurname = findViewById(R.id.edtTxtSurname);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        String name = edtTxtName.getText().toString();
        String surname = edtTxtSurname.getText().toString();
        String email = edtTxtEmail.getText().toString();

        TextView txtName = findViewById(R.id.txtName);
        TextView txtSurname = findViewById(R.id.txtSurname);
        TextView txtEmail = findViewById(R.id.txtEmail);

        txtName.setText("First Name: " + name);
        txtSurname.setText("Last Name: " + surname);
        txtEmail.setText("Email " + email);
    }
}