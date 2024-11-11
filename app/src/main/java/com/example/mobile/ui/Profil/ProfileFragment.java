package com.example.mobile.ui.Profil;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.mobile.R;
import com.example.mobile.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private TextView nameTextView, emailTextView, phoneTextView;

    private Button logoutButton;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        // Get user info from SharedPreferences
        SharedPreferences preferences = requireContext().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        String username = preferences.getString("username", "Guest"); // Default value "Guest"
        String email = preferences.getString("email", "N/A"); // Default value "N/A"
        String phone = preferences.getString("phone", "N/A"); // Default value "N/A"

       // Initialize the TextViews
        nameTextView = root.findViewById(R.id.nameTextView);
        emailTextView = root.findViewById(R.id.emailTextView);
        phoneTextView = root.findViewById(R.id.phoneTextView);

       // Set user data to the views
        nameTextView.setText("Name: " + username);
        emailTextView.setText("Email: " + email);
        phoneTextView.setText("Phone: " + phone);


        // Initialize logout button and set click listener
        logoutButton = root.findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(v -> {
            // Clear SharedPreferences (pas besoin de redéclarer la variable 'preferences')
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();  // Clears all data in SharedPreferences
            editor.apply();

            // Navigate to the Login screen (SignInFragment)
            Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_homeFragment);
        });

        return root;
    }
}