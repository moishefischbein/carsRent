package com.example.moish.carrentforcompany.model.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.moish.carrentforcompany.R;
import com.example.moish.carrentforcompany.model.entities.Branch;
import com.example.moish.carrentforcompany.model.entities.Client;

import java.util.List;

/**
 * Created by moish on 09/12/2017.
 */

public class BranchAdapter extends BaseAdapter{

    private final List<Client> clients;
    private final Activity activity;

    public BranchAdapter(List<Client> clients, Activity activity) {
        this.clients = clients;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return clients.size();
    }

    @Override
    public Object getItem(int i) {
        return clients.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ((Client) getItem(i)).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = activity.getLayoutInflater()
                .inflate(R.layout.item_row, viewGroup, false);

        Client client = clients.get(i);

        try {



            TextView ide = (TextView) v.findViewById(R.id.itemId);
            TextView name = (TextView) v.findViewById(R.id.itemName);

            name.setText(client.getFirstName() + " " + client.getLastName());
            ide.setText(Integer.toString(client.getId()));
            //ide.setText(client.getId());

        }catch (Exception ex){ex.toString();}
        return v;

    }
    {
    }
}


