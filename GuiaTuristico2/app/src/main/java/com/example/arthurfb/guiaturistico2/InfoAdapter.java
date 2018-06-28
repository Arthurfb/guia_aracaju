package com.example.arthurfb.guiaturistico2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<LocalInfo> {

    public InfoAdapter(Activity context, ArrayList<LocalInfo> words) {

        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_lista_info, parent, false);

        }

        LocalInfo currentInfo = getItem(position);

        ImageView localImageView = (ImageView) listItemView.findViewById(R.id.imagem_local);
        localImageView.setImageResource(currentInfo.getImageResourceId());

        TextView localTextView = (TextView) listItemView.findViewById(R.id.nome_local);
        localTextView.setText(currentInfo.getNomeLocalId());

        TextView tituloTextView = (TextView) listItemView.findViewById(R.id.titulo_local);
        tituloTextView.setText(currentInfo.getTituloLocalId());

        return listItemView;
    }
}
