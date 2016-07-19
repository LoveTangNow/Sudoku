package com.example.thomasliu.sudoku;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //第一行的Button
        final Button button11 = (Button)findViewById(R.id.hhh11);
        final Button button12 = (Button)findViewById(R.id.hhh12);
        final Button button13 = (Button)findViewById(R.id.hhh13);
        final Button button14 = (Button)findViewById(R.id.hhh14);
        final  Button button15 = (Button)findViewById(R.id.hhh15);
        final  Button button16 = (Button)findViewById(R.id.hhh16);
        final  Button button17 = (Button)findViewById(R.id.hhh17);
        final   Button button18 = (Button)findViewById(R.id.hhh18);
        final   Button button19 = (Button)findViewById(R.id.hhh19);

        //第二行的Button
        final   Button button21 = (Button)findViewById(R.id.hhh21);
        final    Button button22 = (Button)findViewById(R.id.hhh22);
        final    Button button23 = (Button)findViewById(R.id.hhh23);
        final  Button button24 = (Button)findViewById(R.id.hhh24);
        final  Button button25 = (Button)findViewById(R.id.hhh25);
        final  Button button26 = (Button)findViewById(R.id.hhh26);
        final   Button button27 = (Button)findViewById(R.id.hhh27);
        final   Button button28 = (Button)findViewById(R.id.hhh28);
        final   Button button29 = (Button)findViewById(R.id.hhh29);

        final   Button button31 = (Button)findViewById(R.id.hhh31);
        final Button button32 = (Button)findViewById(R.id.hhh32);
        final   Button button33 = (Button)findViewById(R.id.hhh33);
        final Button button34 = (Button)findViewById(R.id.hhh34);
        final  Button button35 = (Button)findViewById(R.id.hhh35);
        final  Button button36 = (Button)findViewById(R.id.hhh36);
        final  Button button37 = (Button)findViewById(R.id.hhh37);
        final  Button button38 = (Button)findViewById(R.id.hhh38);
        final  Button button39 = (Button)findViewById(R.id.hhh39);

        final Button button41 = (Button)findViewById(R.id.hhh41);
        final  Button button42 = (Button)findViewById(R.id.hhh42);
        final  Button button43 = (Button)findViewById(R.id.hhh43);
        final  Button button44 = (Button)findViewById(R.id.hhh44);
        final  Button button45 = (Button)findViewById(R.id.hhh45);
        final  Button button46 = (Button)findViewById(R.id.hhh46);
        final  Button button47 = (Button)findViewById(R.id.hhh47);
        final Button button48 = (Button)findViewById(R.id.hhh48);
        final  Button button49 = (Button)findViewById(R.id.hhh49);

        final  Button button51 = (Button)findViewById(R.id.hhh51);
        final  Button button52 = (Button)findViewById(R.id.hhh52);
        final  Button button53 = (Button)findViewById(R.id.hhh53);
        final  Button button54 = (Button)findViewById(R.id.hhh54);
        final  Button button55 = (Button)findViewById(R.id.hhh55);
        final  Button button56 = (Button)findViewById(R.id.hhh56);
        final  Button button57 = (Button)findViewById(R.id.hhh57);
        final  Button button58 = (Button)findViewById(R.id.hhh58);
        final Button button59 = (Button)findViewById(R.id.hhh59);

        final Button button61 = (Button)findViewById(R.id.hhh61);
        final  Button button62 = (Button)findViewById(R.id.hhh62);
        final  Button button63 = (Button)findViewById(R.id.hhh63);
        final  Button button64 = (Button)findViewById(R.id.hhh64);
        final  Button button65 = (Button)findViewById(R.id.hhh65);
        final  Button button66 = (Button)findViewById(R.id.hhh66);
        final  Button button67 = (Button)findViewById(R.id.hhh67);
        final  Button button68 = (Button)findViewById(R.id.hhh68);
        final  Button button69 = (Button)findViewById(R.id.hhh69);

        final  Button button71 = (Button)findViewById(R.id.hhh71);
        final  Button button72 = (Button)findViewById(R.id.hhh72);
        final Button button73 = (Button)findViewById(R.id.hhh73);
        final Button button74 = (Button)findViewById(R.id.hhh74);
        final  Button button75 = (Button)findViewById(R.id.hhh75);
        final  Button button76 = (Button)findViewById(R.id.hhh76);
        final  Button button77 = (Button)findViewById(R.id.hhh77);
        final   Button button78 = (Button)findViewById(R.id.hhh78);
        final   Button button79 = (Button)findViewById(R.id.hhh79);

        final Button button81 = (Button)findViewById(R.id.hhh81);
        final  Button button82 = (Button)findViewById(R.id.hhh82);
        final  Button button83 = (Button)findViewById(R.id.hhh83);
        final  Button button84 = (Button)findViewById(R.id.hhh84);
        final   Button button85 = (Button)findViewById(R.id.hhh85);
        final  Button button86 = (Button)findViewById(R.id.hhh86);
        final  Button button87 = (Button)findViewById(R.id.hhh87);
        final  Button button88 = (Button)findViewById(R.id.hhh88);
        final  Button button89 = (Button)findViewById(R.id.hhh89);

        final   Button button91 = (Button)findViewById(R.id.hhh91);
        final   Button button92 = (Button)findViewById(R.id.hhh92);
        final  Button button93 = (Button)findViewById(R.id.hhh93);
        final  Button button94 = (Button)findViewById(R.id.hhh94);
        final  Button button95 = (Button)findViewById(R.id.hhh95);
        final  Button button96 = (Button)findViewById(R.id.hhh96);
        final   Button button97 = (Button)findViewById(R.id.hhh97);
        final  Button button98 = (Button)findViewById(R.id.hhh98);
        final  Button button99 = (Button)findViewById(R.id.hhh99);

        //第十一行的Button
        final Button button111 = (Button)findViewById(R.id.hhh111);
        final  Button button112 = (Button)findViewById(R.id.hhh112);
        final  Button button113 = (Button)findViewById(R.id.hhh113);
        final  Button button114 = (Button)findViewById(R.id.hhh114);
        final  Button button115 = (Button)findViewById(R.id.hhh115);
        final  Button button116 = (Button)findViewById(R.id.hhh116);
        final  Button button117 = (Button)findViewById(R.id.hhh117);
        final  Button button118 = (Button)findViewById(R.id.hhh118);
        final  Button button119 = (Button)findViewById(R.id.hhh119);



        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button11,data);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button21,data);
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button31,data);
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button41,data);
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button51,data);
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button61,data);
            }
        });

        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button71,data);
            }
        });

        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button81,data);
            }
        });

        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button91,data);
            }
        });




        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button12,data);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button22,data);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button32,data);
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button42,data);
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button52,data);
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button62,data);
            }
        });

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button72,data);
            }
        });

        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button82,data);
            }
        });

        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                shang_fang_wu_pai_cong_data_xie_ru(button92,data);
            }
        });



        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////

        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                 if (button111.getText() != null)
                 {
                     data = (String) button111.getText();
                 }
            }
        });

        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button112.getText() != null)
                {
                    data = (String) button112.getText();
                }
            }
        });

        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button113.getText() != null)
                {
                    data = (String) button113.getText();
                }
            }
        });

        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button114.getText() != null)
                {
                    data = (String) button114.getText();
                }
            }
        });

        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button115.getText() != null)
                {
                    data = (String) button115.getText();
                }
            }
        });

        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button116.getText() != null)
                {
                    data = (String) button116.getText();
                }
            }
        });

        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button117.getText() != null)
                {
                    data = (String) button117.getText();
                }
            }
        });

        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button118.getText() != null)
                {
                    data = (String) button118.getText();
                }
            }
        });

        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                if (button119.getText() != null)
                {
                    data = (String) button119.getText();
                }
            }
        });



        //所有button文字的添加
        Addshudu sd = new Addshudu();
        int[][] sd_ = sd.add(2);
        // 0不算数独 1简单 2中等 3难 >=4不算数独
        //用数组存储的
        for (int i = 0; i < sd_.length; i++) {
            for (int j = 0; j < sd_[i].length; j++) {

                System.out.print(sd_[i][j] + " ");
            }
            System.out.println();
        }

        //第一行添加文字
        text_give_buttons(button11,sd_[0][0]);
        text_give_buttons(button12,sd_[0][1]);
        text_give_buttons(button13,sd_[0][2]);
        text_give_buttons(button14,sd_[0][3]);
        text_give_buttons(button15,sd_[0][4]);
        text_give_buttons(button16,sd_[0][5]);
        text_give_buttons(button17,sd_[0][6]);
        text_give_buttons(button18,sd_[0][7]);
        text_give_buttons(button19,sd_[0][8]);

        text_give_buttons(button21,sd_[1][0]);
        text_give_buttons(button22,sd_[1][1]);
        text_give_buttons(button23,sd_[1][2]);
        text_give_buttons(button24,sd_[1][3]);
        text_give_buttons(button25,sd_[1][4]);
        text_give_buttons(button26,sd_[1][5]);
        text_give_buttons(button27,sd_[1][6]);
        text_give_buttons(button28,sd_[1][7]);
        text_give_buttons(button29,sd_[1][8]);

        text_give_buttons(button31,sd_[2][0]);
        text_give_buttons(button32,sd_[2][1]);
        text_give_buttons(button33,sd_[2][2]);
        text_give_buttons(button34,sd_[2][3]);
        text_give_buttons(button35,sd_[2][4]);
        text_give_buttons(button36,sd_[2][5]);
        text_give_buttons(button37,sd_[2][6]);
        text_give_buttons(button38,sd_[2][7]);
        text_give_buttons(button39,sd_[2][8]);

        text_give_buttons(button41,sd_[3][0]);
        text_give_buttons(button42,sd_[3][1]);
        text_give_buttons(button43,sd_[3][2]);
        text_give_buttons(button44,sd_[3][3]);
        text_give_buttons(button45,sd_[3][4]);
        text_give_buttons(button46,sd_[3][5]);
        text_give_buttons(button47,sd_[3][6]);
        text_give_buttons(button48,sd_[3][7]);
        text_give_buttons(button49,sd_[3][8]);

        text_give_buttons(button51,sd_[4][0]);
        text_give_buttons(button52,sd_[4][1]);
        text_give_buttons(button53,sd_[4][2]);
        text_give_buttons(button54,sd_[4][3]);
        text_give_buttons(button55,sd_[4][4]);
        text_give_buttons(button56,sd_[4][5]);
        text_give_buttons(button57,sd_[4][6]);
        text_give_buttons(button58,sd_[4][7]);
        text_give_buttons(button59,sd_[4][8]);

        text_give_buttons(button61,sd_[5][0]);
        text_give_buttons(button62,sd_[5][1]);
        text_give_buttons(button63,sd_[5][2]);
        text_give_buttons(button64,sd_[5][3]);
        text_give_buttons(button65,sd_[5][4]);
        text_give_buttons(button66,sd_[5][5]);
        text_give_buttons(button67,sd_[5][6]);
        text_give_buttons(button68,sd_[5][7]);
        text_give_buttons(button69,sd_[5][8]);

        text_give_buttons(button71,sd_[6][0]);
        text_give_buttons(button72,sd_[6][1]);
        text_give_buttons(button73,sd_[6][2]);
        text_give_buttons(button74,sd_[6][3]);
        text_give_buttons(button75,sd_[6][4]);
        text_give_buttons(button76,sd_[6][5]);
        text_give_buttons(button77,sd_[6][6]);
        text_give_buttons(button78,sd_[6][7]);
        text_give_buttons(button79,sd_[6][8]);

        text_give_buttons(button81,sd_[7][0]);
        text_give_buttons(button82,sd_[7][1]);
        text_give_buttons(button83,sd_[7][2]);
        text_give_buttons(button84,sd_[7][3]);
        text_give_buttons(button85,sd_[7][4]);
        text_give_buttons(button86,sd_[7][5]);
        text_give_buttons(button87,sd_[7][6]);
        text_give_buttons(button88,sd_[7][7]);
        text_give_buttons(button89,sd_[7][8]);

        //第九行添加文字
        text_give_buttons(button91,sd_[8][0]);
        text_give_buttons(button92,sd_[8][1]);
        text_give_buttons(button93,sd_[8][2]);
        text_give_buttons(button94,sd_[8][3]);
        text_give_buttons(button95,sd_[8][4]);
        text_give_buttons(button96,sd_[8][5]);
        text_give_buttons(button97,sd_[8][6]);
        text_give_buttons(button98,sd_[8][7]);
        text_give_buttons(button99,sd_[8][8]);

        //第十行没有东西 为空

        //第十一行 就是1~10
        button111.setText("0");
        button112.setText("1");
        button113.setText("2");
        button114.setText("3");
        button115.setText("4");
        button116.setText("5");
        button117.setText("6");
        button118.setText("7");
        button119.setText("8");

        System.out.println("jiyyy");//分隔开

        //解出来数独
        SloveShudu sl = new SloveShudu(sd_);
        sl.resolve();
        sl.Show_answer();

    }


    public static int text_give_buttons(Button button,int a)
    {
        if (a == 0) {
            button.setText("");
        }
        else {
            button.setText(a+"");
            button.setBackgroundColor(0xF0cccccc);
            button.setClickable(false);
        }
        return 0;
    }

    public static  void xixixixixixi(final Button B, final String DATA)
    {
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), button12.getText(), Toast.LENGTH_SHORT).show();
                //shang_fang_wu_pai_cong_data_xie_ru(B,DATA);
                B.setText(DATA);
            }
        });
    }

    public static int  shang_fang_wu_pai_cong_data_xie_ru(Button B,String Str)
    {
        B.setText(Str);
        return 0;
    }

}
