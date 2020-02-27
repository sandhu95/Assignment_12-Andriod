package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class VoteScreen extends AppCompatActivity {
    Spinner candidate;
    ArrayList<String> candidates;
    ArrayList<String> ids=new ArrayList<String>();
    TextView votername;
    TextView voterid, Can1, Can2, Can3;
    TextView err;
    int cd1=0,cd2=0,cd3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_screen);

        candidate=findViewById(R.id.candidates);
        voterid= findViewById(R.id.id);
        votername= findViewById(R.id.name);
        //candidates = new ArrayList<String>(getResources().getStringArray(R.array.candidates));

        Can1=findViewById(R.id.c1);
        Can2=findViewById(R.id.c2);
        Can3=findViewById(R.id.c3);
        err= findViewById(R.id.err);
    }
    public void commitVote(View view){
        err.setText("");
        String candidate_name;
        if(votername.getText().toString().isEmpty()||voterid.getText().toString().isEmpty())
            err.setText("Enter all necessary details!");
        if(names.contains(votername.getText().toString()) && ids.contains(voterid.getText().toString()))
        err.setText("Sorry, You have already voted!");
        else {
            candidate_name = candidate.getSelectedItem().toString();
            switch (candidate_name) {
                case "Candidate 1": {
                    cd1++;
                    //Can1.setText(cd1);
                }

                case "Candidate 2": {
                    cd2++;
                    //Can2.setText(cd2);
                }
                case "Candidate 3": {
                    cd3++;
                    //Can3.setText(cd3);
                }
            }
        }
    votername.setText("");
    voterid.setText("");

    names.add(votername.getText().toString());
    ids.add(voterid.getText().toString());
    }

}
