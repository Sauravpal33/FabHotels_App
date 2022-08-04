package com.example.fabhotels.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.fabhotels.Activities.Adapters.MainAdapter;
import com.example.fabhotels.Activities.Models.MainModel;
import com.example.fabhotels.R;
import com.example.fabhotels.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.room1,"FabExpress Avenue Inn" , "₹1,999" ,"Bangalore East Railway Station,Bangalore"));
        list.add(new MainModel(R.drawable.room2,"The Royale Senate, Hebbal" , "₹1,799" ,"3.3 km from Indian Institute of Science,kolkata"));
        list.add(new MainModel(R.drawable.room4,"Airport Hotel Square Plaza" , "₹1,399" ,"Situated in New Delhi, 10 km from Qutub Minar"));
        list.add(new MainModel(R.drawable.room3,"BNGV Mystic Premier Hotel" , "₹1,599" ,"Situated in Bangalore, 1.9 km from Koramangala"));
        list.add(new MainModel(R.drawable.room5,"The Ritz - Carlton, Bangalore" , "₹1,799" ," Finest in shopping, dining and entertainment"));
        list.add(new MainModel(R.drawable.room6,"Red Arrow Residency" , "₹1,599" ," 1-star guest house and luggage storage space"));
        list.add(new MainModel(R.drawable.room7,"Jaipur Hotel New - Heritage Hotel" , "₹2,599" ,"Hotel features , free private parking, a bar and a terrace"));
        list.add(new MainModel(R.drawable.room8,"Novotel Kolkata Hotel and Residences" , "₹1,599" ,"Residences offers an outdoor swimming pool "));
        list.add(new MainModel(R.drawable.room9,"ITC Sonar, a Luxury Collection Hotel" , "₹1,499" ,"Offering an outdoor swimming pool and 5 dinings"));
        list.add(new MainModel(R.drawable.room10,"Ibiza The Fern Resort & Spa" , "₹2,899" ," 5-star luxury with elegant rooms, outdoor pool ,spa"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
        

    }
}