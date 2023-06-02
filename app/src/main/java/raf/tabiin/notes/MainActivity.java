package raf.tabiin.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import raf.tabiin.notes.databinding.ActivityMainBinding;
import raf.tabiin.notes.fragments.AppAboutFragment;
import raf.tabiin.notes.fragments.NotesFragment;
import raf.tabiin.notes.fragments.ReminderFragment;
import raf.tabiin.notes.fragments.ShoppingListFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.bottomNavigationBar.setItemSelected(R.id.notes, true);
        getSupportFragmentManager().beginTransaction().replace(
                R.id.fragment_container, new NotesFragment()).commit();
        bottomMenu();
    }

    private void bottomMenu() {
        b.bottomNavigationBar.setOnItemSelectedListener(i -> {
            Fragment f = null;
            switch (i) {
                case R.id.notes:
                    f = new NotesFragment();
                    break;

                case R.id.reminder:
                    f = new ReminderFragment();
                    break;

                case R.id.shopping_list:
                    f = new ShoppingListFragment();
                    break;

                case R.id.about_app:
                    f = new AppAboutFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(
                    R.id.fragment_container, f).commit();
        });
    }
}