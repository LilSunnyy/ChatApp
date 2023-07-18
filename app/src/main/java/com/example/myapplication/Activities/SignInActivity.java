
package com.example.myapplication.Activities;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Toast;

        import com.example.myapplication.databinding.ActivitySignInBinding;
        import com.google.firebase.firestore.FirebaseFirestore;

        import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {
    private ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners() {
        binding.txtCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
    }

}