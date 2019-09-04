package com.example.prrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    private List<Email> emailList;


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private List<Email> emailList;

        public TextView symbol_email,nama_email,judul_email,isi_email,jam_email;
        public ImageView profile_email,mark;

        public ViewHolder(View v) {
            super(v);
            this.emailList = emailList;
            symbol_email = (TextView)v.findViewById(R.id.symbol_email);
            nama_email = (TextView)v.findViewById(R.id.nama_email);
            judul_email = (TextView)v.findViewById(R.id.judul_email);
            isi_email = (TextView)v.findViewById(R.id.isi_email);
            jam_email = (TextView)v.findViewById(R.id.jam_email);
            profile_email = (ImageView)v.findViewById(R.id.profile_email);
            mark = (ImageView)v.findViewById(R.id.mark);

        }
    }
    public EmailAdapter(List<Email> emailList){

        this.emailList= emailList;

    }
    public EmailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_email,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(EmailAdapter.ViewHolder holder, int position) {
        Email email = emailList.get(position);
        holder.symbol_email.setText(String.valueOf(email.getSymbol_email()));
        holder.nama_email.setText(String.valueOf(email.getNama_email()));
        holder.judul_email.setText(String.valueOf(email.getJudul_email()));
        holder.isi_email.setText(String.valueOf(email.getIsi_email()));
        holder.jam_email.setText(String.valueOf(email.getJam_email()));
        holder.profile_email.setImageResource(email.getProfile_email());
        holder.mark.setImageResource(email.getMark());
    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }


}
