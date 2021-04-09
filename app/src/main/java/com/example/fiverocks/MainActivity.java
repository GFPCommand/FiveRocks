package com.example.fiverocks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private Button newGame;
    private Button
            but11, but12, but13, but14, but15,
            but21, but22, but23, but24, but25,
            but31, but32, but33, but34, but35,
            but41, but42, but43, but44, but45,
            but51, but52, but53, but54, but55;

    private TextView turn, win;

    private boolean turnCross = true, turnCircle = false, isGameEnd = false;
    private int size = 5;
    private int [][] fieldArray = new int[size][size];
    private int countFreeFields = 25;
    private int maxLengthOfCross = 0, maxLengthOfCircle = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turn = findViewById(R.id.turn);

        newGame = findViewById(R.id.NewGame);
        win = findViewById(R.id.win);

        but11 = findViewById(R.id.but11);
        but12 = findViewById(R.id.but12);
        but13 = findViewById(R.id.but13);
        but14 = findViewById(R.id.but14);
        but15 = findViewById(R.id.but15);

        but21 = findViewById(R.id.but21);
        but22 = findViewById(R.id.but22);
        but23 = findViewById(R.id.but23);
        but24 = findViewById(R.id.but24);
        but25 = findViewById(R.id.but25);

        but31 = findViewById(R.id.but31);
        but32 = findViewById(R.id.but32);
        but33 = findViewById(R.id.but33);
        but34 = findViewById(R.id.but34);
        but35 = findViewById(R.id.but35);

        but41 = findViewById(R.id.but41);
        but42 = findViewById(R.id.but42);
        but43 = findViewById(R.id.but43);
        but44 = findViewById(R.id.but44);
        but45 = findViewById(R.id.but45);

        but51 = findViewById(R.id.but51);
        but52 = findViewById(R.id.but52);
        but53 = findViewById(R.id.but53);
        but54 = findViewById(R.id.but54);
        but55 = findViewById(R.id.but55);

        turn.setText("Turn: X");

        but11.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[0][0] == 0){
                fieldArray[0][0] = 1;
                but11.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[0][0] == 0){
                fieldArray[0][0] = 2;
                but11.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but12.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[0][1] == 0){
                fieldArray[0][1] = 1;
                but12.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[0][1] == 0){
                fieldArray[0][1] = 2;
                but12.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but13.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[0][2] == 0){
                fieldArray[0][2] = 1;
                but13.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[0][2] == 0){
                fieldArray[0][2] = 2;
                but13.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but14.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[0][3] == 0){
                fieldArray[0][3] = 1;
                but14.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[0][3] == 0){
                fieldArray[0][3] = 2;
                but14.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but15.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[0][4] == 0){
                fieldArray[0][4] = 1;
                but15.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[0][4] == 0){
                fieldArray[0][4] = 2;
                but15.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but21.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[1][0] == 0){
                fieldArray[1][0] = 1;
                but21.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[1][0] == 0){
                fieldArray[1][0] = 2;
                but21.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but22.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[1][1] == 0){
                fieldArray[1][1] = 1;
                but22.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[1][1] == 0){
                fieldArray[1][1] = 2;
                but22.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but23.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[1][2] == 0){
                fieldArray[1][2] = 1;
                but23.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[1][2] == 0){
                fieldArray[1][2] = 2;
                but23.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but24.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[1][3] == 0){
                fieldArray[1][3] = 1;
                but24.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[1][3] == 0){
                fieldArray[1][3] = 2;
                but24.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but25.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[1][4] == 0){
                fieldArray[1][4] = 1;
                but25.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[1][4] == 0){
                fieldArray[1][4] = 2;
                but25.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but31.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[2][0] == 0){
                fieldArray[2][0] = 1;
                but31.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[2][0] == 0){
                fieldArray[2][0] = 2;
                but31.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but32.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[2][1] == 0){
                fieldArray[2][1] = 1;
                but32.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[2][1] == 0){
                fieldArray[2][1] = 2;
                but32.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but33.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[2][2] == 0){
                fieldArray[2][2] = 1;
                but33.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[2][2] == 0){
                fieldArray[2][2] = 2;
                but33.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but34.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[2][3] == 0){
                fieldArray[2][3] = 1;
                but34.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[2][3] == 0){
                fieldArray[2][3] = 2;
                but34.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but35.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[2][4] == 0){
                fieldArray[2][4] = 1;
                but35.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[2][4] == 0){
                fieldArray[2][4] = 2;
                but35.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but41.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[3][0] == 0){
                fieldArray[3][0] = 1;
                but41.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[3][0] == 0){
                fieldArray[3][0] = 2;
                but41.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but42.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[3][1] == 0){
                fieldArray[3][1] = 1;
                but42.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[3][1] == 0){
                fieldArray[3][1] = 2;
                but42.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but43.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[3][2] == 0){
                fieldArray[3][2] = 1;
                but43.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[3][2] == 0){
                fieldArray[3][2] = 2;
                but43.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but44.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[3][3] == 0){
                fieldArray[3][3] = 1;
                but44.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[3][3] == 0){
                fieldArray[3][3] = 2;
                but44.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but45.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[3][4] == 0){
                fieldArray[3][4] = 1;
                but45.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[3][4] == 0){
                fieldArray[3][4] = 2;
                but45.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but51.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[4][0] == 0){
                fieldArray[4][0] = 1;
                but51.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[4][0] == 0){
                fieldArray[4][0] = 2;
                but51.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but52.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[4][1] == 0){
                fieldArray[4][1] = 1;
                but52.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[4][1] == 0){
                fieldArray[4][1] = 2;
                but52.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but53.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[4][2] == 0){
                fieldArray[4][2] = 1;
                but53.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[4][2] == 0){
                fieldArray[4][2] = 2;
                but53.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but54.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[4][3] == 0){
                fieldArray[4][3] = 1;
                but54.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[4][3] == 0){
                fieldArray[4][3] = 2;
                but54.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        but55.setOnClickListener(v -> {
            if (turnCross && !turnCircle && fieldArray[4][4] == 0){
                fieldArray[4][4] = 1;
                but55.setText("X");
                turnCross = false;
                turnCircle = true;
                turn.setText("Turn: O");
                countFreeFields--;
            } else if (!turnCross && turnCircle && fieldArray[4][4] == 0){
                fieldArray[4][4] = 2;
                but55.setText("O");
                turnCross = true;
                turnCircle = false;
                turn.setText("Turn: X");
                countFreeFields--;
            }

            CheckEndGame();
        });

        newGame.setOnClickListener(v -> {
            turnCross = true;
            turnCircle = false;

            isGameEnd = false;

            turn.setText("Turn: X");
            win.setText("");

            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    fieldArray[i][j] = 0;
                }
            }

            countFreeFields = 25;

            maxLengthOfCross  = 0;
            maxLengthOfCircle = 0;

            newGame.setVisibility(INVISIBLE);

            but11.setText("");
            but12.setText("");
            but13.setText("");
            but14.setText("");
            but15.setText("");

            but21.setText("");
            but22.setText("");
            but23.setText("");
            but24.setText("");
            but25.setText("");

            but31.setText("");
            but32.setText("");
            but33.setText("");
            but34.setText("");
            but35.setText("");

            but41.setText("");
            but42.setText("");
            but43.setText("");
            but44.setText("");
            but45.setText("");

            but51.setText("");
            but52.setText("");
            but53.setText("");
            but54.setText("");
            but55.setText("");
        });
    }

    public void CheckEndGame(){
        if (countFreeFields == 0) isGameEnd = true;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (fieldArray[i][j] != 0 && isGameEnd){
                    newGame.setVisibility(VISIBLE);
                }
            }
        }

        if (isGameEnd) {
            turn.setText("");

            CheckWinner();
        }
    }

    public void CheckWinner(){
        CheckHorizontal();
        CheckVertical();

        CheckLeftDiagonal();
        CheckRightDiagonal();

        if (maxLengthOfCircle > maxLengthOfCross) win.setText("Win: O");
        else if (maxLengthOfCircle < maxLengthOfCross) win.setText("Win: X");
        else if (maxLengthOfCross == maxLengthOfCircle) win.setText("Win: X and O");
    }

    public void CheckHorizontal(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int k = j;
                int currX = 0;
                int currO = 0;

                while (fieldArray[i][k] == 1 && k < size){
                    currX++;
                    k++;
                    if (k == 5) break;
                }

                k = j;

                while (fieldArray[i][k] == 2 && k < size){
                    currO++;
                    k++;
                    if (k == 5) break;
                }

                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
                if (maxLengthOfCross < currX) maxLengthOfCross = currX;

                j = k;
            }
        }
    }

    public void CheckVertical(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int k = j;
                int currX = 0;
                int currO = 0;

                while (fieldArray[k][i] == 1 && k < size){
                    currX++;
                    k++;
                    if (k == 5) break;
                }

                k = j;

                while (fieldArray[k][i] == 2 && k < size){
                    currO++;
                    k++;
                    if (k == 5) break;
                }

                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
                if (maxLengthOfCross < currX) maxLengthOfCross = currX;

                j = k;
            }
        }
    }

    public void CheckLeftDiagonal(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1) {
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2) {
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        // ----------Diagonals above main diagonal----------

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        for (int i = 0; i < size-2; i++) {
            for (int j = i+2; j < size; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        for (int i = 0; i < size-3; i++) {
            for (int j = i+3; j < size; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        //--------------------------------------------------

        // ----------Diagonals under main diagonal----------

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        for (int i = 2; i < size; i++) {
            for (int j = 0; j < size-2; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size&& l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }

        for (int i = 3; i < size; i++) {
            for (int j = 0; j < size-3; j++) {
                int k = j, l = i;
                int currX = 0;
                int currO = 0;

                while (k < size && l < size && fieldArray[l][k] == 1){
                    currX++;
                    k++;
                    l++;
                }

                k = j;
                l = i;

                while (k < size && l < size && fieldArray[l][k] == 2){
                    currO++;
                    k++;
                    l++;
                }

                j = k;
                i = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;
            }
        }
    }

    public void CheckRightDiagonal(){
        for (int i = 0, j = 4; i < size; i++, j--){
            int k = j, l = i;
            int currX = 0;
            int currO = 0;

            while (l < size && k > -1 && fieldArray[l][k] == 1){
                currX++;
                k--;
                l++;
            }

            k = j;
            l = i;

            while (l < size && k > -1 && fieldArray[l][k] == 2){
                currO++;
                k--;
                l++;
                if (k == -1 && l == 5) break;
            }

            j = k;
            i = l;

            if (maxLengthOfCross < currX) maxLengthOfCross = currX;
            if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;

            if (j < 0) break;
        }

        // ----------Diagonals above secondary diagonal----------

        for (int i = 3; i > -1; i--) {
            for (int m = 0, n = i; m < size; m++, n--) {
                int k = n, l = m;
                int currX = 0;
                int currO = 0;

                while (l < size && k > -1 && fieldArray[l][k] == 1){
                    currX++;
                    k--;
                    l++;

                    if (k == -1 && l == 5) break;
                }

                k = n;
                l = m;

                while (l < size && k > -1 && fieldArray[l][k] == 2){
                    currO++;
                    k--;
                    l++;

                    if (k == -1 && l == 5) break;
                }

                n = k;
                m = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;

                if (n < 0) break;
            }
        }

        //--------------------------------------------------

        // ----------Diagonals under secondary diagonal----------

        for (int i = 1; i < size; i++) {
            for (int m = i, n = 4; m < size; m++, n--) {
                int k = n, l = m;
                int currX = 0;
                int currO = 0;

                while (l < size && k > -1 && fieldArray[l][k] == 1){
                    currX++;
                    k--;
                    l++;

                    if (k == -1 && l == 5) break;
                }

                k = n;
                l = m;

                while (l < size && k > -1 && fieldArray[l][k] == 2){
                    currO++;
                    k--;
                    l++;

                    if (k == -1 && l == 5) break;
                }

                n = k;
                m = l;

                if (maxLengthOfCross < currX) maxLengthOfCross = currX;
                if (maxLengthOfCircle < currO) maxLengthOfCircle = currO;

                if (n < 0) break;
            }
        }
    }
}