package com.example.freelance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
RecyclerView rec;
    public RecAdapter RecAdapter;
    Button button;
    ArrayList<items> items=new ArrayList<items>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        button=findViewById(R.id.buttonn);
        rec=findViewById(R.id.rec) ;


        items.add(new items("أذكار الصباح "));
        items.add(new items("أذكار المساء"));
        items.add(new items("أذكار الأذان "));
        items.add(new items("أذكار الصلاه"));
        items.add(new items("أذكار المسجد"));
        items.add(new items("أذكار بعد الصلاه "));
        items.add(new items("أذكار الوضوء"));
        items.add(new items("أذكار المنزل"));
        items.add(new items("أذكار الطعام"));
        items.add(new items("أذكار النوم"));
        items.add(new items("أذكار الاستيقاظ من النوم"));
        items.add(new items("الادعيه القرأنيه "));
        items.add(new items("أدعيه النبويه "));
        items.add(new items("دعاء ختم القران الكريم"));
        items.add(new items("فضل الدعاء"));
        items.add(new items("الرقيه الشرعيه"));


        rec.setLayoutManager(new LinearLayoutManager(this));
       RecAdapter=new RecAdapter(this,items);
        rec.setAdapter(RecAdapter);

    }



}



