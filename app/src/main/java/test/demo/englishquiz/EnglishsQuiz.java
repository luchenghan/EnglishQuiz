package test.demo.englishquiz;

import android.app.Application;

import com.firebase.client.Firebase;

public class EnglishsQuiz extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
