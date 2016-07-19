package com.example.thomasliu.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        final Button button15 = (Button)findViewById(R.id.hhh15);
        final Button button16 = (Button)findViewById(R.id.hhh16);
        final Button button17 = (Button)findViewById(R.id.hhh17);
        final Button button18 = (Button)findViewById(R.id.hhh18);
        final Button button19 = (Button)findViewById(R.id.hhh19);

        //第二行的Button
        final Button button21 = (Button)findViewById(R.id.hhh21);
        final Button button22 = (Button)findViewById(R.id.hhh22);
        final Button button23 = (Button)findViewById(R.id.hhh23);
        final Button button24 = (Button)findViewById(R.id.hhh24);
        final Button button25 = (Button)findViewById(R.id.hhh25);
        final Button button26 = (Button)findViewById(R.id.hhh26);
        final Button button27 = (Button)findViewById(R.id.hhh27);
        final Button button28 = (Button)findViewById(R.id.hhh28);
        final Button button29 = (Button)findViewById(R.id.hhh29);

        final Button button31 = (Button)findViewById(R.id.hhh31);
        final Button button32 = (Button)findViewById(R.id.hhh32);
        final Button button33 = (Button)findViewById(R.id.hhh33);
        final Button button34 = (Button)findViewById(R.id.hhh34);
        final Button button35 = (Button)findViewById(R.id.hhh35);
        final Button button36 = (Button)findViewById(R.id.hhh36);
        final Button button37 = (Button)findViewById(R.id.hhh37);
        final Button button38 = (Button)findViewById(R.id.hhh38);
        final Button button39 = (Button)findViewById(R.id.hhh39);

        final Button button41 = (Button)findViewById(R.id.hhh41);
        final Button button42 = (Button)findViewById(R.id.hhh42);
        final Button button43 = (Button)findViewById(R.id.hhh43);
        final Button button44 = (Button)findViewById(R.id.hhh44);
        final Button button45 = (Button)findViewById(R.id.hhh45);
        final Button button46 = (Button)findViewById(R.id.hhh46);
        final Button button47 = (Button)findViewById(R.id.hhh47);
        final Button button48 = (Button)findViewById(R.id.hhh48);
        final Button button49 = (Button)findViewById(R.id.hhh49);

        final Button button51 = (Button)findViewById(R.id.hhh51);
        final Button button52 = (Button)findViewById(R.id.hhh52);
        final Button button53 = (Button)findViewById(R.id.hhh53);
        final Button button54 = (Button)findViewById(R.id.hhh54);
        final Button button55 = (Button)findViewById(R.id.hhh55);
        final Button button56 = (Button)findViewById(R.id.hhh56);
        final Button button57 = (Button)findViewById(R.id.hhh57);
        final Button button58 = (Button)findViewById(R.id.hhh58);
        final Button button59 = (Button)findViewById(R.id.hhh59);

        final Button button61 = (Button)findViewById(R.id.hhh61);
        final Button button62 = (Button)findViewById(R.id.hhh62);
        final Button button63 = (Button)findViewById(R.id.hhh63);
        final Button button64 = (Button)findViewById(R.id.hhh64);
        final Button button65 = (Button)findViewById(R.id.hhh65);
        final Button button66 = (Button)findViewById(R.id.hhh66);
        final Button button67 = (Button)findViewById(R.id.hhh67);
        final Button button68 = (Button)findViewById(R.id.hhh68);
        final Button button69 = (Button)findViewById(R.id.hhh69);

        final Button button71 = (Button)findViewById(R.id.hhh71);
        final Button button72 = (Button)findViewById(R.id.hhh72);
        final Button button73 = (Button)findViewById(R.id.hhh73);
        final Button button74 = (Button)findViewById(R.id.hhh74);
        final Button button75 = (Button)findViewById(R.id.hhh75);
        final Button button76 = (Button)findViewById(R.id.hhh76);
        final Button button77 = (Button)findViewById(R.id.hhh77);
        final Button button78 = (Button)findViewById(R.id.hhh78);
        final Button button79 = (Button)findViewById(R.id.hhh79);

        final Button button81 = (Button)findViewById(R.id.hhh81);
        final Button button82 = (Button)findViewById(R.id.hhh82);
        final Button button83 = (Button)findViewById(R.id.hhh83);
        final Button button84 = (Button)findViewById(R.id.hhh84);
        final Button button85 = (Button)findViewById(R.id.hhh85);
        final Button button86 = (Button)findViewById(R.id.hhh86);
        final Button button87 = (Button)findViewById(R.id.hhh87);
        final Button button88 = (Button)findViewById(R.id.hhh88);
        final Button button89 = (Button)findViewById(R.id.hhh89);

        final Button button91 = (Button)findViewById(R.id.hhh91);
        final Button button92 = (Button)findViewById(R.id.hhh92);
        final Button button93 = (Button)findViewById(R.id.hhh93);
        final Button button94 = (Button)findViewById(R.id.hhh94);
        final Button button95 = (Button)findViewById(R.id.hhh95);
        final Button button96 = (Button)findViewById(R.id.hhh96);
        final Button button97 = (Button)findViewById(R.id.hhh97);
        final Button button98 = (Button)findViewById(R.id.hhh98);
        final Button button99 = (Button)findViewById(R.id.hhh99);

        //第十一行的Button
        final Button button111 = (Button)findViewById(R.id.hhh111);
        final Button button112 = (Button)findViewById(R.id.hhh112);
        final Button button113 = (Button)findViewById(R.id.hhh113);
        final Button button114 = (Button)findViewById(R.id.hhh114);
        final Button button115 = (Button)findViewById(R.id.hhh115);
        final Button button116 = (Button)findViewById(R.id.hhh116);
        final Button button117 = (Button)findViewById(R.id.hhh117);
        final Button button118 = (Button)findViewById(R.id.hhh118);
        final Button button119 = (Button)findViewById(R.id.hhh119);



        button11.setOnClickListener(clickListener);
        button21.setOnClickListener(clickListener);
        button31.setOnClickListener(clickListener);
        button41.setOnClickListener(clickListener);
        button51.setOnClickListener(clickListener);
        button61.setOnClickListener(clickListener);
        button71.setOnClickListener(clickListener);
        button81.setOnClickListener(clickListener);
        button91.setOnClickListener(clickListener);

        button12.setOnClickListener(clickListener);
        button22.setOnClickListener(clickListener);
        button42.setOnClickListener(clickListener);
        button52.setOnClickListener(clickListener);
        button62.setOnClickListener(clickListener);
        button72.setOnClickListener(clickListener);
        button82.setOnClickListener(clickListener);
        button92.setOnClickListener(clickListener);
        ////////////3333333333333333333333333333333333333333////////////////////
        button13.setOnClickListener(clickListener);
        button23.setOnClickListener(clickListener);
        button43.setOnClickListener(clickListener);
        button53.setOnClickListener(clickListener);
        button63.setOnClickListener(clickListener);
        button73.setOnClickListener(clickListener);
        button83.setOnClickListener(clickListener);
        button93.setOnClickListener(clickListener);

        button14.setOnClickListener(clickListener);
        button24.setOnClickListener(clickListener);
        button44.setOnClickListener(clickListener);
        button54.setOnClickListener(clickListener);
        button64.setOnClickListener(clickListener);
        button74.setOnClickListener(clickListener);
        button84.setOnClickListener(clickListener);
        button94.setOnClickListener(clickListener);

        button15.setOnClickListener(clickListener);
        button25.setOnClickListener(clickListener);
        button45.setOnClickListener(clickListener);
        button55.setOnClickListener(clickListener);
        button65.setOnClickListener(clickListener);
        button75.setOnClickListener(clickListener);
        button85.setOnClickListener(clickListener);
        button95.setOnClickListener(clickListener);

        button16.setOnClickListener(clickListener);
        button26.setOnClickListener(clickListener);
        button46.setOnClickListener(clickListener);
        button56.setOnClickListener(clickListener);
        button66.setOnClickListener(clickListener);
        button76.setOnClickListener(clickListener);
        button86.setOnClickListener(clickListener);
        button96.setOnClickListener(clickListener);

        button17.setOnClickListener(clickListener);
        button27.setOnClickListener(clickListener);
        button47.setOnClickListener(clickListener);
        button57.setOnClickListener(clickListener);
        button67.setOnClickListener(clickListener);
        button77.setOnClickListener(clickListener);
        button87.setOnClickListener(clickListener);
        button97.setOnClickListener(clickListener);

        button18.setOnClickListener(clickListener);
        button28.setOnClickListener(clickListener);
        button48.setOnClickListener(clickListener);
        button58.setOnClickListener(clickListener);
        button68.setOnClickListener(clickListener);
        button78.setOnClickListener(clickListener);
        button88.setOnClickListener(clickListener);
        button98.setOnClickListener(clickListener);

        button19.setOnClickListener(clickListener);
        button29.setOnClickListener(clickListener);
        button49.setOnClickListener(clickListener);
        button59.setOnClickListener(clickListener);
        button69.setOnClickListener(clickListener);
        button79.setOnClickListener(clickListener);
        button89.setOnClickListener(clickListener);
        button99.setOnClickListener(clickListener);



        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////

        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (button111.getText() != null)
                 {
                     data = (String) button111.getText();
                 }}});

        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button112.getText() != null)
                {
                    data = (String) button112.getText();
                }}});

        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button113.getText() != null)
                {
                    data = (String) button113.getText();
                }}});

        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button114.getText() != null)
                {
                    data = (String) button114.getText();
                }}});

        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button115.getText() != null)
                {
                    data = (String) button115.getText();
                }}});

        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button116.getText() != null)
                {
                    data = (String) button116.getText();
                }}});

        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button117.getText() != null)
                {
                    data = (String) button117.getText();
                }}});

        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button118.getText() != null)
                {
                    data = (String) button118.getText();
                }}});

        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button119.getText() != null) {data = (String) button119.getText();
                }}});

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
        text_give_buttons(button11,sd_[0][0]);text_give_buttons(button12,sd_[0][1]);text_give_buttons(button13,sd_[0][2]);
        text_give_buttons(button14,sd_[0][3]);text_give_buttons(button15,sd_[0][4]);text_give_buttons(button16,sd_[0][5]);
        text_give_buttons(button17,sd_[0][6]);text_give_buttons(button18,sd_[0][7]);text_give_buttons(button19,sd_[0][8]);

        text_give_buttons(button21,sd_[1][0]);text_give_buttons(button22,sd_[1][1]);text_give_buttons(button23,sd_[1][2]);
        text_give_buttons(button24,sd_[1][3]);text_give_buttons(button25,sd_[1][4]);text_give_buttons(button26,sd_[1][5]);
        text_give_buttons(button27,sd_[1][6]);text_give_buttons(button28,sd_[1][7]);text_give_buttons(button29,sd_[1][8]);

        text_give_buttons(button31,sd_[2][0]);text_give_buttons(button32,sd_[2][1]);text_give_buttons(button33,sd_[2][2]);
        text_give_buttons(button34,sd_[2][3]);text_give_buttons(button35,sd_[2][4]);text_give_buttons(button36,sd_[2][5]);
        text_give_buttons(button37,sd_[2][6]);text_give_buttons(button38,sd_[2][7]);text_give_buttons(button39,sd_[2][8]);

        text_give_buttons(button41,sd_[3][0]);text_give_buttons(button42,sd_[3][1]);text_give_buttons(button43,sd_[3][2]);
        text_give_buttons(button44,sd_[3][3]);text_give_buttons(button45,sd_[3][4]);text_give_buttons(button46,sd_[3][5]);
        text_give_buttons(button47,sd_[3][6]);text_give_buttons(button48,sd_[3][7]);text_give_buttons(button49,sd_[3][8]);

        text_give_buttons(button51,sd_[4][0]);text_give_buttons(button52,sd_[4][1]);text_give_buttons(button53,sd_[4][2]);
        text_give_buttons(button54,sd_[4][3]);text_give_buttons(button55,sd_[4][4]);text_give_buttons(button56,sd_[4][5]);
        text_give_buttons(button57,sd_[4][6]);text_give_buttons(button58,sd_[4][7]);text_give_buttons(button59,sd_[4][8]);

        text_give_buttons(button61,sd_[5][0]);text_give_buttons(button62,sd_[5][1]);text_give_buttons(button63,sd_[5][2]);
        text_give_buttons(button64,sd_[5][3]);text_give_buttons(button65,sd_[5][4]);text_give_buttons(button66,sd_[5][5]);
        text_give_buttons(button67,sd_[5][6]);text_give_buttons(button68,sd_[5][7]);text_give_buttons(button69,sd_[5][8]);

        text_give_buttons(button71,sd_[6][0]);text_give_buttons(button72,sd_[6][1]);text_give_buttons(button73,sd_[6][2]);
        text_give_buttons(button74,sd_[6][3]);text_give_buttons(button75,sd_[6][4]);text_give_buttons(button76,sd_[6][5]);
        text_give_buttons(button77,sd_[6][6]);text_give_buttons(button78,sd_[6][7]);text_give_buttons(button79,sd_[6][8]);

        text_give_buttons(button81,sd_[7][0]);text_give_buttons(button82,sd_[7][1]);text_give_buttons(button83,sd_[7][2]);
        text_give_buttons(button84,sd_[7][3]);text_give_buttons(button85,sd_[7][4]);text_give_buttons(button86,sd_[7][5]);
        text_give_buttons(button87,sd_[7][6]);text_give_buttons(button88,sd_[7][7]);text_give_buttons(button89,sd_[7][8]);

        //第九行添加文字
        text_give_buttons(button91,sd_[8][0]);text_give_buttons(button92,sd_[8][1]);text_give_buttons(button93,sd_[8][2]);
        text_give_buttons(button94,sd_[8][3]);text_give_buttons(button95,sd_[8][4]);text_give_buttons(button96,sd_[8][5]);
        text_give_buttons(button97,sd_[8][6]);text_give_buttons(button98,sd_[8][7]);text_give_buttons(button99,sd_[8][8]);

        //第十行没有东西 为空

        //第十一行 就是1~10
        button111.setText("0");button112.setText("1");button113.setText("2");
        button114.setText("3");button115.setText("4");button116.setText("5");
        button117.setText("6");button118.setText("7");button119.setText("8");

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

    private View.OnClickListener clickListener = new View.OnClickListener() {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.hhh11:Button b2 =  (Button)findViewById(R.id.hhh11);b2.setText(data); break;
                case R.id.hhh12:Button b3 =  (Button)findViewById(R.id.hhh12);b3.setText(data); break;
                case R.id.hhh13:Button b4 =  (Button)findViewById(R.id.hhh13);b4.setText(data); break;
                case R.id.hhh14:Button b5 =  (Button)findViewById(R.id.hhh14);b5.setText(data); break;
                case R.id.hhh15:Button b6 =  (Button)findViewById(R.id.hhh15);b6.setText(data); break;
                case R.id.hhh16:Button b7 =  (Button)findViewById(R.id.hhh16);b7.setText(data); break;
                case R.id.hhh17:Button b8 =  (Button)findViewById(R.id.hhh17);b8.setText(data); break;
                case R.id.hhh18:Button b9 =  (Button)findViewById(R.id.hhh18);b9.setText(data); break;
                case R.id.hhh19:Button b10 = (Button)findViewById(R.id.hhh19);b10.setText(data);break;
                case R.id.hhh21:Button b12 = (Button)findViewById(R.id.hhh21);b12.setText(data);break;
                case R.id.hhh22:Button b13 = (Button)findViewById(R.id.hhh22);b13.setText(data);break;
                case R.id.hhh23:Button b14 = (Button)findViewById(R.id.hhh23);b14.setText(data);break;
                case R.id.hhh24:Button b15 = (Button)findViewById(R.id.hhh24);b15.setText(data);break;
                case R.id.hhh25:Button b16 = (Button)findViewById(R.id.hhh25);b16.setText(data);break;
                case R.id.hhh26:Button b17 = (Button)findViewById(R.id.hhh26);b17.setText(data);break;
                case R.id.hhh27:Button b18 = (Button)findViewById(R.id.hhh27);b18.setText(data);break;
                case R.id.hhh28:Button b19 = (Button)findViewById(R.id.hhh28);b19.setText(data);break;
                case R.id.hhh29:Button b20 = (Button)findViewById(R.id.hhh29);b20.setText(data);break;
                case R.id.hhh31:Button b22 = (Button)findViewById(R.id.hhh31);b22.setText(data);break;
                case R.id.hhh32:Button b23 = (Button)findViewById(R.id.hhh32);b23.setText(data);break;
                case R.id.hhh33:Button b24 = (Button)findViewById(R.id.hhh33);b24.setText(data);break;
                case R.id.hhh34:Button b25 = (Button)findViewById(R.id.hhh34);b25.setText(data);break;
                case R.id.hhh35:Button b26 = (Button)findViewById(R.id.hhh35);b26.setText(data);break;
                case R.id.hhh36:Button b27 = (Button)findViewById(R.id.hhh36);b27.setText(data);break;
                case R.id.hhh37:Button b28 = (Button)findViewById(R.id.hhh37);b28.setText(data);break;
                case R.id.hhh38:Button b29 = (Button)findViewById(R.id.hhh38);b29.setText(data);break;
                case R.id.hhh39:Button b30 = (Button)findViewById(R.id.hhh39);b30.setText(data);break;
                case R.id.hhh41:Button b32 = (Button)findViewById(R.id.hhh41);b32.setText(data);break;
                case R.id.hhh42:Button b33 = (Button)findViewById(R.id.hhh42);b33.setText(data);break;
                case R.id.hhh43:Button b34 = (Button)findViewById(R.id.hhh43);b34.setText(data);break;
                case R.id.hhh44:Button b35 = (Button)findViewById(R.id.hhh44);b35.setText(data);break;
                case R.id.hhh45:Button b36 = (Button)findViewById(R.id.hhh45);b36.setText(data);break;
                case R.id.hhh46:Button b37 = (Button)findViewById(R.id.hhh46);b37.setText(data);break;
                case R.id.hhh47:Button b38 = (Button)findViewById(R.id.hhh47);b38.setText(data);break;
                case R.id.hhh48:Button b39 = (Button)findViewById(R.id.hhh48);b39.setText(data);break;
                case R.id.hhh49:Button b40 = (Button)findViewById(R.id.hhh49);b40.setText(data);break;
                case R.id.hhh51:Button b42 = (Button)findViewById(R.id.hhh51);b42.setText(data);break;
                case R.id.hhh52:Button b43 = (Button)findViewById(R.id.hhh52);b43.setText(data);break;
                case R.id.hhh53:Button b44 = (Button)findViewById(R.id.hhh53);b44.setText(data);break;
                case R.id.hhh54:Button b45 = (Button)findViewById(R.id.hhh54);b45.setText(data);break;
                case R.id.hhh55:Button b46 = (Button)findViewById(R.id.hhh55);b46.setText(data);break;
                case R.id.hhh56:Button b47 = (Button)findViewById(R.id.hhh56);b47.setText(data);break;
                case R.id.hhh57:Button b48 = (Button)findViewById(R.id.hhh57);b48.setText(data);break;
                case R.id.hhh58:Button b49 = (Button)findViewById(R.id.hhh58);b49.setText(data);break;
                case R.id.hhh59:Button b50 = (Button)findViewById(R.id.hhh59);b50.setText(data);break;
                case R.id.hhh61:Button b52 = (Button)findViewById(R.id.hhh61);b52.setText(data);break;
                case R.id.hhh62:Button b53 = (Button)findViewById(R.id.hhh62);b53.setText(data);break;
                case R.id.hhh63:Button b54 = (Button)findViewById(R.id.hhh63);b54.setText(data);break;
                case R.id.hhh64:Button b55 = (Button)findViewById(R.id.hhh64);b55.setText(data);break;
                case R.id.hhh65:Button b56 = (Button)findViewById(R.id.hhh65);b56.setText(data);break;
                case R.id.hhh66:Button b57 = (Button)findViewById(R.id.hhh66);b57.setText(data);break;
                case R.id.hhh67:Button b58 = (Button)findViewById(R.id.hhh67);b58.setText(data);break;
                case R.id.hhh68:Button b59 = (Button)findViewById(R.id.hhh68);b59.setText(data);break;
                case R.id.hhh69:Button b60 = (Button)findViewById(R.id.hhh69);b60.setText(data);break;
                case R.id.hhh71:Button b62 = (Button)findViewById(R.id.hhh71);b62.setText(data);break;
                case R.id.hhh72:Button b63 = (Button)findViewById(R.id.hhh72);b63.setText(data);break;
                case R.id.hhh73:Button b64 = (Button)findViewById(R.id.hhh73);b64.setText(data);break;
                case R.id.hhh74:Button b65 = (Button)findViewById(R.id.hhh74);b65.setText(data);break;
                case R.id.hhh75:Button b66 = (Button)findViewById(R.id.hhh75);b66.setText(data);break;
                case R.id.hhh76:Button b67 = (Button)findViewById(R.id.hhh76);b67.setText(data);break;
                case R.id.hhh77:Button b68 = (Button)findViewById(R.id.hhh77);b68.setText(data);break;
                case R.id.hhh78:Button b69 = (Button)findViewById(R.id.hhh78);b69.setText(data);break;
                case R.id.hhh79:Button b70 = (Button)findViewById(R.id.hhh79);b70.setText(data);break;
                case R.id.hhh81:Button b72 = (Button)findViewById(R.id.hhh81);b72.setText(data);break;
                case R.id.hhh82:Button b73 = (Button)findViewById(R.id.hhh82);b73.setText(data);break;
                case R.id.hhh83:Button b74 = (Button)findViewById(R.id.hhh83);b74.setText(data);break;
                case R.id.hhh84:Button b75 = (Button)findViewById(R.id.hhh84);b75.setText(data);break;
                case R.id.hhh85:Button b76 = (Button)findViewById(R.id.hhh85);b76.setText(data);break;
                case R.id.hhh86:Button b77 = (Button)findViewById(R.id.hhh86);b77.setText(data);break;
                case R.id.hhh87:Button b78 = (Button)findViewById(R.id.hhh87);b78.setText(data);break;
                case R.id.hhh88:Button b79 = (Button)findViewById(R.id.hhh88);b79.setText(data);break;
                case R.id.hhh89:Button b80 = (Button)findViewById(R.id.hhh89);b80.setText(data);break;
                case R.id.hhh91:Button b82 = (Button)findViewById(R.id.hhh91);b82.setText(data);break;
                case R.id.hhh92:Button b83 = (Button)findViewById(R.id.hhh92);b83.setText(data);break;
                case R.id.hhh93:Button b84 = (Button)findViewById(R.id.hhh93);b84.setText(data);break;
                case R.id.hhh94:Button b85 = (Button)findViewById(R.id.hhh94);b85.setText(data);break;
                case R.id.hhh95:Button b86 = (Button)findViewById(R.id.hhh95);b86.setText(data);break;
                case R.id.hhh96:Button b87 = (Button)findViewById(R.id.hhh96);b87.setText(data);break;
                case R.id.hhh97:Button b88 = (Button)findViewById(R.id.hhh97);b88.setText(data);break;
                case R.id.hhh98:Button b89 = (Button)findViewById(R.id.hhh98);b89.setText(data);break;
                case R.id.hhh99:Button b90 = (Button)findViewById(R.id.hhh99);b90.setText(data);break;
                default:
                    break;
            }
        }
    };

}
