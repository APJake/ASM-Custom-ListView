package com.example.customelistexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.customelistexample.mine.CustomAdapter;
import com.example.customelistexample.mine.MyContact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContactList;
    ArrayList<MyContact> myContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContactList=findViewById(R.id.lvContactList);
        initContact();
        CustomAdapter customAdapter=new CustomAdapter(this,myContacts);
        lvContactList.setAdapter(customAdapter);
    }

    private void initContact() {
        myContacts=new ArrayList<>();
        myContacts.add(new MyContact("Aung Minn Khant","09777769910",R.drawable.cap_round_icon));
        myContacts.add(new MyContact("Chan Myae Thu","09987654321",R.drawable.girl1_round_icon));
        myContacts.add(new MyContact("Mr Boy","09346688896",R.drawable.boy1_round_icon));
        myContacts.add(new MyContact("Ms Girl","0934249845",R.drawable.girl2_round_icon));
        myContacts.add(new MyContact("Ko Gote Kyrr","09785456773",R.drawable.dog1_round_icon));
        myContacts.add(new MyContact("Meow Meow","09923456778",R.drawable.cat1_round_icon));
        myContacts.add(new MyContact("Sar Eu","09346347834",R.drawable.girl3_round_icon));
        myContacts.add(new MyContact("Pal Pyote Thal","09787823232",R.drawable.woman1_round_icon));
        myContacts.add(new MyContact("Kyaw Gyi","098279238992",R.drawable.boy2_round_icon));
        myContacts.add(new MyContact("","09834628332",R.drawable.fri_round_icon));
    }
}