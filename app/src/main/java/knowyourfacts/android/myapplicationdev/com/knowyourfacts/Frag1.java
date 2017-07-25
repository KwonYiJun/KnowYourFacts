package knowyourfacts.android.myapplicationdev.com.knowyourfacts;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static android.R.attr.fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    Button btnChange;
    TextView tv;
    ViewPager vPager;


    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_1, container, false);
        btnChange = (Button)v.findViewById(R. id. btnChange);
        tv = (TextView)v.findViewById(R. id.textView);
        vPager = (ViewPager)v.findViewById(R.id.viewpager1);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                v.setBackgroundColor(color);
            }
        });

        return v;
    }

}
