package com.example.prrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Email> emailList;
    private EmailAdapter emailAdapter;

    String[] symbol_email ={"S","F","G","T","P","J"};

    String[] nama_email ={"Sam","Facebook","Google+","Twitter", "Pinterest Weekly","Josh"};

    String[] judul_email = {"aowkaokwo","aaaaaaaaaa","bbbbbbbbb","ccccccccccc","ddddddddd","eeeeeeeee"};

    String[] isi_email = {"aowkaokwo","aaaaaaaaaa","bbbbbbbbb","ccccccccccc","ddddddddd","eeeeeeeee"};

    String[] jam_email = {"10:00 AM","10:01 AM","10:02 AM","10:03 AM","10:04 AM","10:05 AM"};

    int[] profile_email = {
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable,
            R.drawable.rounded_drawable
    };
    int[] mark={
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_black_24dp,
            R.drawable.ic_star_black_24dp,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        if (mRecyclerView != null){
            mRecyclerView.setHasFixedSize(true);
        }
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        emailList = new ArrayList<>();

        for (int i = 0; i < nama_email.length;i++){
            Email email = new Email(nama_email[i],symbol_email[i], judul_email[i],isi_email[i],jam_email[i],profile_email[i],mark[i]);
            emailList.add(email);
        }
        emailAdapter= new EmailAdapter(emailList);

        mRecyclerView.setAdapter(emailAdapter);
        emailAdapter.notifyDataSetChanged();

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {


            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this,"Card At " + position + " Is Clicked", Toast.LENGTH_SHORT).show();
            }
        }));

    }
}
