package kuhdeenhike.borderdefense;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

public class TitleScreen extends AppCompatActivity implements View.OnTouchListener, CompoundButton.OnCheckedChangeListener, MediaPlayer.OnCompletionListener, View.OnClickListener {

    ImageView reticle;
    ViewGroup mainLayout;
    Switch zoomSwitch;
    MediaPlayer mp;
    MediaPlayer reload;
    TextView ammoText;
    ImageView sniperSelect;
    ImageView machineGunSelect;

    int xDelta;
    int yDelta;
    int realAmmo = 10;
    String gun = "sniper";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        mainLayout = findViewById(R.id.main);

        reticle = findViewById(R.id.reticle);
        reticle.setOnTouchListener(this);

        zoomSwitch = findViewById(R.id.zoomSwitch);
        zoomSwitch.setOnCheckedChangeListener(this);
        zoomSwitch.setChecked(true);

        mp = MediaPlayer.create(this, R.raw.gunshot);
        mp.setOnCompletionListener(this);

        reload = MediaPlayer.create(this, R.raw.reload);
        reload.setOnCompletionListener(this);

        ammoText = findViewById(R.id.ammo);

        sniperSelect = findViewById(R.id.snoiper);
        sniperSelect.setOnClickListener(this);

        machineGunSelect = findViewById(R.id.mp5);
        machineGunSelect.setOnClickListener(this);

    }

    public boolean onTouch(View view, MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();

        if(reticle.getVisibility() == View.VISIBLE)
        {
            mp.start();
        }

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams)
                        view.getLayoutParams();

                xDelta = x - lParams.leftMargin;
                yDelta = y - lParams.topMargin;
                break;

            case MotionEvent.ACTION_UP:
                break;

            case MotionEvent.ACTION_MOVE:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                        .getLayoutParams();
                layoutParams.leftMargin = x - xDelta;
                layoutParams.topMargin = y - yDelta;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                view.setLayoutParams(layoutParams);
                break;
        }
        mainLayout.invalidate();
        return true;
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            reticle.setVisibility(View.VISIBLE);
        } else {
            reticle.setVisibility(View.INVISIBLE);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {

        if (mediaPlayer.equals(mp))
        {
            realAmmo--;
            Log.i("test", String.valueOf(realAmmo));
            if (reticle.getVisibility() == View.VISIBLE)
            {
                ammoText.setText("Ammo: " + realAmmo);
            }
            else
            {
                ammoText.setText("");
            }

            if (realAmmo <= 0)
            {
                realAmmo = 0;
                reticle.setVisibility(View.INVISIBLE);
                reload.start();
            }
        }
        else if (mediaPlayer.equals(reload))
        {
            realAmmo = 11;
            reticle.setVisibility(View.VISIBLE);
        }
        else if (mediaPlayer.equals(reload))
        {
            realAmmo = 31;
            reticle.setVisibility(View.VISIBLE);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.snoiper) {
            sniperSelect.setBackgroundColor(0xFF0000);
            mp = MediaPlayer.create(this, R.raw.gunshot);
            realAmmo = 11;
        }
        else if (view.getId() == R.id.mp5)
        {
            machineGunSelect.setBackgroundColor(0xFF0000);
            mp = MediaPlayer.create(this, R.raw.mp5shot);
            realAmmo = 31;
        }
    }
}
