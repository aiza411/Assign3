package com.smd.elderease.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smd.elderease.ChooseRole;
import com.smd.elderease.R;
import com.smd.elderease.adapter.ChatListAdapter;
import com.smd.elderease.adapter.RoleAdapter;
import com.smd.elderease.classes.ChatList;
import com.smd.elderease.classes.Role;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Chat#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Chat extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    RecyclerView recyclerView;
    ChatListAdapter adapter;

    ArrayList<ChatList> roleList;

    public Chat() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Chat.
     */
    // TODO: Rename and change types and number of parameters
    public static Chat newInstance(String param1, String param2) {
        Chat fragment = new Chat();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chat, container, false);

        getChatData();


        recyclerView=view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        adapter=new ChatListAdapter(getContext(),roleList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void getChatData()
    {
        roleList = new ArrayList<>();
        roleList.add(new ChatList("Aiza",1,R.drawable.profile));
        roleList.add(new ChatList("Fatimah",1,R.drawable.profile));
        roleList.add(new ChatList("Ainaan",1,R.drawable.profile));
    }
}