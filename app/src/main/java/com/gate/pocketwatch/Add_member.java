package com.gate.pocketwatch;

/**
 * Created by ddxv on 9/11/2014.
 * from tutorial: http://www.tutorialsbuzz.com/2013/11/android-sqlite-database-with.html
 */



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Add_member extends Activity implements OnClickListener {
    EditText et;
    Button add_bt, read_bt;
    SQLController dbcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_member);
        et = (EditText) findViewById(R.id.member_et_id);
        add_bt = (Button) findViewById(R.id.add_bt_id);

        dbcon = new SQLController(this);
        dbcon.open();
        add_bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.add_bt_id:
                String name = et.getText().toString();
                dbcon.insertData(name);
                Intent main = new Intent(Add_member.this, MembersActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(main);
                break;

            default:
                break;
        }
    }

}
