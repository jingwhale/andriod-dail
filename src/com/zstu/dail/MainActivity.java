package com.zstu.dail;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     
        setContentView(R.layout.activity_main);

        Button bt_dail = (Button) this.findViewById(R.id.bt_dail);
        bt_dail.setOnClickListener(new MyLisener());
    }
    private class MyLisener implements OnClickListener{

		@Override
		public void onClick(View v) {
			EditText et_numberEditText = (EditText) MainActivity.this.findViewById(R.id.et_number);
			String numberString = et_numberEditText.getText().toString().trim();
			if(TextUtils.isEmpty(numberString)){
				Toast.makeText(MainActivity.this, "The phone numbers can not be empty!", Toast.LENGTH_SHORT).show();
				return;
			}
			
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_CALL);

			intent.setData(Uri.parse("tel:"+numberString));
			startActivity(intent);
		}
    }
}
