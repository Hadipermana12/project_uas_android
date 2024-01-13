package com.hadikomik.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.hadikomik.R;
import com.hadikomik.sinopsis.sinopsis_dillan;
import com.hadikomik.sinopsis.sinopsis_dki;
import com.hadikomik.sinopsis.sinopsis_msb;
import com.hadikomik.sinopsis.sinopsis_ws;

public class Tab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        ImageView imageView = view.findViewById(R.id.ws);
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getActivity(), sinopsis_ws.class );
                startActivity( intent );
            }
        });

        ImageView imageView2 = view.findViewById(R.id.dillan);
        imageView2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getActivity(), sinopsis_dillan.class );
                startActivity( intent );
            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}