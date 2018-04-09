package com.example.kashishgupta.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.android.volley.RequestQueue;
//import com.android.volley.toolbox.JsonArrayRequest;
//import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belal on 10/18/2017.
 */

public class RestaurantRecycler extends RecyclerView.Adapter<RestaurantRecycler.ProductViewHolder> {



    private Context mCtx;
    private List<Restaurant> restaurantList;

    public RestaurantRecycler(Context mCtx, List<Restaurant> restaurantList) {
        this.mCtx = mCtx;
        this.restaurantList = restaurantList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_restau, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);

        //loading the image
        //Glide.with(mCtx)
        //      .load(restaurant.getImgurl())
        //    .into(holder.imageView);

        holder.textViewTitle.setText(restaurant.getRestname());
        holder.textViewShortDesc.setText(restaurant.getRestlocname());
        holder.textViewRating.setText(restaurant.getRestcityname());
        holder.textViewPrice.setText(String.valueOf(restaurant.getMinorder()));
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewrname);
            textViewShortDesc = itemView.findViewById(R.id.textViewrloc);
            textViewRating = itemView.findViewById(R.id.textViewrcity);
            textViewPrice = itemView.findViewById(R.id.textViewrmin);
            imageView = itemView.findViewById(R.id.imageViewres);
        }
    }
}