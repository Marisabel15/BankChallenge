package com.example.belale.santanderproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.belale.santanderproject.fragment.ContactFragment;
import com.example.belale.santanderproject.fragment.InvestmentFragment;
import com.example.belale.santanderproject.utils.animation.FragmentAnimation;

public class MainActivity extends AppCompatActivity {

    private Button btnInvestment, btnContact;

    private InvestmentFragment investFrag;
    private ContactFragment contactFrag;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInvestment = findViewById(R.id.invest);
        btnContact = findViewById(R.id.contact);

        fragmentManager = getSupportFragmentManager();

        investFrag = new InvestmentFragment();
        contactFrag = new ContactFragment();

        changeFragment(investFrag, null);

        btnInvestment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(investFrag, FragmentAnimation.SLIDE_LEFT_TO_RIGHT);
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(contactFrag, FragmentAnimation.SLIDE_RIGHT_TO_LEFT);
            }
        });
    }

    private void changeFragment(Fragment fragment, FragmentAnimation pageAnimation) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (pageAnimation != null) {
            int enter = pageAnimation.getInTransition();
            int exit = pageAnimation.getOutTransition();
            if (enter > 0 && exit > 0) {
                fragmentTransaction.setCustomAnimations(enter, exit);
            }
        }

        fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
    }

}
