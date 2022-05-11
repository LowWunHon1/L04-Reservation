package sg.edu.rp.c346.id21012050.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText mobileNo;
    DatePicker dp;
    TimePicker tp;
    EditText size;
    RadioGroup options;
    Button confirm;
    Button reset;
    TextView nameDisplay;
    TextView mobileNoDisplay;
    TextView dateDisplay;
    TextView sizeDisplay;
    TextView timeDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName2);
        mobileNo = findViewById(R.id.editTextTextPersonName3);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        size = findViewById(R.id.editTextTextPersonName4);
        options = findViewById(R.id.chooseAnOption);
        confirm = findViewById(R.id.buttonConfirm);
        reset = findViewById(R.id.buttonReset);
        nameDisplay = findViewById(R.id.Name);
        mobileNoDisplay = findViewById(R.id.mobileNumber);
        dateDisplay = findViewById(R.id.Date);
        sizeDisplay = findViewById(R.id.groupSize);
        timeDisplay = findViewById(R.id.Time);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int d = dp.getDayOfMonth();
                int m = dp.getMonth();
                int y = dp.getYear();

                int h = tp.getCurrentHour();
                int m2 = tp.getCurrentMinute();

                String name2 = name.getText().toString();
                int number = mobileNo.getId();
                int s = size.getId();


                String message1 = "Name: " + name2;
                String message2 = "Mobile No: " + number;
                String message3 = "Date: " + d + "/" + m + "/" + y;
                String message4 = "Size of group: " + s;

                if (m2 < 10) {
                    String message5 = "Time: " + h + ":0" + m2;
                    timeDisplay.setText(message5);
                } else {
                    String message5 = "Time: " + h + ":" + m2;
                    timeDisplay.setText(message5);
                }


                nameDisplay.setText(message1);
                mobileNoDisplay.setText(message2);
                dateDisplay.setText(message3);
                sizeDisplay.setText(message4);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2020,5,1);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
            }
        });
    }
}