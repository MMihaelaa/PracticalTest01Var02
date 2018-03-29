package practicaltest01var02.eim.systems.cs.pub.ro.practicaltest01var02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);

        if(savedInstanceState!=null){
            EditText in1 = in1= (EditText)findViewById(R.id.editText3);
            in1.setText(savedInstanceState.toString());
        }

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText input1Edit = input1Edit   = (EditText)findViewById(R.id.editText3);
                EditText input2Edit = input2Edit   = (EditText)findViewById(R.id.textView2);
                String i1 =  input1Edit.getText().toString();
                String i2 =  input2Edit.getText().toString();

                TextView result = (TextView)findViewById(R.id.textView);
                Integer res = Integer.parseInt(i1) + Integer.parseInt(i2) ;
                result.setText(res.toString());

            }
        });

            btnMinus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    EditText input1Edit = input1Edit   = (EditText)findViewById(R.id.editText3);
                    EditText input2Edit = input2Edit   = (EditText)findViewById(R.id.textView2);
                    String i11 =  input1Edit.getText().toString();
                    String i22 =  input2Edit.getText().toString();

                    TextView result = (TextView)findViewById(R.id.textView);
                    Integer res2 = Integer.parseInt(i11) - Integer.parseInt(i22) ;
                    result.setText(res2.toString());

                }
            });





    }


    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        EditText input1Edit = input1Edit   = (EditText)findViewById(R.id.editText3);
        EditText input2Edit = input2Edit   = (EditText)findViewById(R.id.textView2);
        String i1 =  input1Edit.getText().toString();
        String i2 =  input2Edit.getText().toString();

        savedInstanceState.putString("input1", i1);
        savedInstanceState.putString("input2", i2);
        // etc.
    }
}
