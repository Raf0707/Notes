package raf.tabiin.notes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raf.tabiin.notes.R;
import raf.tabiin.notes.databinding.FragmentNotesBinding;

public class NotesFragment extends Fragment {

    FragmentNotesBinding b;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b = FragmentNotesBinding.inflate(getLayoutInflater());



        return b.getRoot();
    }
}