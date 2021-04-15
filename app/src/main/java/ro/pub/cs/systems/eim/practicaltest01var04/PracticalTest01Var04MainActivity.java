package ro.pub.cs.systems.eim.practicaltest01var04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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
                EditText editText_name = findViewById(R.id.edit_text_name);
                EditText editText_group = findViewById(R.id.edit_text_group);
                CheckBox check_name =  (CheckBox) findViewById(R.id.checkbox_name);
                CheckBox check_group =  (CheckBox) findViewById(R.id.checkbox_group);
                String group = editText_group.getText().toString();
                String name = editText_name.getText().toString();

                if(!check_name.isChecked()) {
                    name = "";
                }

                if(!check_group.isChecked()) {
                    group = "";
                }

                setContentView(R.layout.activity_practical_test01_var04_main);

                TextView tv1 = (TextView)findViewById(R.id.text_info);
                tv1.setText(name + " "  + group);
            }
        });
    }
}