package ro.pub.cs.systems.eim.practicaltest01var04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PracticalTest01Var04MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_main);

        final Button button = (Button) findViewById(R.id.display_button);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Displaying info!", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.activity_practical_test01_var04_main);

                TextView tv1 = (TextView)findViewById(R.id.text_info);
                tv1.setText("Sergiu Constantinescu 343C4");
            }
        });
    }
}