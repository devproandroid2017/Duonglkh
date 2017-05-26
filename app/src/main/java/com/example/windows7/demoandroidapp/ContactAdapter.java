package com.example.windows7.demoandroidapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
//sdsd
/**
 * Created by Windows 7 on 5/26/2017.
 */

public class ContactAdapter extends BaseAdapter {

    ArrayList<List>contacts;

    public ContactAdapter(ArrayList<List>contacts){
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rowView = inflater.inflate(R.layout.listitem_row, parent, false);

        ImageView imgAva = (ImageView) rowView.findViewById(R.id.avatar);

        TextView tvName = (TextView) rowView.findViewById(R.id.txtName);
        TextView tvCPU = (TextView) rowView.findViewById(R.id.txtCPU);
        TextView tvMota = (TextView) rowView.findViewById(R.id.txtMota);

        Contact contact = (Contact) contacts.get(position);
        tvName.setText(contact.name);
        tvCPU.setText(contact.cpu);
        tvMota.setText(contact.mota);
        if(contact.type.equals("1")){
            imgAva.setImageResource(R.drawable.lich);
        }else if (contact.type.equals("2")) {
            imgAva.setImageResource(R.drawable.danhba);
        }else if (contact.type.equals("3")) {
            imgAva.setImageResource(R.drawable.fb);
        }else if (contact.type.equals("4")) {
            imgAva.setImageResource(R.drawable.tw);
        }else if (contact.type.equals("5")) {
            imgAva.setImageResource(R.drawable.tinnhan);
        }else if (contact.type.equals("6")) {
            imgAva.setImageResource(R.drawable.tudien);
        }else if (contact.type.equals("7")) {
            imgAva.setImageResource(R.drawable.nhac);
        }else if (contact.type.equals("8")) {
            imgAva.setImageResource(R.drawable.blue);
        }
        return rowView;
    }
}
