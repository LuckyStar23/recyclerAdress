package com.example.recycleradress;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class addressViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAddress;

    public addressViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAddress = itemView.findViewById(R.id.address);
    }

    public void bind(String address) {
        tvAddress.setText(address);
    }
}
