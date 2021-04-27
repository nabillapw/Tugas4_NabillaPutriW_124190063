package com.example.tugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FilmModel> filmModels;

    public FilmAdapter(ArrayList<FilmModel> listData, Context context) {
        this.context = context;
    }

    public ArrayList<FilmModel> getFilmModels() {
        return filmModels;
    }

    public void setFilmModels(ArrayList<FilmModel> filmModels) {
        this.filmModels = filmModels;
    }

    @NonNull
    @Override
    public FilmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getFilmModels().get(position).getGambarFilm()).into(holder.gambar);
        holder.text.setText(getFilmModels().get(position).getJudulFilm());
    }

    @Override
    public int getItemCount() {
        return getFilmModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);
        }
    }
}