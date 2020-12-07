package com.example.navtest;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HomeFragmente extends Fragment {
    ListView listview;
    ArrayList<String> myArraylist = new ArrayList<>();
    DatabaseReference mRef;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listview = view.findViewById(R.id.listview);

        mRef = FirebaseDatabase.getInstance().getReference();

        //String[] al = getResources().getStringArray(R.array.distric_name);
        ArrayAdapter<String> aa = new ArrayAdapter<>(getActivity(), R.layout.sampleview, R.id.textviewid, myArraylist);
        listview.setAdapter(aa);
        FragmentManager fragmentManager = getFragmentManager();



        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String value = dataSnapshot.getValue(String.class);
                myArraylist.add(value);
                aa.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                aa.notifyDataSetChanged();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        listview.setOnItemClickListener((parent, view1, position, id) -> {
            /*if (position== 0){
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist1()).commit();
            }
            else if (position == 1){
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist2()).commit();
            }*/

            switch (position){
                case 0:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist1()).commit();
                    break;
                case 1:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist2()).commit();
                    break;
                case 2:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist3()).commit();
                    break;
                case 3:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist4()).commit();
                    break;
                case 4:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist5()).commit();
                    break;
                case 5:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist6()).commit();
                    break;
                case 6:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist7()).commit();
                    break;
                case 7:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist8()).commit();
                    break;
                case 8:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist9()).commit();
                    break;
                case 9:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist10()).commit();
                    break;
                case 10:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist11()).commit();
                    break;
                case 11:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist12()).commit();
                    break;
                case 12:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist13()).commit();
                    break;
                case 13:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist14()).commit();
                    break;
                case 14:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist15()).commit();
                    break;
                case 15:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist16()).commit();
                    break;
                case 16:
                    fragmentManager.beginTransaction().replace(R.id.fagment_container, new Booklist17()).commit();
                    break;


            }

        });


        return view;


    }


}

