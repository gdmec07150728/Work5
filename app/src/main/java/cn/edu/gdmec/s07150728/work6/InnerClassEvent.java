package cn.edu.gdmec.s07150728.work6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InnerClassEvent extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button3);
        button.setText("单击");
        button.setOnClickListener(new OuterClass());
    }
    class OuterClass implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(InnerClassEvent.this, "已单击我(3)...", Toast.LENGTH_SHORT).show();
            System.out.println("已单击我(3)...");
        }
    }
}
