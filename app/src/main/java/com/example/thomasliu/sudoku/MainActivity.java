package com.example.thomasliu.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    String data = "";
    //用户转动数字到button上
    String an = "";
    //所有的结果集合
    String an2 = "";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //所有的button文字集合
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一行的Button
        final Button button11 = (Button) findViewById(R.id.hhh11);
        final Button button12 = (Button) findViewById(R.id.hhh12);
        final Button button13 = (Button) findViewById(R.id.hhh13);
        final Button button14 = (Button) findViewById(R.id.hhh14);
        final Button button15 = (Button) findViewById(R.id.hhh15);
        final Button button16 = (Button) findViewById(R.id.hhh16);
        final Button button17 = (Button) findViewById(R.id.hhh17);
        final Button button18 = (Button) findViewById(R.id.hhh18);
        final Button button19 = (Button) findViewById(R.id.hhh19);

        //第二行的Button
        final Button button21 = (Button) findViewById(R.id.hhh21);
        final Button button22 = (Button) findViewById(R.id.hhh22);
        final Button button23 = (Button) findViewById(R.id.hhh23);
        final Button button24 = (Button) findViewById(R.id.hhh24);
        final Button button25 = (Button) findViewById(R.id.hhh25);
        final Button button26 = (Button) findViewById(R.id.hhh26);
        final Button button27 = (Button) findViewById(R.id.hhh27);
        final Button button28 = (Button) findViewById(R.id.hhh28);
        final Button button29 = (Button) findViewById(R.id.hhh29);

        final Button button31 = (Button) findViewById(R.id.hhh31);
        final Button button32 = (Button) findViewById(R.id.hhh32);
        final Button button33 = (Button) findViewById(R.id.hhh33);
        final Button button34 = (Button) findViewById(R.id.hhh34);
        final Button button35 = (Button) findViewById(R.id.hhh35);
        final Button button36 = (Button) findViewById(R.id.hhh36);
        final Button button37 = (Button) findViewById(R.id.hhh37);
        final Button button38 = (Button) findViewById(R.id.hhh38);
        final Button button39 = (Button) findViewById(R.id.hhh39);

        final Button button41 = (Button) findViewById(R.id.hhh41);
        final Button button42 = (Button) findViewById(R.id.hhh42);
        final Button button43 = (Button) findViewById(R.id.hhh43);
        final Button button44 = (Button) findViewById(R.id.hhh44);
        final Button button45 = (Button) findViewById(R.id.hhh45);
        final Button button46 = (Button) findViewById(R.id.hhh46);
        final Button button47 = (Button) findViewById(R.id.hhh47);
        final Button button48 = (Button) findViewById(R.id.hhh48);
        final Button button49 = (Button) findViewById(R.id.hhh49);

        final Button button51 = (Button) findViewById(R.id.hhh51);
        final Button button52 = (Button) findViewById(R.id.hhh52);
        final Button button53 = (Button) findViewById(R.id.hhh53);
        final Button button54 = (Button) findViewById(R.id.hhh54);
        final Button button55 = (Button) findViewById(R.id.hhh55);
        final Button button56 = (Button) findViewById(R.id.hhh56);
        final Button button57 = (Button) findViewById(R.id.hhh57);
        final Button button58 = (Button) findViewById(R.id.hhh58);
        final Button button59 = (Button) findViewById(R.id.hhh59);

        final Button button61 = (Button) findViewById(R.id.hhh61);
        final Button button62 = (Button) findViewById(R.id.hhh62);
        final Button button63 = (Button) findViewById(R.id.hhh63);
        final Button button64 = (Button) findViewById(R.id.hhh64);
        final Button button65 = (Button) findViewById(R.id.hhh65);
        final Button button66 = (Button) findViewById(R.id.hhh66);
        final Button button67 = (Button) findViewById(R.id.hhh67);
        final Button button68 = (Button) findViewById(R.id.hhh68);
        final Button button69 = (Button) findViewById(R.id.hhh69);

        final Button button71 = (Button) findViewById(R.id.hhh71);
        final Button button72 = (Button) findViewById(R.id.hhh72);
        final Button button73 = (Button) findViewById(R.id.hhh73);
        final Button button74 = (Button) findViewById(R.id.hhh74);
        final Button button75 = (Button) findViewById(R.id.hhh75);
        final Button button76 = (Button) findViewById(R.id.hhh76);
        final Button button77 = (Button) findViewById(R.id.hhh77);
        final Button button78 = (Button) findViewById(R.id.hhh78);
        final Button button79 = (Button) findViewById(R.id.hhh79);

        final Button button81 = (Button) findViewById(R.id.hhh81);
        final Button button82 = (Button) findViewById(R.id.hhh82);
        final Button button83 = (Button) findViewById(R.id.hhh83);
        final Button button84 = (Button) findViewById(R.id.hhh84);
        final Button button85 = (Button) findViewById(R.id.hhh85);
        final Button button86 = (Button) findViewById(R.id.hhh86);
        final Button button87 = (Button) findViewById(R.id.hhh87);
        final Button button88 = (Button) findViewById(R.id.hhh88);
        final Button button89 = (Button) findViewById(R.id.hhh89);

        final Button button91 = (Button) findViewById(R.id.hhh91);
        final Button button92 = (Button) findViewById(R.id.hhh92);
        final Button button93 = (Button) findViewById(R.id.hhh93);
        final Button button94 = (Button) findViewById(R.id.hhh94);
        final Button button95 = (Button) findViewById(R.id.hhh95);
        final Button button96 = (Button) findViewById(R.id.hhh96);
        final Button button97 = (Button) findViewById(R.id.hhh97);
        final Button button98 = (Button) findViewById(R.id.hhh98);
        final Button button99 = (Button) findViewById(R.id.hhh99);

        //第十一行的Button
        final Button button111 = (Button) findViewById(R.id.hhh111);
        final Button button112 = (Button) findViewById(R.id.hhh112);
        final Button button113 = (Button) findViewById(R.id.hhh113);
        final Button button114 = (Button) findViewById(R.id.hhh114);
        final Button button115 = (Button) findViewById(R.id.hhh115);
        final Button button116 = (Button) findViewById(R.id.hhh116);
        final Button button117 = (Button) findViewById(R.id.hhh117);
        final Button button118 = (Button) findViewById(R.id.hhh118);
        final Button button119 = (Button) findViewById(R.id.hhh119);

        final Button buttonrestart = (Button) findViewById(R.id.restart);

        assert buttonrestart != null;
        buttonrestart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });


        assert button11 != null;
        button11.setOnClickListener(clickListener);
        assert button21 != null;
        button21.setOnClickListener(clickListener);
        assert button31 != null;
        button31.setOnClickListener(clickListener);
        assert button41 != null;
        button41.setOnClickListener(clickListener);
        assert button51 != null;
        button51.setOnClickListener(clickListener);
        assert button61 != null;
        button61.setOnClickListener(clickListener);
        assert button71 != null;
        button71.setOnClickListener(clickListener);
        assert button81 != null;
        button81.setOnClickListener(clickListener);
        assert button91 != null;
        button91.setOnClickListener(clickListener);

        assert button12 != null;
        button12.setOnClickListener(clickListener);
        assert button22 != null;
        button22.setOnClickListener(clickListener);
        assert button32 != null;
        button32.setOnClickListener(clickListener);
        assert button42 != null;
        button42.setOnClickListener(clickListener);
        assert button52 != null;
        button52.setOnClickListener(clickListener);
        assert button62 != null;
        button62.setOnClickListener(clickListener);
        assert button72 != null;
        button72.setOnClickListener(clickListener);
        assert button82 != null;
        button82.setOnClickListener(clickListener);
        assert button92 != null;
        button92.setOnClickListener(clickListener);
        ////////////3333333333333333333333333333333333333333////////////////////
        assert button13 != null;
        button13.setOnClickListener(clickListener);
        assert button23 != null;
        button23.setOnClickListener(clickListener);
        assert button33 != null;
        button33.setOnClickListener(clickListener);
        assert button43 != null;
        button43.setOnClickListener(clickListener);
        assert button53 != null;
        button53.setOnClickListener(clickListener);
        assert button63 != null;
        button63.setOnClickListener(clickListener);
        assert button73 != null;
        button73.setOnClickListener(clickListener);
        assert button83 != null;
        button83.setOnClickListener(clickListener);
        assert button93 != null;
        button93.setOnClickListener(clickListener);

        assert button14 != null;
        button14.setOnClickListener(clickListener);
        assert button24 != null;
        button24.setOnClickListener(clickListener);
        assert button34 != null;
        button34.setOnClickListener(clickListener);
        assert button44 != null;
        button44.setOnClickListener(clickListener);
        assert button54 != null;
        button54.setOnClickListener(clickListener);
        assert button64 != null;
        button64.setOnClickListener(clickListener);
        assert button74 != null;
        button74.setOnClickListener(clickListener);
        assert button84 != null;
        button84.setOnClickListener(clickListener);
        assert button94 != null;
        button94.setOnClickListener(clickListener);

        assert button15 != null;
        button15.setOnClickListener(clickListener);
        assert button25 != null;
        button25.setOnClickListener(clickListener);
        assert button35 != null;
        button35.setOnClickListener(clickListener);
        assert button45 != null;
        button45.setOnClickListener(clickListener);
        assert button55 != null;
        button55.setOnClickListener(clickListener);
        assert button65 != null;
        button65.setOnClickListener(clickListener);
        assert button75 != null;
        button75.setOnClickListener(clickListener);
        assert button85 != null;
        button85.setOnClickListener(clickListener);
        assert button95 != null;
        button95.setOnClickListener(clickListener);

        assert button16 != null;
        button16.setOnClickListener(clickListener);
        assert button26 != null;
        button26.setOnClickListener(clickListener);
        assert button36 != null;
        button36.setOnClickListener(clickListener);
        assert button46 != null;
        button46.setOnClickListener(clickListener);
        assert button56 != null;
        button56.setOnClickListener(clickListener);
        assert button66 != null;
        button66.setOnClickListener(clickListener);
        assert button76 != null;
        button76.setOnClickListener(clickListener);
        assert button86 != null;
        button86.setOnClickListener(clickListener);
        assert button96 != null;
        button96.setOnClickListener(clickListener);

        assert button17 != null;
        button17.setOnClickListener(clickListener);
        assert button27 != null;
        button27.setOnClickListener(clickListener);
        assert button37 != null;
        button37.setOnClickListener(clickListener);
        assert button47 != null;
        button47.setOnClickListener(clickListener);
        assert button57 != null;
        button57.setOnClickListener(clickListener);
        assert button67 != null;
        button67.setOnClickListener(clickListener);
        assert button77 != null;
        button77.setOnClickListener(clickListener);
        assert button87 != null;
        button87.setOnClickListener(clickListener);
        assert button97 != null;
        button97.setOnClickListener(clickListener);

        assert button18 != null;
        button18.setOnClickListener(clickListener);
        assert button28 != null;
        button28.setOnClickListener(clickListener);
        assert button38 != null;
        button38.setOnClickListener(clickListener);
        assert button48 != null;
        button48.setOnClickListener(clickListener);
        assert button58 != null;
        button58.setOnClickListener(clickListener);
        assert button68 != null;
        button68.setOnClickListener(clickListener);
        assert button78 != null;
        button78.setOnClickListener(clickListener);
        assert button88 != null;
        button88.setOnClickListener(clickListener);
        assert button98 != null;
        button98.setOnClickListener(clickListener);

        assert button19 != null;
        button19.setOnClickListener(clickListener);
        assert button29 != null;
        button29.setOnClickListener(clickListener);
        assert button39 != null;
        button39.setOnClickListener(clickListener);
        assert button49 != null;
        button49.setOnClickListener(clickListener);
        assert button59 != null;
        button59.setOnClickListener(clickListener);
        assert button69 != null;
        button69.setOnClickListener(clickListener);
        assert button79 != null;
        button79.setOnClickListener(clickListener);
        assert button89 != null;
        button89.setOnClickListener(clickListener);
        assert button99 != null;
        button99.setOnClickListener(clickListener);

        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////

        assert button111 != null;
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button111.getText() != null) {
                    data = (String) button111.getText();
                }
            }
        });

        assert button112 != null;
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button112.getText() != null) {
                    data = (String) button112.getText();
                }
            }
        });

        assert button113 != null;
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button113.getText() != null) {
                    data = (String) button113.getText();
                }
            }
        });

        assert button114 != null;
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button114.getText() != null) {
                    data = (String) button114.getText();
                }
            }
        });

        assert button115 != null;
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button115.getText() != null) {
                    data = (String) button115.getText();
                }
            }
        });

        assert button116 != null;
        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button116.getText() != null) {
                    data = (String) button116.getText();
                }
            }
        });

        assert button117 != null;
        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button117.getText() != null) {
                    data = (String) button117.getText();
                }
            }
        });

        assert button118 != null;
        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button118.getText() != null) {
                    data = (String) button118.getText();
                }
            }
        });

        assert button119 != null;
        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button119.getText() != null) {
                    data = (String) button119.getText();
                }
            }
        });

        //所有button文字的添加
        Addshudu sd = new Addshudu();
        int[][] sd_ = sd.add(2);
        // 0不算数独 1简单 2中等 3难 >=4不算数独
        //用数组存储的
        for (int[] aSd_ : sd_) {
            for (int anASd_ : aSd_) {

                System.out.print(anASd_ + " ");
            }
            System.out.println();
        }

        //第一行添加文字
        text_give_buttons(button11, sd_[0][0]);
        text_give_buttons(button12, sd_[0][1]);
        text_give_buttons(button13, sd_[0][2]);
        text_give_buttons(button14, sd_[0][3]);
        text_give_buttons(button15, sd_[0][4]);
        text_give_buttons(button16, sd_[0][5]);
        text_give_buttons(button17, sd_[0][6]);
        text_give_buttons(button18, sd_[0][7]);
        text_give_buttons(button19, sd_[0][8]);

        text_give_buttons(button21, sd_[1][0]);
        text_give_buttons(button22, sd_[1][1]);
        text_give_buttons(button23, sd_[1][2]);
        text_give_buttons(button24, sd_[1][3]);
        text_give_buttons(button25, sd_[1][4]);
        text_give_buttons(button26, sd_[1][5]);
        text_give_buttons(button27, sd_[1][6]);
        text_give_buttons(button28, sd_[1][7]);
        text_give_buttons(button29, sd_[1][8]);

        text_give_buttons(button31, sd_[2][0]);
        text_give_buttons(button32, sd_[2][1]);
        text_give_buttons(button33, sd_[2][2]);
        text_give_buttons(button34, sd_[2][3]);
        text_give_buttons(button35, sd_[2][4]);
        text_give_buttons(button36, sd_[2][5]);
        text_give_buttons(button37, sd_[2][6]);
        text_give_buttons(button38, sd_[2][7]);
        text_give_buttons(button39, sd_[2][8]);

        text_give_buttons(button41, sd_[3][0]);
        text_give_buttons(button42, sd_[3][1]);
        text_give_buttons(button43, sd_[3][2]);
        text_give_buttons(button44, sd_[3][3]);
        text_give_buttons(button45, sd_[3][4]);
        text_give_buttons(button46, sd_[3][5]);
        text_give_buttons(button47, sd_[3][6]);
        text_give_buttons(button48, sd_[3][7]);
        text_give_buttons(button49, sd_[3][8]);

        text_give_buttons(button51, sd_[4][0]);
        text_give_buttons(button52, sd_[4][1]);
        text_give_buttons(button53, sd_[4][2]);
        text_give_buttons(button54, sd_[4][3]);
        text_give_buttons(button55, sd_[4][4]);
        text_give_buttons(button56, sd_[4][5]);
        text_give_buttons(button57, sd_[4][6]);
        text_give_buttons(button58, sd_[4][7]);
        text_give_buttons(button59, sd_[4][8]);

        text_give_buttons(button61, sd_[5][0]);
        text_give_buttons(button62, sd_[5][1]);
        text_give_buttons(button63, sd_[5][2]);
        text_give_buttons(button64, sd_[5][3]);
        text_give_buttons(button65, sd_[5][4]);
        text_give_buttons(button66, sd_[5][5]);
        text_give_buttons(button67, sd_[5][6]);
        text_give_buttons(button68, sd_[5][7]);
        text_give_buttons(button69, sd_[5][8]);

        text_give_buttons(button71, sd_[6][0]);
        text_give_buttons(button72, sd_[6][1]);
        text_give_buttons(button73, sd_[6][2]);
        text_give_buttons(button74, sd_[6][3]);
        text_give_buttons(button75, sd_[6][4]);
        text_give_buttons(button76, sd_[6][5]);
        text_give_buttons(button77, sd_[6][6]);
        text_give_buttons(button78, sd_[6][7]);
        text_give_buttons(button79, sd_[6][8]);

        text_give_buttons(button81, sd_[7][0]);
        text_give_buttons(button82, sd_[7][1]);
        text_give_buttons(button83, sd_[7][2]);
        text_give_buttons(button84, sd_[7][3]);
        text_give_buttons(button85, sd_[7][4]);
        text_give_buttons(button86, sd_[7][5]);
        text_give_buttons(button87, sd_[7][6]);
        text_give_buttons(button88, sd_[7][7]);
        text_give_buttons(button89, sd_[7][8]);

        //第九行添加文字
        text_give_buttons(button91, sd_[8][0]);
        text_give_buttons(button92, sd_[8][1]);
        text_give_buttons(button93, sd_[8][2]);
        text_give_buttons(button94, sd_[8][3]);
        text_give_buttons(button95, sd_[8][4]);
        text_give_buttons(button96, sd_[8][5]);
        text_give_buttons(button97, sd_[8][6]);
        text_give_buttons(button98, sd_[8][7]);
        text_give_buttons(button99, sd_[8][8]);

        //第十行没有东西 为空

        //第十一行 就是1~10
        button111.setText("1");
        button112.setText("2");
        button113.setText("3");
        button114.setText("4");
        button115.setText("5");
        button116.setText("6");
        button117.setText("7");
        button118.setText("8");
        button119.setText("9");

        System.out.println("jiyyy");//分隔开

        //解出来数独
        SloveShudu sl = new SloveShudu(sd_);
        sl.resolve();
        String answer = sl.Show_answer();
        an = answer;
        System.out.println(answer);

        System.out.println("getTexts");

        System.out.println(getTexts());

    }


    public static int text_give_buttons(Button button, int a) {
        if (a == 0) {
            button.setText("");
        } else {
            button.setText(a);
            button.setBackgroundColor(0xF0cccccc);
            button.setClickable(false);
        }
        return 0;
    }


    //获取所有button文字集合;
    private String getTexts() {

        String aa = "";
        ///////////11111111111111111111

        Button B1 = (Button) findViewById(R.id.hhh11);
        assert B1 != null;
        aa = aa + (B1.getText() == "" ? "0" : B1.getText());
        Button B2 = (Button) findViewById(R.id.hhh12);
        assert B2 != null;
        aa = aa + (B2.getText() == "" ? "0" : B2.getText());
        Button B3 = (Button) findViewById(R.id.hhh13);
        assert B3 != null;
        aa = aa + (B3.getText() == "" ? "0" : B3.getText());
        Button B4 = (Button) findViewById(R.id.hhh14);
        assert B4 != null;
        aa = aa + (B4.getText() == "" ? "0" : B4.getText());
        Button B5 = (Button) findViewById(R.id.hhh15);
        assert B5 != null;
        aa = aa + (B5.getText() == "" ? "0" : B5.getText());
        Button B6 = (Button) findViewById(R.id.hhh16);
        assert B6 != null;
        aa = aa + (B6.getText() == "" ? "0" : B6.getText());
        Button B7 = (Button) findViewById(R.id.hhh17);
        assert B7 != null;
        aa = aa + (B7.getText() == "" ? "0" : B7.getText());
        Button B8 = (Button) findViewById(R.id.hhh18);
        assert B8 != null;
        aa = aa + (B8.getText() == "" ? "0" : B8.getText());
        Button B9 = (Button) findViewById(R.id.hhh19);
        assert B9 != null;
        aa = aa + (B9.getText() == "" ? "0" : B9.getText());
        //222222222222222222
        Button B11 = (Button) findViewById(R.id.hhh21);
        assert B11 != null;
        aa = aa + (B11.getText() == "" ? "0" : B11.getText());
        Button B22 = (Button) findViewById(R.id.hhh22);
        assert B22 != null;
        aa = aa + (B22.getText() == "" ? "0" : B22.getText());
        Button B33 = (Button) findViewById(R.id.hhh23);
        assert B33 != null;
        aa = aa + (B33.getText() == "" ? "0" : B33.getText());
        Button B44 = (Button) findViewById(R.id.hhh24);
        assert B44 != null;
        aa = aa + (B44.getText() == "" ? "0" : B44.getText());
        Button B55 = (Button) findViewById(R.id.hhh25);
        assert B55 != null;
        aa = aa + (B55.getText() == "" ? "0" : B55.getText());
        Button B66 = (Button) findViewById(R.id.hhh26);
        assert B66 != null;
        aa = aa + (B66.getText() == "" ? "0" : B66.getText());
        Button B77 = (Button) findViewById(R.id.hhh27);
        assert B77 != null;
        aa = aa + (B77.getText() == "" ? "0" : B77.getText());
        Button B88 = (Button) findViewById(R.id.hhh28);
        assert B88 != null;
        aa = aa + (B88.getText() == "" ? "0" : B88.getText());
        Button B99 = (Button) findViewById(R.id.hhh29);
        assert B99 != null;
        aa = aa + (B99.getText() == "" ? "0" : B99.getText());
        //333333333333333333
        Button B1a = (Button) findViewById(R.id.hhh31);
        assert B1a != null;
        aa = aa + (B1a.getText() == "" ? "0" : B1a.getText());
        Button B2a = (Button) findViewById(R.id.hhh32);
        assert B2a != null;
        aa = aa + (B2a.getText() == "" ? "0" : B2a.getText());
        Button B3a = (Button) findViewById(R.id.hhh33);
        assert B3a != null;
        aa = aa + (B3a.getText() == "" ? "0" : B3a.getText());
        Button B4a = (Button) findViewById(R.id.hhh34);
        assert B4a != null;
        aa = aa + (B4a.getText() == "" ? "0" : B4a.getText());
        Button B5a = (Button) findViewById(R.id.hhh35);
        assert B5a != null;
        aa = aa + (B5a.getText() == "" ? "0" : B5a.getText());
        Button B6a = (Button) findViewById(R.id.hhh36);
        assert B6a != null;
        aa = aa + (B6a.getText() == "" ? "0" : B6a.getText());
        Button B7a = (Button) findViewById(R.id.hhh37);
        assert B7a != null;
        aa = aa + (B7a.getText() == "" ? "0" : B7a.getText());
        Button B8a = (Button) findViewById(R.id.hhh38);
        assert B8a != null;
        aa = aa + (B8a.getText() == "" ? "0" : B8a.getText());
        Button B9a = (Button) findViewById(R.id.hhh39);
        assert B9a != null;
        aa = aa + (B9a.getText() == "" ? "0" : B9a.getText());
        //44444444444444
        Button B1s = (Button) findViewById(R.id.hhh41);
        assert B1s != null;
        aa = aa + (B1s.getText() == "" ? "0" : B1s.getText());
        Button B2s = (Button) findViewById(R.id.hhh42);
        assert B2s != null;
        aa = aa + (B2s.getText() == "" ? "0" : B2s.getText());
        Button B3s = (Button) findViewById(R.id.hhh43);
        assert B3s != null;
        aa = aa + (B3s.getText() == "" ? "0" : B3s.getText());
        Button B4s = (Button) findViewById(R.id.hhh44);
        assert B4s != null;
        aa = aa + (B4s.getText() == "" ? "0" : B4s.getText());
        Button B5s = (Button) findViewById(R.id.hhh45);
        assert B5s != null;
        aa = aa + (B5s.getText() == "" ? "0" : B5s.getText());
        Button B6s = (Button) findViewById(R.id.hhh46);
        assert B6s != null;
        aa = aa + (B6s.getText() == "" ? "0" : B6s.getText());
        Button B7s = (Button) findViewById(R.id.hhh47);
        assert B7s != null;
        aa = aa + (B7s.getText() == "" ? "0" : B7s.getText());
        Button B8s = (Button) findViewById(R.id.hhh48);
        assert B8s != null;
        aa = aa + (B8s.getText() == "" ? "0" : B8s.getText());
        Button B9s = (Button) findViewById(R.id.hhh49);
        assert B9s != null;
        aa = aa + (B9s.getText() == "" ? "0" : B9s.getText());
        ////555555555555555555
        Button B1w = (Button) findViewById(R.id.hhh51);
        assert B1w != null;
        aa = aa + (B1w.getText() == "" ? "0" : B1w.getText());
        Button B2w = (Button) findViewById(R.id.hhh52);
        assert B2w != null;
        aa = aa + (B2w.getText() == "" ? "0" : B2w.getText());
        Button B3w = (Button) findViewById(R.id.hhh53);
        assert B3w != null;
        aa = aa + (B3w.getText() == "" ? "0" : B3w.getText());
        Button B4w = (Button) findViewById(R.id.hhh54);
        assert B4w != null;
        aa = aa + (B4w.getText() == "" ? "0" : B4w.getText());
        Button B5w = (Button) findViewById(R.id.hhh55);
        assert B5w != null;
        aa = aa + (B5w.getText() == "" ? "0" : B5w.getText());
        Button B6w = (Button) findViewById(R.id.hhh56);
        assert B6w != null;
        aa = aa + (B6w.getText() == "" ? "0" : B6w.getText());
        Button B7w = (Button) findViewById(R.id.hhh57);
        assert B7w != null;
        aa = aa + (B7w.getText() == "" ? "0" : B7w.getText());
        Button B8w = (Button) findViewById(R.id.hhh58);
        assert B8w != null;
        aa = aa + (B8w.getText() == "" ? "0" : B8w.getText());
        Button B9w = (Button) findViewById(R.id.hhh59);
        assert B9w != null;
        aa = aa + (B9w.getText() == "" ? "0" : B9w.getText());

        //666666666666666666666
        Button B1l = (Button) findViewById(R.id.hhh61);
        assert B1l != null;
        aa = aa + (B1l.getText() == "" ? "0" : B1l.getText());
        Button B2l = (Button) findViewById(R.id.hhh62);
        assert B2l != null;
        aa = aa + (B2l.getText() == "" ? "0" : B2l.getText());
        Button B3l = (Button) findViewById(R.id.hhh63);
        assert B3l != null;
        aa = aa + (B3l.getText() == "" ? "0" : B3l.getText());
        Button B4l = (Button) findViewById(R.id.hhh64);
        assert B4l != null;
        aa = aa + (B4l.getText() == "" ? "0" : B4l.getText());
        Button B5l = (Button) findViewById(R.id.hhh65);
        assert B5l != null;
        aa = aa + (B5l.getText() == "" ? "0" : B5l.getText());
        Button B6l = (Button) findViewById(R.id.hhh66);
        assert B6l != null;
        aa = aa + (B6l.getText() == "" ? "0" : B6l.getText());
        Button B7l = (Button) findViewById(R.id.hhh67);
        assert B7l != null;
        aa = aa + (B7l.getText() == "" ? "0" : B7l.getText());
        Button B8l = (Button) findViewById(R.id.hhh68);
        assert B8l != null;
        aa = aa + (B8l.getText() == "" ? "0" : B8l.getText());
        Button B9l = (Button) findViewById(R.id.hhh69);
        assert B9l != null;
        aa = aa + (B9l.getText() == "" ? "0" : B9l.getText());
        //7777777777777777
        Button B1q = (Button) findViewById(R.id.hhh71);
        assert B1q != null;
        aa = aa + (B1q.getText() == "" ? "0" : B1q.getText());
        Button B2q = (Button) findViewById(R.id.hhh72);
        assert B2q != null;
        aa = aa + (B2q.getText() == "" ? "0" : B2q.getText());
        Button B3q = (Button) findViewById(R.id.hhh73);
        assert B3q != null;
        aa = aa + (B3q.getText() == "" ? "0" : B3q.getText());
        Button B4q = (Button) findViewById(R.id.hhh74);
        assert B4q != null;
        aa = aa + (B4q.getText() == "" ? "0" : B4q.getText());
        Button B5q = (Button) findViewById(R.id.hhh75);
        assert B5q != null;
        aa = aa + (B5q.getText() == "" ? "0" : B5q.getText());
        Button B6q = (Button) findViewById(R.id.hhh76);
        assert B6q != null;
        aa = aa + (B6q.getText() == "" ? "0" : B6q.getText());
        Button B7q = (Button) findViewById(R.id.hhh77);
        assert B7q != null;
        aa = aa + (B7q.getText() == "" ? "0" : B7q.getText());
        Button B8q = (Button) findViewById(R.id.hhh78);
        assert B8q != null;
        aa = aa + (B8q.getText() == "" ? "0" : B8q.getText());
        Button B9q = (Button) findViewById(R.id.hhh79);
        assert B9q != null;
        aa = aa + (B9q.getText() == "" ? "0" : B9q.getText());
        //88888888888888888888888
        Button B1b = (Button) findViewById(R.id.hhh81);
        assert B1b != null;
        aa = aa + (B1b.getText() == "" ? "0" : B1b.getText());
        Button B2b = (Button) findViewById(R.id.hhh82);
        assert B2b != null;
        aa = aa + (B2b.getText() == "" ? "0" : B2b.getText());
        Button B3b = (Button) findViewById(R.id.hhh83);
        assert B3b != null;
        aa = aa + (B3b.getText() == "" ? "0" : B3b.getText());
        Button B4b = (Button) findViewById(R.id.hhh84);
        assert B4b != null;
        aa = aa + (B4b.getText() == "" ? "0" : B4b.getText());
        Button Bb5 = (Button) findViewById(R.id.hhh85);
        assert Bb5 != null;
        aa = aa + (Bb5.getText() == "" ? "0" : Bb5.getText());
        Button B6b = (Button) findViewById(R.id.hhh86);
        assert B6b != null;
        aa = aa + (B6b.getText() == "" ? "0" : B6b.getText());
        Button B7b = (Button) findViewById(R.id.hhh87);
        assert B7b != null;
        aa = aa + (B7b.getText() == "" ? "0" : B7b.getText());
        Button B8b = (Button) findViewById(R.id.hhh88);
        assert B8b != null;
        aa = aa + (B8b.getText() == "" ? "0" : B8b.getText());
        Button B9b = (Button) findViewById(R.id.hhh89);
        assert B9b != null;
        aa = aa + (B9b.getText() == "" ? "0" : B9b.getText());
        //9999999999999999
        Button B1j = (Button) findViewById(R.id.hhh91);
        assert B1j != null;
        aa = aa + (B1j.getText() == "" ? "0" : B1j.getText());
        Button B2j = (Button) findViewById(R.id.hhh92);
        assert B2j != null;
        aa = aa + (B2j.getText() == "" ? "0" : B2j.getText());
        Button B3j = (Button) findViewById(R.id.hhh93);
        assert B3j != null;
        aa = aa + (B3j.getText() == "" ? "0" : B3j.getText());
        Button B4j = (Button) findViewById(R.id.hhh94);
        assert B4j != null;
        aa = aa + (B4j.getText() == "" ? "0" : B4j.getText());
        Button B5j = (Button) findViewById(R.id.hhh95);
        assert B5j != null;
        aa = aa + (B5j.getText() == "" ? "0" : B5j.getText());
        Button B6j = (Button) findViewById(R.id.hhh96);
        assert B6j != null;
        aa = aa + (B6j.getText() == "" ? "0" : B6j.getText());
        Button B7j = (Button) findViewById(R.id.hhh97);
        assert B7j != null;
        aa = aa + (B7j.getText() == "" ? "0" : B7j.getText());
        Button B8j = (Button) findViewById(R.id.hhh98);
        assert B8j != null;
        aa = aa + (B8j.getText() == "" ? "0" : B8j.getText());
        Button B9j = (Button) findViewById(R.id.hhh99);
        assert B9j != null;
        aa = aa + (B9j.getText() == "" ? "0" : B9j.getText());

        return aa;

    }

    //panding
    public void do0() {
        an2 = getTexts();
        System.out.println("       ");
        System.out.println(an);
        System.out.println(an2);
        if (an.equals(an2)) {
            Toast.makeText(getApplicationContext(), "成功", Toast.LENGTH_SHORT).show();
            //重新开始
            refresh();
        }
    }

    private void refresh() {
        finish();
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
//        onCreate(null);
    }


    private View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.hhh11:
                    Button b2 = (Button) findViewById(R.id.hhh11);
                    assert b2 != null;
                    b2.setText(data);
                    do0();
                    break;
                case R.id.hhh12:
                    Button b3 = (Button) findViewById(R.id.hhh12);
                    assert b3 != null;
                    b3.setText(data);
                    do0();
                    break;
                case R.id.hhh13:
                    Button b4 = (Button) findViewById(R.id.hhh13);
                    assert b4 != null;
                    b4.setText(data);
                    do0();
                    break;
                case R.id.hhh14:
                    Button b5 = (Button) findViewById(R.id.hhh14);
                    assert b5 != null;
                    b5.setText(data);
                    do0();
                    break;
                case R.id.hhh15:
                    Button b6 = (Button) findViewById(R.id.hhh15);
                    assert b6 != null;
                    b6.setText(data);
                    do0();
                    break;
                case R.id.hhh16:
                    Button b7 = (Button) findViewById(R.id.hhh16);
                    assert b7 != null;
                    b7.setText(data);
                    do0();
                    break;
                case R.id.hhh17:
                    Button b8 = (Button) findViewById(R.id.hhh17);
                    assert b8 != null;
                    b8.setText(data);
                    do0();
                    break;
                case R.id.hhh18:
                    Button b9 = (Button) findViewById(R.id.hhh18);
                    assert b9 != null;
                    b9.setText(data);
                    do0();
                    break;
                case R.id.hhh19:
                    Button b10 = (Button) findViewById(R.id.hhh19);
                    assert b10 != null;
                    b10.setText(data);
                    do0();
                    break;
                case R.id.hhh21:
                    Button b12 = (Button) findViewById(R.id.hhh21);
                    assert b12 != null;
                    b12.setText(data);
                    do0();
                    break;
                case R.id.hhh22:
                    Button b13 = (Button) findViewById(R.id.hhh22);
                    assert b13 != null;
                    b13.setText(data);
                    do0();
                    break;
                case R.id.hhh23:
                    Button b14 = (Button) findViewById(R.id.hhh23);
                    assert b14 != null;
                    b14.setText(data);
                    do0();
                    break;
                case R.id.hhh24:
                    Button b15 = (Button) findViewById(R.id.hhh24);
                    assert b15 != null;
                    b15.setText(data);
                    do0();
                    break;
                case R.id.hhh25:
                    Button b16 = (Button) findViewById(R.id.hhh25);
                    assert b16 != null;
                    b16.setText(data);
                    do0();
                    break;
                case R.id.hhh26:
                    Button b17 = (Button) findViewById(R.id.hhh26);
                    assert b17 != null;
                    b17.setText(data);
                    do0();
                    break;
                case R.id.hhh27:
                    Button b18 = (Button) findViewById(R.id.hhh27);
                    assert b18 != null;
                    b18.setText(data);
                    do0();
                    break;
                case R.id.hhh28:
                    Button b19 = (Button) findViewById(R.id.hhh28);
                    assert b19 != null;
                    b19.setText(data);
                    do0();
                    break;
                case R.id.hhh29:
                    Button b20 = (Button) findViewById(R.id.hhh29);
                    assert b20 != null;
                    b20.setText(data);
                    do0();
                    break;
                case R.id.hhh31:
                    Button b22 = (Button) findViewById(R.id.hhh31);
                    assert b22 != null;
                    b22.setText(data);
                    do0();
                    break;
                case R.id.hhh32:
                    Button b23 = (Button) findViewById(R.id.hhh32);
                    assert b23 != null;
                    b23.setText(data);
                    do0();
                    break;
                case R.id.hhh33:
                    Button b24 = (Button) findViewById(R.id.hhh33);
                    assert b24 != null;
                    b24.setText(data);
                    do0();
                    break;
                case R.id.hhh34:
                    Button b25 = (Button) findViewById(R.id.hhh34);
                    assert b25 != null;
                    b25.setText(data);
                    do0();
                    break;
                case R.id.hhh35:
                    Button b26 = (Button) findViewById(R.id.hhh35);
                    assert b26 != null;
                    b26.setText(data);
                    do0();
                    break;
                case R.id.hhh36:
                    Button b27 = (Button) findViewById(R.id.hhh36);
                    assert b27 != null;
                    b27.setText(data);
                    do0();
                    break;
                case R.id.hhh37:
                    Button b28 = (Button) findViewById(R.id.hhh37);
                    assert b28 != null;
                    b28.setText(data);
                    do0();
                    break;
                case R.id.hhh38:
                    Button b29 = (Button) findViewById(R.id.hhh38);
                    assert b29 != null;
                    b29.setText(data);
                    do0();
                    break;
                case R.id.hhh39:
                    Button b30 = (Button) findViewById(R.id.hhh39);
                    assert b30 != null;
                    b30.setText(data);
                    do0();
                    break;
                case R.id.hhh41:
                    Button b32 = (Button) findViewById(R.id.hhh41);
                    assert b32 != null;
                    b32.setText(data);
                    do0();
                    break;
                case R.id.hhh42:
                    Button b33 = (Button) findViewById(R.id.hhh42);
                    assert b33 != null;
                    b33.setText(data);
                    do0();
                    break;
                case R.id.hhh43:
                    Button b34 = (Button) findViewById(R.id.hhh43);
                    assert b34 != null;
                    b34.setText(data);
                    do0();
                    break;
                case R.id.hhh44:
                    Button b35 = (Button) findViewById(R.id.hhh44);
                    assert b35 != null;
                    b35.setText(data);
                    do0();
                    break;
                case R.id.hhh45:
                    Button b36 = (Button) findViewById(R.id.hhh45);
                    assert b36 != null;
                    b36.setText(data);
                    do0();
                    break;
                case R.id.hhh46:
                    Button b37 = (Button) findViewById(R.id.hhh46);
                    assert b37 != null;
                    b37.setText(data);
                    do0();
                    break;
                case R.id.hhh47:
                    Button b38 = (Button) findViewById(R.id.hhh47);
                    assert b38 != null;
                    b38.setText(data);
                    do0();
                    break;
                case R.id.hhh48:
                    Button b39 = (Button) findViewById(R.id.hhh48);
                    assert b39 != null;
                    b39.setText(data);
                    do0();
                    break;
                case R.id.hhh49:
                    Button b40 = (Button) findViewById(R.id.hhh49);
                    assert b40 != null;
                    b40.setText(data);
                    do0();
                    break;
                case R.id.hhh51:
                    Button b42 = (Button) findViewById(R.id.hhh51);
                    assert b42 != null;
                    b42.setText(data);
                    do0();
                    break;
                case R.id.hhh52:
                    Button b43 = (Button) findViewById(R.id.hhh52);
                    assert b43 != null;
                    b43.setText(data);
                    do0();
                    break;
                case R.id.hhh53:
                    Button b44 = (Button) findViewById(R.id.hhh53);
                    assert b44 != null;
                    b44.setText(data);
                    do0();
                    break;
                case R.id.hhh54:
                    Button b45 = (Button) findViewById(R.id.hhh54);
                    assert b45 != null;
                    b45.setText(data);
                    do0();
                    break;
                case R.id.hhh55:
                    Button b46 = (Button) findViewById(R.id.hhh55);
                    assert b46 != null;
                    b46.setText(data);
                    do0();
                    break;
                case R.id.hhh56:
                    Button b47 = (Button) findViewById(R.id.hhh56);
                    assert b47 != null;
                    b47.setText(data);
                    do0();
                    break;
                case R.id.hhh57:
                    Button b48 = (Button) findViewById(R.id.hhh57);
                    assert b48 != null;
                    b48.setText(data);
                    do0();
                    break;
                case R.id.hhh58:
                    Button b49 = (Button) findViewById(R.id.hhh58);
                    assert b49 != null;
                    b49.setText(data);
                    do0();
                    break;
                case R.id.hhh59:
                    Button b50 = (Button) findViewById(R.id.hhh59);
                    assert b50 != null;
                    b50.setText(data);
                    do0();
                    break;
                case R.id.hhh61:
                    Button b52 = (Button) findViewById(R.id.hhh61);
                    assert b52 != null;
                    b52.setText(data);
                    do0();
                    break;
                case R.id.hhh62:
                    Button b53 = (Button) findViewById(R.id.hhh62);
                    assert b53 != null;
                    b53.setText(data);
                    do0();
                    break;
                case R.id.hhh63:
                    Button b54 = (Button) findViewById(R.id.hhh63);
                    assert b54 != null;
                    b54.setText(data);
                    do0();
                    break;
                case R.id.hhh64:
                    Button b55 = (Button) findViewById(R.id.hhh64);
                    assert b55 != null;
                    b55.setText(data);
                    do0();
                    break;
                case R.id.hhh65:
                    Button b56 = (Button) findViewById(R.id.hhh65);
                    assert b56 != null;
                    b56.setText(data);
                    do0();
                    break;
                case R.id.hhh66:
                    Button b57 = (Button) findViewById(R.id.hhh66);
                    assert b57 != null;
                    b57.setText(data);
                    do0();
                    break;
                case R.id.hhh67:
                    Button b58 = (Button) findViewById(R.id.hhh67);
                    assert b58 != null;
                    b58.setText(data);
                    do0();
                    break;
                case R.id.hhh68:
                    Button b59 = (Button) findViewById(R.id.hhh68);
                    assert b59 != null;
                    b59.setText(data);
                    do0();
                    break;
                case R.id.hhh69:
                    Button b60 = (Button) findViewById(R.id.hhh69);
                    assert b60 != null;
                    b60.setText(data);
                    do0();
                    break;
                case R.id.hhh71:
                    Button b62 = (Button) findViewById(R.id.hhh71);
                    assert b62 != null;
                    b62.setText(data);
                    do0();
                    break;
                case R.id.hhh72:
                    Button b63 = (Button) findViewById(R.id.hhh72);
                    assert b63 != null;
                    b63.setText(data);
                    do0();
                    break;
                case R.id.hhh73:
                    Button b64 = (Button) findViewById(R.id.hhh73);
                    assert b64 != null;
                    b64.setText(data);
                    do0();
                    break;
                case R.id.hhh74:
                    Button b65 = (Button) findViewById(R.id.hhh74);
                    assert b65 != null;
                    b65.setText(data);
                    do0();
                    break;
                case R.id.hhh75:
                    Button b66 = (Button) findViewById(R.id.hhh75);
                    assert b66 != null;
                    b66.setText(data);
                    do0();
                    break;
                case R.id.hhh76:
                    Button b67 = (Button) findViewById(R.id.hhh76);
                    assert b67 != null;
                    b67.setText(data);
                    do0();
                    break;
                case R.id.hhh77:
                    Button b68 = (Button) findViewById(R.id.hhh77);
                    assert b68 != null;
                    b68.setText(data);
                    do0();
                    break;
                case R.id.hhh78:
                    Button b69 = (Button) findViewById(R.id.hhh78);
                    assert b69 != null;
                    b69.setText(data);
                    do0();
                    break;
                case R.id.hhh79:
                    Button b70 = (Button) findViewById(R.id.hhh79);
                    assert b70 != null;
                    b70.setText(data);
                    do0();
                    break;
                case R.id.hhh81:
                    Button b72 = (Button) findViewById(R.id.hhh81);
                    assert b72 != null;
                    b72.setText(data);
                    do0();
                    break;
                case R.id.hhh82:
                    Button b73 = (Button) findViewById(R.id.hhh82);
                    assert b73 != null;
                    b73.setText(data);
                    do0();
                    break;
                case R.id.hhh83:
                    Button b74 = (Button) findViewById(R.id.hhh83);
                    assert b74 != null;
                    b74.setText(data);
                    do0();
                    break;
                case R.id.hhh84:
                    Button b75 = (Button) findViewById(R.id.hhh84);
                    assert b75 != null;
                    b75.setText(data);
                    do0();
                    break;
                case R.id.hhh85:
                    Button b76 = (Button) findViewById(R.id.hhh85);
                    assert b76 != null;
                    b76.setText(data);
                    do0();
                    break;
                case R.id.hhh86:
                    Button b77 = (Button) findViewById(R.id.hhh86);
                    assert b77 != null;
                    b77.setText(data);
                    do0();
                    break;
                case R.id.hhh87:
                    Button b78 = (Button) findViewById(R.id.hhh87);
                    assert b78 != null;
                    b78.setText(data);
                    do0();
                    break;
                case R.id.hhh88:
                    Button b79 = (Button) findViewById(R.id.hhh88);
                    assert b79 != null;
                    b79.setText(data);
                    do0();
                    break;
                case R.id.hhh89:
                    Button b80 = (Button) findViewById(R.id.hhh89);
                    assert b80 != null;
                    b80.setText(data);
                    do0();
                    break;
                case R.id.hhh91:
                    Button b82 = (Button) findViewById(R.id.hhh91);
                    assert b82 != null;
                    b82.setText(data);
                    do0();
                    break;
                case R.id.hhh92:
                    Button b83 = (Button) findViewById(R.id.hhh92);
                    assert b83 != null;
                    b83.setText(data);
                    do0();
                    break;
                case R.id.hhh93:
                    Button b84 = (Button) findViewById(R.id.hhh93);
                    assert b84 != null;
                    b84.setText(data);
                    do0();
                    break;
                case R.id.hhh94:
                    Button b85 = (Button) findViewById(R.id.hhh94);
                    assert b85 != null;
                    b85.setText(data);
                    do0();
                    break;
                case R.id.hhh95:
                    Button b86 = (Button) findViewById(R.id.hhh95);
                    assert b86 != null;
                    b86.setText(data);
                    do0();
                    break;
                case R.id.hhh96:
                    Button b87 = (Button) findViewById(R.id.hhh96);
                    assert b87 != null;
                    b87.setText(data);
                    do0();
                    break;
                case R.id.hhh97:
                    Button b88 = (Button) findViewById(R.id.hhh97);
                    assert b88 != null;
                    b88.setText(data);
                    do0();
                    break;
                case R.id.hhh98:
                    Button b89 = (Button) findViewById(R.id.hhh98);
                    assert b89 != null;
                    b89.setText(data);
                    do0();
                    break;
                case R.id.hhh99:
                    Button b90 = (Button) findViewById(R.id.hhh99);
                    assert b90 != null;
                    b90.setText(data);
                    do0();
                    break;
                default:
                    break;
            }
        }
    };
}
