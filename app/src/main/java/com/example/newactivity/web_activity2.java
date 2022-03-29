package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web_activity2 extends AppCompatActivity {
    private WebView webView2;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        webView2 = (WebView)findViewById(R.id.webview2);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        webView2.loadUrl("https://en.wikipedia.org/wiki/Iron_Man");

    }
}