package com.example.arthurfb.guiaturistico2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OrlasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.orla_layout, container, false);

        final ArrayList<LocalInfo> localInfos = new ArrayList<>();

        localInfos.add(new LocalInfo(R.string.atalaia_descriçao, R.drawable.orla_aracaju, R.string.titulo_atalaia, R.string.saiba_atalaia));

        InfoAdapter adapter = new InfoAdapter(getActivity(), localInfos);

        ListView listView = rootView.findViewById(R.id.listOrla);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.saiba_atalaia)));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
