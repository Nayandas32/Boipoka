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

public class Booklist4 extends Fragment {
    ImageView imageView1, imageView2, imageView3, imageView4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.booklist4, container, false);

        imageView1 = view.findViewById(R.id.btn41);
        imageView2 = view.findViewById(R.id.btn42);
        imageView3 = view.findViewById(R.id.btn43);
        imageView4 = view.findViewById(R.id.btn44);
        imageView1.setClickable(true);
        imageView2.setClickable(true);
        imageView3.setClickable(true);
        imageView4.setClickable(true);

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
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key","https://drive.google.com/file/d/13HJkdoJUJuGJ_1RgiLwdmmdktq9pp6Qw/view?usp=sharing/view");
                Pdfview pdfview=new Pdfview();
                pdfview.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fagment_container,pdfview).addToBackStack(null).commit();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
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
