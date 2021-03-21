package umn.ac.id;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText loginText, passwordText;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginText = (EditText) findViewById(R.id.login);
        passwordText= (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();
                if(username.equals("uasmobile") && (password.equals("uasmobilegenap")))
                {
                    Toast.makeText(LoginPage.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),Daftar_lagu.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(LoginPage.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            } });
    }}