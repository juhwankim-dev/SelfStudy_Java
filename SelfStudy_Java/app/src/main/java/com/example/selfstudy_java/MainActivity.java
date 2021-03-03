package com.example.selfstudy_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.selfstudy_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // 예전에 일일이 findViewById하던 노가다 작업을 안드로이드가 대신 해줌으로써 편해졌다.
    // 코틀린에서는 이 바인딩 작업조차 하지 않아도 되게 편하게 바뀌었다.
    //private TextView nameView, phoneView, addressView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 뷰 바인딩
/*        nameView = findViewById(R.id.name);
        phoneView = findViewById(R.id.phone);
        addressView = findViewById(R.id.address);*/

        fetchUserProfile();
    }

    private void fetchUserProfile() {
        UserProfile userProfile = new UserProfile();
        userProfile.name = "홍길동";
        userProfile.phone = "02-222-3333";
        userProfile.address = "사랑시 고백구 행복동";

        updateUI(userProfile);
    }

    private void updateUI(UserProfile userProfile){

        // 데이터 바인딩
/*        nameView.setText(userProfile.name);
        phoneView.setText(userProfile.phone);
        addressView.setText(userProfile.address);*/

        binding.name.setText(userProfile.name);
        binding.phone.setText(userProfile.phone);
        binding.address.setText(userProfile.address);
    }
}