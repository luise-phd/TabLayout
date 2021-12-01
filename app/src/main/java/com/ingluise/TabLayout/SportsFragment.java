package com.ingluise.TabLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

public class SportsFragment extends Fragment {
    private TextInputEditText ti;
    private Spinner sp;
    private Button b;

    public SportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sports, container, false);

        ti = rootView.findViewById(R.id.input_nombre);
        sp = rootView.findViewById(R.id.sp_clasificacion);
        b = rootView.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = ti.getText().toString();
                String clas = sp.getSelectedItem().toString();
                if (!nom.equals("") && !clas.equals("Seleccione...")) {
                    Toast.makeText(getContext(), "Deporte: " + nom + "\nClasificación: " + clas,
                            Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(getContext(), "Por favor, ingrese todos los datos: ",
                            Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }
}
