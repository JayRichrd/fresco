package com.facebook.fresco.samples.showcase;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    SimpleDraweeView webp1;
    SimpleDraweeView webp2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webp1 = findViewById(R.id.sdv_webP);
        webp2 = findViewById(R.id.sdv_webP1);
        button1 = findViewById(R.id.btn_load_other_image);
        button1.setOnClickListener(this);
        Uri uri = Uri.parse("res://com.facebook.samples.mydemo/" + R.drawable.toutiao_is_live);
        AbstractDraweeController abstractDraweeController = Fresco.newDraweeControllerBuilder().setUri(uri).setAutoPlayAnimations(true).build();
        webp1.setController(abstractDraweeController);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_load_other_image:
                loadOtherWebp();
        }
    }

    private void loadOtherWebp() {
        Uri uri = Uri.parse("res://com.facebook.samples.mydemo/" + R.drawable.toutiao_is_live);
        AbstractDraweeController abstractDraweeController = Fresco.newDraweeControllerBuilder().setUri(uri).setAutoPlayAnimations(true).build();
        webp2.setController(abstractDraweeController);
    }
}
