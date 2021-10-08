import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.some.notes.R;

import io.realm.Realm;

public class RealmDuplicate  extends AppCompatActivity
{

    Realm realm;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        realm= Realm.getDefaultInstance();


    }
}
