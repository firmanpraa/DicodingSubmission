package com.example.submission_dicoding;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class productAdapter extends RecyclerView.Adapter<productAdapter.productViewHolder> {

    private ArrayList<Product> listProduct;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private Context context;

    public productAdapter(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_product, viewGroup, false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final productViewHolder holder, int position) {

        final Product pd = listProduct.get(position);

        Glide.with(holder.itemView.getContext())
                .load(pd.getPhoto())
                .override(400, 800)
                .fitCenter()
                .into(holder.imgPhoto);

        holder.tvName.setText(pd.getName());
        holder.tvPrice.setText(pd.getPrice());
        holder.tvDetail.setText(pd.getDetail());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Open details of " + listProduct.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent moveIntent = new Intent(v.getContext(), DetailActivity.class);
                moveIntent.putExtra("img_item_photo",pd.getPhoto());
                moveIntent.putExtra("tv_item_name",pd.getName());
                moveIntent.putExtra("tv_Price",pd.getPrice());
                moveIntent.putExtra("tv_item_detail",pd.getDetail());
                v.getContext().startActivity(moveIntent);

            }
        });

        holder.btnBuy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail,tvPrice;
        Button btnDetail, btnBuy;

        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_Price);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnDetail = itemView.findViewById(R.id.btn_details);
            btnBuy = itemView.findViewById(R.id.btn_buy);
        }
    }
}
