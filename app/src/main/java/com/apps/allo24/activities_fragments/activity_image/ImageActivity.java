package com.apps.allo24.activities_fragments.activity_image;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;

import com.apps.allo24.BuildConfig;
import com.apps.allo24.R;
import com.apps.allo24.activities_fragments.activity_intro_slider.IntroSliderActivity;
import com.apps.allo24.activities_fragments.activity_language.LanguageActivity;
import com.apps.allo24.activities_fragments.activity_setting.SettingsActivity;
import com.apps.allo24.databinding.ActivityImageBinding;
import com.apps.allo24.databinding.ActivitySettingsBinding;
import com.apps.allo24.language.Language;
import com.apps.allo24.models.DefaultSettings;
import com.apps.allo24.models.UserModel;
import com.apps.allo24.preferences.Preferences;
import com.apps.allo24.remote.Api;
import com.apps.allo24.tags.Tags;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

import io.paperdb.Paper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageActivity extends AppCompatActivity {
    private ActivityImageBinding binding;
    private String lang;
    private String title;
    private String url="";

    @Override
    protected void attachBaseContext(Context newBase) {
        Paper.init(newBase);
        super.attachBaseContext(Language.updateResources(newBase, Paper.book().read("lang", "ar")));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Transition transition = new Fade();
            transition.setInterpolator(new LinearInterpolator());
            transition.setDuration(200);
            getWindow().setEnterTransition(transition);
            getWindow().setExitTransition(transition);

        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_image);
        getDataFromIntent();
        initView();
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        url = intent.getStringExtra("url");

    }

    private void initView() {
        Paper.init(this);
        lang = Paper.book().read("lang", "ar");
        binding.setLang(lang);
        binding.llBack.setOnClickListener(v -> super.onBackPressed());
        binding.setName(title);
        Picasso.get().load(Uri.parse(url)).into(binding.photoView);



    }


}