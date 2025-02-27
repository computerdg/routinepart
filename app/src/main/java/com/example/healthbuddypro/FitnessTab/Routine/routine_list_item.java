package com.example.healthbuddypro.FitnessTab.Routine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.healthbuddypro.R;
public class routine_list_item extends AppCompatActivity {

    private ImageButton edit_routinelist, delete_routinelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_routine_list_item);

        edit_routinelist = findViewById(R.id.edit_routinelist);
        delete_routinelist = findViewById(R.id.delete_routinelist);

        // 루틴 수정버튼 클릭 시 루틴수정으로 이동
        edit_routinelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), fix_routine.class);
                startActivity(intent);
            }
        });

        //TODO : 삭제 버튼 누르면 루틴 정보 서버에서 삭제 되도록 구현해야함
        delete_routinelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // 임시로 박아둔거
            }
        });

    }
}