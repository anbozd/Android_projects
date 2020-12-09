package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    boolean isHomeButtonTriggered = false;
    Button button1;
    Button button2;
    String[] strings ={"Собаки","Кошки","Лошади",
            "Грызуны","Птицы","Экзотика","Рыбы",
            "ПЕТУХ"," ОСЁЛ"," ПОПУГАЙ","ПЧЁЛЫ"};


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        //Это часть шаблонная
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        holder.textView.setText(strings[position]);


    }
    @Override
    public int getItemCount() {

        return strings.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);



        }
    }


}
class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder> {


    String[] strings ={"Волки","Гепард","Гиены",
            "Лев","Медведи","Степной орел","Хищники пустынь",
            "Гиеновидная собака","Лесная куница"};

    @Override
    public MyAdapter1.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        //Это часть шаблонная
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        return new MyAdapter1.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter1.MyViewHolder holder, int position) {


        holder.textView.setText(strings[position]);


    }
    @Override
    public int getItemCount() {

        return strings.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);



        }
    }

}


