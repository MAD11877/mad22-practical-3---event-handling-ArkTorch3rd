package sg.edu.np.mad22.p02.practicalapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView susImage = findViewById(R.id.SusImage);
        susImage.setOnClickListener(view1 -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Profile").setMessage("MADness")
                    .setPositiveButton("View", (dialogInterface, i) -> {
                        Intent activityMain = new Intent(this, MainActivity.class);
                        activityMain.putExtra("randomNumber", String.valueOf((new Random()).nextInt(Integer.MAX_VALUE)));
                        startActivity(activityMain);
                    })
                    .setNegativeButton("Close", (dialogInterface, i) -> {
                    });
            AlertDialog alert = builder.create();
            alert.show();
        });
    }
}