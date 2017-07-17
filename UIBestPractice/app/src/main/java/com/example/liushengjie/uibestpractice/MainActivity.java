package com.example.liushengjie.uibestpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();

    private EditText inputText;

    private Button send;

    private RecyclerView msgRecyclerView;

    private MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMsgs();
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgRecyclerView = (RecyclerView) findViewById(R.id.msg_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg msg = new Msg(content, Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size() - 1);
                    msgRecyclerView.scrollToPosition(msgList.size() - 1);
                    inputText.setText("");
                }
            }
        });
    }

    private void initMsgs() {
        Msg msg1 = new Msg("Hello, My name is Ben. May I ask you some questions?", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("Sure.", Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("What is your father's name?", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
        Msg msg4 = new Msg("Happy!", Msg.TYPE_SENT);
        msgList.add(msg4);
        Msg msg5 = new Msg("Then, What is your mother's name?", Msg.TYPE_RECEIVED);
        msgList.add(msg5);
        Msg msg6 = new Msg("Smile", Msg.TYPE_SENT);
        msgList.add(msg6);
        Msg msg7 = new Msg("Are u joking?", Msg.TYPE_RECEIVED);
        msgList.add(msg7);
        Msg msg8 = new Msg("No! That's my sister! I am Kidding. By the way, are u a census staff?", Msg.TYPE_SENT);
        msgList.add(msg8);
        Msg msg9 = new Msg("Of course not.", Msg.TYPE_RECEIVED);
        msgList.add(msg9);
        Msg msg10 = new Msg("Fuck off!", Msg.TYPE_SENT);
        msgList.add(msg10);
        Msg msg11 = new Msg("Ok, see you later, Kidding.", Msg.TYPE_RECEIVED);
        msgList.add(msg11);
    }
}
