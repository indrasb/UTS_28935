package umn.ac.id;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button profilbtn, loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        profilbtn = (Button) findViewById(R.id.profilbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        profilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil();
            }
        });
    }

    public void Login() {
        Intent intent = new Intent( MainActivity.this, LoginPage.class);
        startActivity(intent);
    }
    public void Profil() {
        Intent intent = new Intent( MainActivity.this, ProfilPage.class);
        startActivity(intent);
    }
}
