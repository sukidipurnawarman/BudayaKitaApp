package com.example.budkitapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;


/**
 * A simple {@link Fragment} subclass.
 */
public class Setting extends Fragment {
private TextView Privacy,Sugession,LkFacebook,AppVer,LkTwitter,Logout;
    private FirebaseAuth mAuth;

    public Setting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        // Inflate the layout for this fragment
        mAuth = FirebaseAuth.getInstance();
        Privacy =(TextView) view.findViewById(R.id.TvPrivacy);
        Sugession =(TextView) view.findViewById(R.id.TvSugession);
        LkFacebook =(TextView) view.findViewById(R.id.TvLkFacebook);
        AppVer =(TextView) view.findViewById(R.id.TvAppVer);
        LkTwitter =(TextView) view.findViewById(R.id.TvLkTwitter);
        Logout =(TextView) view.findViewById(R.id.TvLogOut);


        Privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Privacy
            }
        });
        Privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Privacy
            }
        });
        Sugession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Privacy
            }
        });
        LkFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Facebook Profile "fb://profile/"
                // Facebook Page "
                    try {
                        getActivity().getPackageManager().getPackageInfo("com.facebook.katana", 0);
                        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/atta.halilintar.90281"));
                        startActivity(facebook);
                    } catch (Exception e) {
                        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/atta.halilintar.90281"));
                        startActivity(facebook);
                    }
                }

        });
        LkTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // get the Twitter app if possible
                    getActivity().getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=attahalilintar"));
                    twitter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(twitter);
                } catch (Exception e) {
                    // no Twitter app, revert to browser
                    Intent twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/attahalilintar"));
                    startActivity(twitter);
                }

            }
        });
        AppVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Privacy
            }
        });
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent lanjut = new Intent(getActivity(), Login.class);
                startActivity(lanjut);
                getActivity().finish();
            }
        });
        return view;
    }

}
