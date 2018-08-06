package com.example.belale.santanderproject.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.belale.santanderproject.R;
import com.example.belale.santanderproject.adapter.DownInfoAdapter;
import com.example.belale.santanderproject.adapter.InfoAdapter;
import com.example.belale.santanderproject.models.Fund;
import com.example.belale.santanderproject.models.models.parts.DownInfo;
import com.example.belale.santanderproject.models.models.parts.Info;
import com.example.belale.santanderproject.utils.retrofit.IRetrofitConfig;
import com.example.belale.santanderproject.utils.retrofit.Routers;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InvestmentFragment extends Fragment {
    public Toolbar toolbar;
    public InfoAdapter mAdapter;
    public DownInfoAdapter dAdapter;
    public RecyclerView dRecyclerView;
    public RecyclerView mRecyclerView;
    public List<DownInfo> downInfoList;
    public List<Info> infoList;
    public TextView whatIs, fundName, fundText, definition, riskTitle, infoTitle, taxOne, taxTwo, taxThree, taxFour, taxFive, taxSix;
    private View view1, view2, view3, view4, view5;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.investment_fragment, container, false );

        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);


        fundName = (TextView) view.findViewById( R.id.fund_name );
        whatIs = (TextView) view.findViewById( R.id.what_is );
        fundText = (TextView) view.findViewById( R.id.fund_text );
        definition = (TextView) view.findViewById( R.id.definition );
        riskTitle = (TextView) view.findViewById( R.id.risk_title );
        infoTitle = (TextView) view.findViewById( R.id.info_title );

        taxOne = (TextView) view.findViewById( R.id.tax_1 );
        taxTwo = (TextView) view.findViewById( R.id.tax_2 );

        taxThree = (TextView) view.findViewById( R.id.tax_3 );
        taxFour = (TextView) view.findViewById( R.id.tax_4 );

        taxFive = (TextView) view.findViewById( R.id.tax_5 );
        taxSix = (TextView) view.findViewById( R.id.tax_6 );

        view1 = view.findViewById(R.id.view1);
        view2 = view.findViewById(R.id.view2);
        view3 = view.findViewById(R.id.view3);
        view4 = view.findViewById(R.id.view4);
        view5 = view.findViewById(R.id.view5);

        dRecyclerView = view.findViewById( R.id.down_recycler_view );
        mRecyclerView = view.findViewById(R.id.info_recycler_view);
        downInfoList = new ArrayList<>(  );
        infoList = new ArrayList<>(  );

        initRetrofit();

        return view;
    }

    private void initRetrofit() {

        Routers routers = IRetrofitConfig.retrofit.create(Routers.class);

        Call<Fund> fund = routers.getFund();

        fund.enqueue( new Callback<Fund>() {
            @Override
            public void onResponse(Call<Fund> call, Response<Fund> response) {

                    Fund fund = response.body();

                    fundName.setText( fund.getScreen().getTitle() );
                    fundText.setText( fund.getScreen().getFundName() );
                    whatIs.setText( fund.getScreen().getWhatIs() );
                    definition.setText( fund.getScreen().getDefinition() );
                    riskTitle.setText( fund.getScreen().getRiskTitle() );
                    infoTitle.setText( fund.getScreen().getInfoTitle() );

                    taxOne.setText( String.valueOf( fund.getScreen().getMoreInfo().getMonth().getFund()+ getString(R.string.per_cent) ) );
                    taxTwo.setText( String.valueOf( fund.getScreen().getMoreInfo().getMonth().getCdi()+ getString(R.string.per_cent) ) );

                    taxThree.setText( String.valueOf( fund.getScreen().getMoreInfo().getYear().getFund()+ getString(R.string.per_cent) ) );
                    taxFour.setText( String.valueOf( fund.getScreen().getMoreInfo().getYear().getCdi()+ getString(R.string.per_cent) ) );

                    taxFive.setText( String.valueOf( fund.getScreen().getMoreInfo().getTmonth().getFund()+ getString(R.string.per_cent) ) );
                    taxSix.setText( String.valueOf( fund.getScreen().getMoreInfo().getTmonth().getCdi()+ getString(R.string.per_cent) ) );

                    setupRecycler(fund.getScreen().getInfo());
                    setupRecycler_1(fund.getScreen().getDownInfo());

                    switch(fund.getScreen().getRisk()){

                        case LOW:
                            ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
                            layoutParams.height = 40;
                            view1.setLayoutParams(layoutParams);
                            break;
                        case LOW_MEDIUM:
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            layoutParams2.height = 40;
                            view2.setLayoutParams(layoutParams2);
                            break;
                        case MEDIUM:
                            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                            layoutParams3.height = 40;
                            view3.setLayoutParams(layoutParams3);
                            break;
                        case MEDIUM_HIGH:
                            ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                            layoutParams4.height = 40;
                            view4.setLayoutParams(layoutParams4);
                            break;
                        case HIGH:
                            ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                            layoutParams5.height = 40;
                            view5.setLayoutParams(layoutParams5);
                            break;
                    }
            }

                      @Override
            public void onFailure(Call<Fund> call, Throwable t) {
                System.out.println("Erro:  "+t.getMessage());
            }
        });
    }

            private void setupRecycler(List<Info> infoList) {
                LinearLayoutManager layoutManager = new LinearLayoutManager( getContext() );
                mRecyclerView.setLayoutManager( layoutManager );
                mAdapter = new InfoAdapter( getContext(), infoList );
                mRecyclerView.setAdapter( mAdapter );
            }

            private void setupRecycler_1(List<DownInfo> downInfoList) {
                LinearLayoutManager layoutManager = new LinearLayoutManager( getContext() );
                dRecyclerView.setLayoutManager( layoutManager );
                dAdapter = new DownInfoAdapter( getContext(), downInfoList );
                dRecyclerView.setAdapter( dAdapter );
            }
   }
