package knowyourfacts.android.myapplicationdev.com.knowyourfacts;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {

    ImageView iv;

    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_3, container, false);

        iv = (ImageView) view.findViewById(R.id.iv);

        String imageUrl = "http://68.media.tumblr.com/a6b0820f56b410b82c5fd35f60fc62e7/tumblr_otmkkt2q2v1roqv59o1_500.png";
        Picasso.with(getActivity()).load(imageUrl).into(iv);

        return view;
    }

}
