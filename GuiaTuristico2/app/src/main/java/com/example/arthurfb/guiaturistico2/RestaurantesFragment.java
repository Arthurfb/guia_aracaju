package com.example.arthurfb.guiaturistico2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurante_layout, container, false);

        final ArrayList<LocalInfo> localInfos = new ArrayList<>();

        localInfos.add(new LocalInfo(R.string.cariri_descriçao, R.drawable.restaurante_cariri, R.string.titulo_cariri, R.string.saiba_cariri));

        InfoAdapter adapter = new InfoAdapter(getActivity(), localInfos);

        ListView listView = rootView.findViewById(R.id.listRestaurante);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.saiba_cariri)));
                startActivity(intent);
            }
        });

        return rootView;

    }
}
