package com.example.navtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Booklist10 extends Fragment {
    ImageView imageView1, imageView2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.booklist10, container, false);
        imageView1 = view.findViewById(R.id.btn1);
        imageView2 = view.findViewById(R.id.btn2);

        imageView1.setClickable(true);
        imageView2.setClickable(true);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key","https://drive.google.com/file/d/13HJkdoJUJuGJ_1RgiLwdmmdktq9pp6Qw/view?usp=sharing/view");
                Pdfview pdfview=new Pdfview();
                pdfview.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fagment_container,pdfview).addToBackStack(null).commit();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key","https://drive.google.com/file/d/13HJkdoJUJuGJ_1RgiLwdmmdktq9pp6Qw/view?usp=sharing/view");
                Pdfview pdfview=new Pdfview();
                pdfview.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fagment_container,pdfview).addToBackStack(null).commit();
            }
        });



        return view;
    }
}
