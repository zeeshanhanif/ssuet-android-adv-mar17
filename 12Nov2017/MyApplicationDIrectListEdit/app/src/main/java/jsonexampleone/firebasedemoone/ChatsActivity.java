package jsonexampleone.firebasedemoone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import jsonexampleone.firebasedemoone.adapters.ChatsPagerAdapter;
import jsonexampleone.firebasedemoone.chat.BaseFragment;
import jsonexampleone.firebasedemoone.chat.Contacts;
import jsonexampleone.firebasedemoone.chat.Recents;

public class ChatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        Button logoutBtn = findViewById(R.id.logoutBtn);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ChatsActivity.this,MainActivity.class));
            }
        });
        ViewPager pager = (ViewPager) findViewById(R.id.tabsPager);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        Recents recents = new Recents();
        recents.setTitle("Recents");
        fragments.add(recents);

        Contacts contacts = new Contacts();
        contacts.setTitle("Contacts");
        fragments.add(contacts);

        ChatsPagerAdapter adapter = new ChatsPagerAdapter(getSupportFragmentManager(),fragments);
        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);
    }
}
