package com.rojan.cinema;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ContactUsFragment extends Fragment implements View.OnClickListener{

    Button submit;
    Spinner feedback_spinner;
    String[] feedback_option={"Select","Suggestion","Complain","Compliment","Remark"};

    String selected_feed=feedback_option[0];

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_us, container, false);


        init(view);

       // spinnerFeedback();
        return view;
    }

    private void init(View view){
            submit=(Button)view.findViewById(R.id.submit);
            feedback_spinner= (Spinner)view.findViewById(R.id.feed_spinner);
    }

    @Override
    public void onClick(View view) {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),AddMemberFragment.class);
                startActivity(intent);
            }
        });

        }
    }

//    private void spinnerFeedback() {
//        ArrayAdapter<String> spinnerCategoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, feedback_option);
//        spinnerCategoryAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
//        feedback_spinner.setAdapter(spinnerCategoryAdapter);
//
//        feedback_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                selected_feed = feedback_option[i];
//                Toast.makeText(getContext(), "Selected: " + selected_feed, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//    }



