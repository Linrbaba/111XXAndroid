package com.example.myapplication;
//A109222251 林宗邑
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgGender, rgType;
    private EditText edtNumberOfTickets;
    private TextView lblOutput, lblAmount;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgGender = findViewById(R.id.rgGender);
        rgType = findViewById(R.id.rgType);
        edtNumberOfTickets = findViewById(R.id.edtNumberOfTickets);
        lblOutput = findViewById(R.id.lblOutput);
        lblAmount = findViewById(R.id.lblAmount);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取用户选择的性别
                RadioButton selectedGenderRadioButton = findViewById(rgGender.getCheckedRadioButtonId());
                String selectedGender = selectedGenderRadioButton.getText().toString();

                // 获取用户选择的票种
                RadioButton selectedTypeRadioButton = findViewById(rgType.getCheckedRadioButtonId());
                String selectedType = selectedTypeRadioButton.getText().toString();

                // 获取用户输入的张数
                String numberOfTicketsStr = edtNumberOfTickets.getText().toString();

                // 检查用户是否输入了有效的张数
                if (!numberOfTicketsStr.isEmpty()) {
                    int numberOfTickets = Integer.parseInt(numberOfTicketsStr);
                    double ticketPrice = 0.0;

                    // 根据票种设置票价
                    switch (selectedType) {
                        case "全票500":
                            ticketPrice = 500.0;
                            break;
                        case "兒童票250":
                            ticketPrice = 250.0;
                            break;
                        case "學生票400":
                            ticketPrice = 400.0;
                            break;
                    }

                    // 计算总金额
                    double totalAmount = numberOfTickets * ticketPrice;

                    // 构建显示结果文本
                    String result = "顯示結果:\n";
                    result += "性別: " + selectedGender + "\n";
                    result += "票種: " + selectedType + "\n";
                    result += "張數: " + numberOfTicketsStr + "\n";
                    result += "總金額: " + totalAmount + " 元";

                    // 显示结果文本
                    lblOutput.setText(result);
                    lblAmount.setText("金額: " + totalAmount + " 元");
                } else {
                    lblOutput.setText("請輸入有效的張數");
                    lblAmount.setText("");
                }
            }
        });
    }
}