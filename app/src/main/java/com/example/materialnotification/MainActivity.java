package com.example.materialnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * By Usman Siddiqui
 * Skype username : usmaan.siddiquii1
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RelativeLayout rlmain;
    Button example1, example2, example3, example4, example5, example6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        example1 = (Button) findViewById(R.id.example1);
        example2 = (Button) findViewById(R.id.example2);
        example3 = (Button) findViewById(R.id.example3);
        example4 = (Button) findViewById(R.id.example4);
        example5 = (Button) findViewById(R.id.example5);
        example6 = (Button) findViewById(R.id.example6);
        rlmain = (RelativeLayout) findViewById(R.id.rlmain);
        example1.setOnClickListener(this);
        example2.setOnClickListener(this);
        example3.setOnClickListener(this);
        example4.setOnClickListener(this);
        example5.setOnClickListener(this);
        example6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.example1:
                MaterialNotification.init(MainActivity.this, "Undo this action?", rlmain,
                        MaterialNotification.WarningStyle.SIMPLE)
                        .setActionText("UNDO")
                        .setWarningBoxBgColor("#a64dff")
                        .setWarningTappedColor("#b366ff")
                        .setWarningBoxPosition(MaterialNotification.WarningPos.BOTTOM)
                        .setWarningBoxRadius(80, 80, 80, 80)
                        .setWarningBoxMargins(15, 15, 15, 10)
                        .setAnimation(MaterialNotification.RevealAnim.SLIDE_UP, MaterialNotification.DismissAnim.BACK_TO_BOTTOM, 400, 400)
                        .setAutoDismiss(true,5000)
                        .show();
                break;

            case R.id.example2:
                MaterialNotification.init(MainActivity.this, "Download completed.", rlmain,
                        MaterialNotification.WarningStyle.ACTION)
                        .setActionText("OPEN")
                        .setWarningBoxBgColor("#ff5c33")
                        .setWarningTappedColor("#ff704d")
                        .setWarningBoxPosition(MaterialNotification.WarningPos.BOTTOM)
                        .setAnimation(MaterialNotification.RevealAnim.FADE_IN, MaterialNotification.DismissAnim.BACK_TO_BOTTOM, 400, 400)
                        .setAutoDismiss(true,1500)
                        .show();
                break;

            case R.id.example3:
                MaterialNotification.init(MainActivity.this, "No internet connection!", rlmain,
                        MaterialNotification.WarningStyle.SIMPLE)
                        .setWarningBoxPosition(MaterialNotification.WarningPos.TOP)
                        .setAnimation(MaterialNotification.RevealAnim.SLIDE_DOWN, MaterialNotification.DismissAnim.BACK_TO_TOP, 400, 400)
                        .setWarningInset(0, 0, 0, 0)
                        .setWarningBoxRadius(0, 0, 0, 0)
                        .setAutoDismiss(true,1500)
                        .show();
                break;

            case R.id.example4:
                MaterialNotification.init(MainActivity.this, "No internet connection!", rlmain,
                        MaterialNotification.WarningStyle.SIMPLE)
                        .setAnimation(MaterialNotification.RevealAnim.SLIDE_UP, MaterialNotification.DismissAnim.BACK_TO_BOTTOM, 400, 400)
                        .setWarningInset(0, 0, 0, 0)
                        .setWarningBoxRadius(0, 0, 0, 0)
                        .setAutoDismiss(true,1500)
                        .show();
                break;

            case R.id.example5:
                MaterialNotification.init(MainActivity.this, "You have 1 new message!", rlmain,
                        MaterialNotification.WarningStyle.ACTION)
                        .setActionText("READ")
                        .setWarningBoxBgColor("#66b3ff")
                        .setWarningTappedColor("#80bfff")
                        .setWarningBoxPosition(MaterialNotification.WarningPos.TOP)
                        .setWarningInset(0, 0, 0, 0)
                        .setWarningBoxRadius(0, 0, 0, 0)
                        .setAnimation(MaterialNotification.RevealAnim.SLIDE_DOWN, MaterialNotification.DismissAnim.BACK_TO_TOP, 400, 400)
                        .setAutoDismiss(true,1500)
                        .show();
                break;

            case R.id.example6:
                MaterialNotification.init(MainActivity.this, "Undo this action?", rlmain,
                        MaterialNotification.WarningStyle.ACTION)
                        .setActionText("UNDO")
                        .setWarningBoxBgColor("#9999ff")
                        .setWarningTappedColor("#b3b3ff")
                        .setWarningBoxPosition(MaterialNotification.WarningPos.TOP)
                        .setWarningBoxRadius(0, 0, 25, 25)
                        .setWarningBoxMargins(25, -5, 25, 0)
                        .setAnimation(MaterialNotification.RevealAnim.SLIDE_DOWN, MaterialNotification.DismissAnim.BACK_TO_TOP, 400, 400)
                        .setAutoDismiss(true,1500)
                        .show();
                break;
        }

    }
}
