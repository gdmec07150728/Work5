package cn.edu.gdmec.s07150728.work6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setText("单击");
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "已单击我...", Toast.LENGTH_SHORT).show();
        System.out.println("已单击我...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
