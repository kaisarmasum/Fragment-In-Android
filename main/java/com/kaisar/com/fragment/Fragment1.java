package com.kaisar.com.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Fragment1 extends Fragment {
    String [] name = {"Jobaer Ahmed","Abu Kaisar","Rakib Hossain","Ashraful Islam","Fowjael Ahamed","Md Monjur"};
    Integer[] Image={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
    String[] id ={"161-15-6735","161-15-6759","161-15-6802","161-15-7100","161-15-7045","131-15-6812"};
    String[] section={"F","F","F","F","F","F"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        ListView li=(ListView)v.findViewById(R.id.list);
        li.setAdapter(new Mylist(getActivity(),R.layout.custom_layout,name));
        return v;

    }
    class Mylist extends ArrayAdapter {

        public Mylist(Context context, int resource, String[] objects) {
            super(context, resource, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=((Activity)getContext()).getLayoutInflater().inflate(R.layout.custom_layout,null);
            TextView t1=(TextView)v.findViewById(R.id.textView);
            TextView t2=(TextView)v.findViewById(R.id.textView2);
            TextView t3=(TextView)v.findViewById(R.id.textView3);
            ImageView Ima=(ImageView)v.findViewById(R.id.imageView);
            t1.setText(name[position]);
            t2.setText(id[position]);
            t3.setText(section[position]);
            Ima.setImageResource(Image[position]);

            return v;
        }
    }

}




