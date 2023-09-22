package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

//    // Array of strings...
//    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
//            "WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry",
//            "WebOS","Ubuntu","Windows7","Max OS X"};
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        webView = findViewById(R.id.wv);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.solutionsplayer.com/services/");

//        ArrayAdapter adapter = new ArrayAdapter<String>(Contact.this, android.R.layout.simple_selectable_list_item,mobileArray);
//        ListView listView = (ListView) findViewById(R.id.listview);
//        listView.setAdapter(adapter);


    }
}