package com.hadikomik.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.hadikomik.R;
import com.hadikomik.sinopsis.sinopsis_cz;
import com.hadikomik.sinopsis.sinopsis_tr;

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_tab1, container, false );

        ImageView imageView = view.findViewById( R.id.cz );
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getActivity(), sinopsis_cz.class );
                startActivity( intent );
            }
        });

        ImageView imageView2 = view.findViewById(R.id.tr);
        imageView2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getActivity(), sinopsis_tr.class );
                startActivity( intent );
            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}