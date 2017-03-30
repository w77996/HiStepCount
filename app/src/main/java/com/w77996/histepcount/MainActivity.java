package com.w77996.histepcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.w77996.histepcount.view.StepCountView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.main_plan)
    TextView mainPlan;
    @BindView(R.id.main_history)
    TextView mainHistory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick({R.id.main_plan, R.id.main_history})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_plan:
                break;
            case R.id.main_history:
                break;
        }
    }
}
