package com.reidzeibel.teladan48app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.reidzeibel.teladan48app.api.RetrofitInstance;
import com.reidzeibel.teladan48app.api.model.ListEvent;
import com.reidzeibel.teladan48app.api.model.ListUserLocation;
import com.reidzeibel.teladan48app.api.model.ListUsers;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity
        extends ActionBarActivity
        implements  GoogleApiClient.OnConnectionFailedListener,
                    View.OnClickListener,
                    AdapterView.OnItemClickListener {

    private static final int RC_SIGN_IN = 1337;
    private GoogleApiClient mGoogleApiClient;
    private String[] mDrawerMenu;
    private ListView mDrawerList;
    private TextView mApiName, mApiResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mApiName = (TextView) findViewById(R.id.api_name);
        mApiResult = (TextView) findViewById(R.id.api_result);
        mDrawerMenu = getResources().getStringArray(R.array.drawer_array);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerList.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, mDrawerMenu));

        mDrawerList.setOnItemClickListener(this);

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();


        SignInButton signInButton = (SignInButton) findViewById(R.id.sign_in_button);
        findViewById(R.id.sign_in_button).setOnClickListener(this);

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_in_button:
                signIn();
                break;
            default:
                break;
        }
    }

    private void signIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }

    private void handleSignInResult(GoogleSignInResult result) {
        if (result.isSuccess()) {
            GoogleSignInAccount account = result.getSignInAccount();
            ((TextView) findViewById(R.id.status)).setText(account.getDisplayName());
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mApiName.setText("");
        mApiResult.setText("");
        switch (position) {
            case 0 :
                mApiName.setText("USERS API");
                RetrofitInstance.get().getUsers().enqueue(new Callback<ListUsers>() {
                    @Override
                    public void onResponse(Response<ListUsers> response) {
                        mApiResult.setText(response.body().toString());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
                break;
            case 1 :
                mApiName.setText("USER LOCATION API");
                RetrofitInstance.get().getUserLocation().enqueue(new Callback<ListUserLocation>() {
                    @Override
                    public void onResponse(Response<ListUserLocation> response) {
                        mApiResult.setText(response.body().toString());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
                break;
            case 2 :
                mApiName.setText("EVENTS API");
                RetrofitInstance.get().getEvents().enqueue(new Callback<ListEvent>() {
                    @Override
                    public void onResponse(Response<ListEvent> response) {
                        mApiResult.setText(response.body().toString());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
                break;
        }
    }
}
