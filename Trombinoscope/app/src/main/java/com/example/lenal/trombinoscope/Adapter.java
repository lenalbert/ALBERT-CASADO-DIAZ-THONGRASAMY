package com.example.lenal.trombinoscope;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<Personne> {
        public Adapter(Context context, List<Personne> personneList) {
            super(context, 0, personneList);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
                if(convertView == null){
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_personne_item, parent, false);
                }

                PersonneItem viewHolder = (PersonneItem) convertView.getTag();
                if(viewHolder == null){
                    viewHolder = new PersonneItem();
                    viewHolder.prenom = (TextView) convertView.findViewById(R.id.prenom);
                    viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
                    viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
                    convertView.setTag(viewHolder);
                }

                //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
                Personne personne = getItem(position);

                //il ne reste plus qu'à remplir notre vue
                viewHolder.prenom.setText(personne.getPrenom());
                viewHolder.nom.setText(personne.getNom());
                viewHolder.avatar.setImageDrawable(new ColorDrawable(personne.getCouleur()));
            return convertView;
        }

    /*public void setAdapter(){
        this.Adapter=A;
    }*/

}


