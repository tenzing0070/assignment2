package com.example.president_of_amreica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<President_Activity> presidentsList = new ArrayList<>();
        presidentsList.add(new President_Activity("George W. H. Bush", R.drawable.george_h_w_bush,"George Herbert Walker Bush June 12, 1924 November 30, 2018 was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989."));
        presidentsList.add(new President_Activity("Gerald Ford", R.drawable.gerald_ford,"Gerald Rudolph Ford Jr. (born Leslie Lynch King Jr.; July 14, 1913 – December 26, 2006) was an American politician who served as the 38th president of the United States from August 1974 to January 1977. Before his accession to the presidency."));
        presidentsList.add(new President_Activity("Barack Obama",R.drawable.barak_obama,"Barack Hussein Obama II  (About this sound listen);[1] born August 4, 1961) is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party."));
        presidentsList.add(new President_Activity("Donald Trump",R.drawable.donald_trump,"Donald John Trump (born June 14, 1946) is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality."));
        presidentsList.add(new President_Activity("George W. Bush",R.drawable.george_w_bush,"George Walker Bush (born July 6, 1946) is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. He had previously served as the 46th governor of Texas from 1995 to 2000."));
        presidentsList.add(new President_Activity("Bill Clinton",R.drawable.bill_clinton," William Jefferson Clinton (born William Jefferson Blythe III; August 19, 1946) is an American politician who served as the 42nd president of the United States from 1993 to 2001. Prior to his presidency, he served as governor of Arkansas (1979-1981 and 1983-1992)."));
        presidentsList.add(new President_Activity("Ronald Reagan",R.drawable.ronald_regan," Ronald Wilson Reagan  February 6, 1911 – June 5, 2004) was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. Prior to his presidency."));
        presidentsList.add(new President_Activity("Jimmy Carter",R.drawable.jimmy_carter,"James Earl Carter Jr. (born October 1, 1924) is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party, he previously served as a Georgia State Senator from 1963 to 1967 and as the 76th Governor of Georgia from 1971 to 1975."));


        President_Adapter presidentAdapter = new President_Adapter(this,presidentsList);
        recyclerView.setAdapter(presidentAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
