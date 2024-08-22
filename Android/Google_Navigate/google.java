package com.example.google_nav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class google extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        web=(WebView) findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.google.com");
        WebSettings w= web.getSettings();
        w.setJavaScriptEnabled(true);
    }
}