package com.example.cathode.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cathode on 2015-05-09.
 */
public class examAdapter extends RecyclerView.Adapter<examviewholder> {

 public List<Item> items;


        public examAdapter(){
            super();


            items=new ArrayList<>();

            items.add(new Item("º¯Àç¸í","±èÅÂÀÏ","±èÇö¿ì"));
            items.add(new Item("½¼µþ·¯","°­º´¼ö","¾çÁ¤ÈÆ"));
            items.add(new Item("1","2","3"));


        }




    @Override
    public examviewholder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recy,parent,false);









        return new examviewholder(view);
    }

    @Override
    public void onBindViewHolder(examviewholder holder, int position) {
    final Item Item = items.get(position);


        holder.txt1.setText(Item.getText1());
        holder.txt2.setText(Item.getText2());
        holder.txt3.setText(Item.getText3());





    }

    @Override
    public int getItemCount() {



        return items.size();
    }
}
