package com.example.selfstudy_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.selfstudy_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fetchUserProfile();
    }

    private void fetchUserProfile() {
        UserProfile userProfile = new UserProfile();
        userProfile.name = "홍길동";
        userProfile.phone = "02-222-3333";
        userProfile.address = "사랑시 고백구 행복동";

        binding.setUserProfile(userProfile);
    }

    /*private void updateUI(UserProfile userProfile){

        binding.name.setText(userProfile.name);
        binding.phone.setText(userProfile.phone);
        binding.address.setText(userProfile.address);
    }*/
}