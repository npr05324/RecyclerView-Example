package com.example.cathode.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Cathode on 2015-05-09.
 */
public class examviewholder extends RecyclerView.ViewHolder{

    TextView txt1,txt2,txt3;


    public examviewholder(View itemView) {
        super(itemView);

        txt1= (TextView) itemView.findViewById(R.id.textView1);
        txt2= (TextView) itemView.findViewById(R.id.textView2);
        txt3= (TextView) itemView.findViewById(R.id.textView3);
    }


}
