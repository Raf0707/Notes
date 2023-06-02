package raf.tabiin.notes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raf.tabiin.notes.R;
import raf.tabiin.notes.databinding.FragmentReminderBinding;

public class ReminderFragment extends Fragment {

    FragmentReminderBinding b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = FragmentReminderBinding.inflate(getLayoutInflater());



        return b.getRoot();
    }
}