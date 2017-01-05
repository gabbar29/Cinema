package com.rojan.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DELL PC on 12/28/2016.
 */
public class GuideFragment extends Fragment implements View.OnClickListener{

    Button register;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.login_form,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        register= (Button) getActivity().findViewById(R.id.registerBtn);

    }


    @Override
    public void onClick(View v) {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getContext(),AddMemberFragment.class);
//                startActivity(intent);

                Toast.makeText(getContext(),"rojan",Toast.LENGTH_LONG).show();
            }
        });
    }
}
