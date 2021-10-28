package com.example.studyproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.studyproject.adapter.ProductAdapter;
import com.example.studyproject.model.ProductCard;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ProductAdapter adapter;

    private void setCardRecycler(ProductCard[] cards) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL,
                false
        );
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(layoutManager);

        adapter = new ProductAdapter(this, cards);
        recycler.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProductCard[] cards = {
                new ProductCard("Поликлиника 1", "30 000"),
                new ProductCard("Поликлиника 2", "25 000"),
                new ProductCard("Поликлиника 2", "25 000"),
                new ProductCard("Поликлиника 2", "25 000"),
        };

        setCardRecycler(cards);
    }

}