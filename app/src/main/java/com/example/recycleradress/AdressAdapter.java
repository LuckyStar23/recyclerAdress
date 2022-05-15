package com.example.recycleradress;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter<addressViewHolder> {
    private ArrayList<String> address = new ArrayList<>();
    public AdressAdapter(ArrayList<String> names) {this.address = names;}
    @NonNull
    @Override
    public addressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new addressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull addressViewHolder holder, int position) {
        holder.bind(address.get(position));
    }

    @Override
    public int getItemCount() {
        return address.size();
    }
}
