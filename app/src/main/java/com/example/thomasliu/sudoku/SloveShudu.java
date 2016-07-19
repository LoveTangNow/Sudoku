package com.example.thomasliu.sudoku;

import java.util.HashMap;
/**
 * Created by ThomasLiu on 16/7/19.
 */
public class SloveShudu {
    public int answers = 0;// 答案个数
    private char[] te_ = null;
    public String sd_answer = "";

    public SloveShudu(int[][] sz) {
        this.te_ = new char[81];
        int cc = 0;
        for (int i = 0; i < sz.length; i++) {
            for (int j = 0; j < sz[i].length; j++) {
                te_[cc] = (sz[i][j] + "").charAt(0);
                cc++;
            }
        }
    }

    public void resolve() {
        resolve(te_);
    }

    public void resolve(char[] A) {// 回溯法解数独
        int i, j;
        for (i = 0; i < 81; i++) {
            if (A[i] != '0') {
                continue;
            }
            HashMap<String, String> h = new HashMap<String, String>();
            for (j = 0; j < 81; j++) {
                h.put(j / 9 == i / 9 || j % 9 == i % 9 || (j / 27 == i / 27) && ((j % 9 / 3) == (i % 9 / 3)) ? "" + A[j]
                        : "0", "1");
            }
            for (j = 1; j <= 9; j++) {
                if (h.get("" + j) == null) {
                    A[i] = (char) ('0' + j);
                    resolve(A);
                }
            }
            A[i] = '0';
            return;
        }

        answers += 1;// 答案增加了一个

        for (i = 0; i < 81; i++) {
            sd_answer += A[i];
        }
        return;
    }

    // 输出数独方阵
    public void Show_answer() {
        int a = 0;
        for (int i = 0; i < this.answers; i++) {
            for (int j = i * 81; j < i * 81 + 81; j++) {
                a++;
                System.out.print(sd_answer.charAt(j) + " ");
                if (a == 9) {
                    System.out.println();
                    a = 0;
                }
            }
            System.out.println();
        }
    }

}
