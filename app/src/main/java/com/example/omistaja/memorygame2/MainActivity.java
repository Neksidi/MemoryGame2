package com.example.omistaja.memorygame2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    // taulukko kuville, kuvat numeroina
    Integer[] images = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //kuvat
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    //alustetaan muuttujat
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    //pelaajan vuoro
    int turn = 1;

    //pisteet alustetaan nollaksi
    int playerPoints = 0, PlayerPoints2 = 0;

    /**
     *
     * Päämetodi ohjelman toimintaan
     * @param savedInstanceState tallentaa tilan
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 =  findViewById(R.id.textView2);

        iv_11 =  findViewById(R.id.iv_11);
        iv_12 =  findViewById(R.id.iv_12);
        iv_13 =  findViewById(R.id.iv_13);
        iv_14 =  findViewById(R.id.iv_14);
        iv_21 =  findViewById(R.id.iv_21);
        iv_22 =  findViewById(R.id.iv_22);
        iv_23 =  findViewById(R.id.iv_23);
        iv_24 =  findViewById(R.id.iv_24);
        iv_31 =  findViewById(R.id.iv_31);
        iv_32 =  findViewById(R.id.iv_32);
        iv_33 =  findViewById(R.id.iv_33);
        iv_34 =  findViewById(R.id.iv_34);

        //asetetaan kaikille kuville tunnus
        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //kutsutaan kuvat lataavaa metodia
        getImages();

        //sekoitetaan
        Collections.shuffle(Arrays.asList(images));

        //vaihdetaan toisen pelaajan väriä, joka ei ole alussa aktiivinen
        textView2.setTextColor(Color.GRAY);

        //kuuntelijat kaikille korteille
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_11, card);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_12, card);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_13, card);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_14, card);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_21, card);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_22, card);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_23, card);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_24, card);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_31, card);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_32, card);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_33, card);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int card = Integer.parseInt((String) view.getTag());
                playCard(iv_34, card);
            }
        });
    }

    /**
     * näyttää kortin kuvan kun kortti pelataan
     *
     * @param iv   imageview käytettävä kuva
     * @param card pelattava kortti
     */
    private void playCard(ImageView iv, int card) {
        if (images[card] == 101) {
            iv.setImageResource(image101);
        } else if (images[card] == 102) {
            iv.setImageResource(image102);
        } else if (images[card] == 103) {
            iv.setImageResource(image103);
        } else if (images[card] == 104) {
            iv.setImageResource(image104);
        } else if (images[card] == 105) {
            iv.setImageResource(image105);
        } else if (images[card] == 106) {
            iv.setImageResource(image106);
        } else if (images[card] == 201) {
            iv.setImageResource(image201);
        } else if (images[card] == 202) {
            iv.setImageResource(image202);
        } else if (images[card] == 203) {
            iv.setImageResource(image203);
        } else if (images[card] == 204) {
            iv.setImageResource(image204);
        } else if (images[card] == 205) {
            iv.setImageResource(image205);
        } else if (images[card] == 206) {
            iv.setImageResource(image206);
        }

        // tarkistaa monesko kortti on valittu ja tallentaa se muuttujaan
        //vähentää kortin arvosta sata jotta vertailu onnistuu toiseen korttiin
        if (cardNumber == 1) {
            firstCard = images[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            //päivitä kortin numeroa
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = images[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            //käytetään säikeistystä kahden kuvan vertaamiseen jotta kuvat pysyvät "auki"
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {

                    // tarkistaa ovatko valitut kuvat samat
                    checkIfSame();
                }
            }, 1000);
        }
    }

    /**
     * tarkistaa ovatko kuvat samat ja tarvittaessa poistaa
     */
    private void checkIfSame() {


        //jos kuvat ovat samat niin poista ne ja lisää piste
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }
            if (clickedSecond == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            //kasvatetaan pelaajan pisteitä
            if (turn == 1) {
                playerPoints++;
                textView.setText("Player1: " + playerPoints);
            } else if (turn == 2) {
                PlayerPoints2++;
                textView2.setText("Player2: " + PlayerPoints2);
            }
            //muussa tapauksessa asetetaan kortti väärinpäin
        } else {
            iv_11.setImageResource(R.drawable.kysymys);
            iv_12.setImageResource(R.drawable.kysymys);
            iv_13.setImageResource(R.drawable.kysymys);
            iv_14.setImageResource(R.drawable.kysymys);
            iv_21.setImageResource(R.drawable.kysymys);
            iv_22.setImageResource(R.drawable.kysymys);
            iv_23.setImageResource(R.drawable.kysymys);
            iv_24.setImageResource(R.drawable.kysymys);
            iv_31.setImageResource(R.drawable.kysymys);
            iv_32.setImageResource(R.drawable.kysymys);
            iv_33.setImageResource(R.drawable.kysymys);
            iv_34.setImageResource(R.drawable.kysymys);


            //vaihda pelaajan vuoroa
            if (turn == 1) {
                turn = 2;
                textView.setTextColor(Color.GRAY);
                textView2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                textView2.setTextColor(Color.GRAY);
                textView.setTextColor(Color.BLACK);
            }

        }
        //jatketaan peliä
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //tarkista onko peli loppunut
        checkIfEnd();
    }

    /**
     * tarkistaa onko peli päättynyt ja kysyy käyttäjältä jatkotoimenpiteet
     */
    private void checkIfEnd() {
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) {

            //näytetään viesti pelin loppumisesta ja pelaajien pisteet sekä valinta jatkosta
            AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
            adb.setMessage("GAME OVER\nPlayer1: " + playerPoints + "\nPlayer2: " + PlayerPoints2)
                    .setCancelable(false)
                    .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            Intent in = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(in);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT GAME", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog a = adb.create();
            a.show();
        }
    }

    /**
     * hakee kuvat drawablesta kortteihin
     */
    private void getImages() {
        image101 = R.drawable.image101;
        image102 = R.drawable.image102;
        image103 = R.drawable.image103;
        image104 = R.drawable.image104;
        image105 = R.drawable.image105;
        image106 = R.drawable.image106;
        image201 = R.drawable.image201;
        image202 = R.drawable.image202;
        image203 = R.drawable.image203;
        image204 = R.drawable.image204;
        image205 = R.drawable.image205;
        image206 = R.drawable.image206;
    }

    /**
     * luo valikon joka sisältää vaihtoehdot taustalle
     *
     * @param menu valikko jossa vaihtoehdot
     * @return true tosi
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.gamemenu, menu);
        return true;
    }

    /**
     * asettaa punaisen taustan näytölle
     */
    public void redBackround() {
        View v = findViewById(R.id.activity_main);
        View root = v.getRootView();
        root.setBackgroundColor(Color.RED);
    }

    /**
     * asettaa vihreän taustan näytölle
     */
    public void greenBackground() {
        View v = findViewById(R.id.activity_main);
        View root = v.getRootView();
        root.setBackgroundColor(Color.GREEN);
    }

    /**
     * asettaa keltaisen taustavärin näytölle
     */
    public void yellowBackground() {
        View v = findViewById(R.id.activity_main);
        View root = v.getRootView();
        root.setBackgroundColor(Color.YELLOW);
    }

    /**
     * asettaa taustaksi rantakuvan näytölle
     */
    public void BeachbackGround() {
        View v = findViewById(R.id.activity_main);
        View root = v.getRootView();
        root.setBackgroundResource(R.drawable.beach);
    }

    /**
     * asettaa taustaksi aurinkokuvan näytölle
     */
    public void SunbackGround() {
        View v = findViewById(R.id.activity_main);
        View root = v.getRootView();
        root.setBackgroundResource(R.drawable.sun);
    }

    /**
     * aloittaa pelin kokonaan alusta
     */
    public void Restart() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    /**
     * tutkii mitä käyttäjä on valinnut valikosta
     *
     * @param item valittava toiminto
     * @return valittu toiminto
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.punainen:
                redBackround();
                break;

            case R.id.vihrea:
                greenBackground();
                break;

            case R.id.keltainen:
                yellowBackground();
                break;

            case R.id.tausta:
                BeachbackGround();
                break;

            case R.id.tausta2:
                SunbackGround();
                break;

            case R.id.aloitaAlusta:
                Restart();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}
