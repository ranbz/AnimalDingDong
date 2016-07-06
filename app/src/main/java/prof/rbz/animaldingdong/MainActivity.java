package prof.rbz.animaldingdong;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("AnimalDingDong");

        setContentView(R.layout.activity_main);

        ImageView cow=(ImageView) findViewById(R.id.cow);
        ImageView chican=(ImageView) findViewById(R.id.chican);
        ImageView dog=(ImageView) findViewById(R.id.dog);
        ImageView cat=(ImageView) findViewById(R.id.cat);

        cow.setOnClickListener(this);
        chican.setOnClickListener(this);
        dog.setOnClickListener(this);
        cat.setOnClickListener(this);

        cow.setRotation(-45);
        chican.setRotation(-45);
        dog.setRotation(45);
        cat.setRotation(45);
    }

    @Override
    public void onClick(View v) {

        Intent IttCaw=  new Intent(this, CawActivity.class);
        Intent IttChican=  new Intent(this, ChicanActivity.class);
        Intent IttDog=  new Intent(this, DogActivity.class);
        Intent IttCat=  new Intent(this, CatActivity.class);



        switch (v.getId())
        {
            case R.id.cow:
                startActivity(IttCaw);
                break;

            case R.id.chican:
                startActivity(IttChican);
                break;

            case R.id.dog:
                startActivity(IttDog);
                break;

            case R.id.cat:
                startActivity(IttCat);
                break;


        }


    }
}
