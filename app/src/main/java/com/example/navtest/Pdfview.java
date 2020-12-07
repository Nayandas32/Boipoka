package com.example.navtest;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Pdfview extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pdfview, container, false);

        WebView webView = view.findViewById(R.id.web);

        ProgressBar progressBar = view.findViewById(R.id.progressbar);
        progressBar.setVisibility(View.VISIBLE);





        Bundle bundle = this.getArguments();
        String data = bundle.getString("key");



        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(data);
                return true;
            }

        });

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                //getSupportActionBar().setTitle("Loading....");

                super.onProgressChanged(view, newProgress);
                if (newProgress == 100){
                    progressBar.setVisibility(View.GONE);
                   // getSupportActionBar().setTitle(R.string.app_name);

                }
            }
        });
        webView.loadUrl(data);






        return view;
    }
}
