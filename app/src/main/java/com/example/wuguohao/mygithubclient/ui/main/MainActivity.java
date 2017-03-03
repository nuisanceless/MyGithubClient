package com.example.wuguohao.mygithubclient.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wuguohao.mygithubclient.R;
import com.example.wuguohao.mygithubclient.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @BindView(R.id.account_et)
    EditText mAccountEt;

    @OnClick(R.id.confirm_btn)
    public void toReposListActivity ()
    {
        String account = mAccountEt.getText().toString();
        Toast.makeText(MainActivity.this, account, Toast.LENGTH_SHORT).show();
    }


}
