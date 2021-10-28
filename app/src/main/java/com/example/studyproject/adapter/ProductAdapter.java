package com.example.studyproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studyproject.R;
import com.example.studyproject.model.ProductCard;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.CardViewHolder> {

    Context context;
    ProductCard [] cards;

    public ProductAdapter(Context context, ProductCard[] cards) {
        this.context = context;
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardItems = LayoutInflater.from(context).inflate(R.layout.product_card, parent, false);
        return new CardViewHolder(cardItems);
    }


    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.CardViewHolder holder, int position) {
        holder.price.setText(cards[position].getPrice());
        holder.title.setText(cards[position].getTitle());
    }

    @Override
    public int getItemCount() {
        return cards.length;
    }

    public static final class CardViewHolder extends RecyclerView.ViewHolder{

        TextView title, price;

        public CardViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
        }
    }
}
