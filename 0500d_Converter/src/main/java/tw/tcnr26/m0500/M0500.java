package tw.tcnr26.m0500;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {
    private EditText e001;
    private Button b001;
    private TextView t003;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.m0500);
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
//        設定Layout配置
//        選擇Creat local varible是設為區域變數，選擇Creat field是設為全域變數
        e001 = (EditText) findViewById(R.id.m0500_e001);  //輸入欄位的變數名稱
        b001 = (Button) findViewById(R.id.m0500_b001); //按鈕的變數名稱
        t003 = (TextView) findViewById(R.id.m0500_t003); //輸出欄位(磅)的變數名稱

        b001.setOnClickListener(b001ON);  //設定按鈕監聽
    }

    private View.OnClickListener b001ON = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat pondsFormat = new DecimalFormat("0.0000"); //宣告pondsFormat的格式為0.0000

            //String ponds = pondsFormat.format(Double.parseDouble(e001.getText().toString())   *  2.20462262);
            String ponds = pondsFormat.format(Double.parseDouble(e001.getText().toString()) * 2.20462262);
            //將e001的值取得，轉成String，和2.20462262相乘，format會轉成字串再設定給 ponds

            t003.setText(ponds);
        }
    }; //設定method時記得後大括要加分號

}
