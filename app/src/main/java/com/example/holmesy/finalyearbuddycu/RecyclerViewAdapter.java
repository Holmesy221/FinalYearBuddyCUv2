package com.example.holmesy.finalyearbuddycu;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private String[] title;
    private int[] image;
    private Listener listener;
    ImageView imageView;
    TextView textView;
    Drawable drawable;




    interface Listener{
        void onClick(int position);
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView card;

        public ViewHolder(CardView cardView){
            super(cardView);
            card = cardView;
        }

    }

    public void setListener(Listener listener){
        this.listener = listener;
    }

    public RecyclerViewAdapter (String title[], int[]image){
        this.title = title;
        this.image = image;

    }



    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view,parent,false);
        return new ViewHolder(cardView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position){
        CardView cardView = holder.card;
        imageView = (ImageView)cardView.findViewById(R.id.image);


        drawable = ContextCompat.getDrawable(cardView.getContext(), image[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(title[position]);


        textView = (TextView)cardView.findViewById(R.id.info_text);
        textView.setText(title[position]);


        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (listener !=null){
                    listener.onClick(position);
                }
            }
        });
    }


    @Override
    public int getItemCount(){
        return title.length;
    }




}
