package com.tinyproject.friendroid.allbanglanewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list1,list2;

    String[] names1 = {"প্রথম আলো","ইত্তেফাক","কালের কন্ঠ","যুগান্তর","বাংলাদেশ প্রতিদিন","মানবজমিন","সমকাল",
            "আমাদের সময়","জনকন্ঠ","ইনকিলাম","ভোরের কাগজ","সংবাদ",};
    String[] names2={"মানবকন্ঠ","নয়া দিগন্ত","যায়যায়দিন","সংগ্রাম","আলোকিত বাংলাদেশ",
            "আজকালের খবর","আজকের পত্রিকা","প্রতিদিনের সংবাদ","জাগোবাংলা","নতুন সংবাদ"};
    int[] images1 ={R.drawable.prothom_alo,R.drawable.ittefaq,R.drawable.kaler_kantho,R.drawable.jugantor,
            R.drawable.bangladesh_pratidin,
            R.drawable.manob_jamin,R.drawable.somokal,R.drawable.amader_somoy,R.drawable.jonokontho,R.drawable.inkilab,
            R.drawable.vorer_kagoj,R.drawable.songbad,};
    int[] images2={R.drawable.manob_kontho,R.drawable.naya_diganta,R.drawable.jayjaydin,R.drawable.songran,
            R.drawable.alokito_bangladesh,R.drawable.ajkaler_khobor,
            R.drawable.ajker_potrika,R.drawable.protidiner_songbad,R.drawable.jago_bangla,R.drawable.notun_songbad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1 = findViewById(R.id.listViewId1);
        list2 = findViewById(R.id.listViewId2);

        MyListAdapter adapter1 = new MyListAdapter(MainActivity.this,names1,images1);
        list1.setAdapter(adapter1);

        MyListAdapter2 adapter2 = new MyListAdapter2(MainActivity.this,names2,images2);
        list2.setAdapter(adapter2);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.prothomalo.com");
                    startActivity(intent);
                }else if (i==1){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.ittefaq.com.bd");
                    startActivity(intent);
                }else if (i==2){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.kalerkantho.com/index.php");
                    startActivity(intent);
                }else if (i==3){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","https://www.jugantor.com");
                    startActivity(intent);
                }else if (i==4){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.bd-pratidin.com");
                    startActivity(intent);
                }else if (i==5){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.mzamin.com");
                    startActivity(intent);
                }else if (i==6){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://samakal.com/");
                    startActivity(intent);
                }else if (i==7){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.dainikamadershomoy.com");
                    startActivity(intent);
                }else if (i==8){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://web.dailyjanakantha.com");
                    startActivity(intent);
                }else if (i==9){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","https://www.dailyinqilab.com");
                    startActivity(intent);
                }else if (i==10){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.bhorerkagoj.net");
                    startActivity(intent);
                }else if (i==11){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://thesangbad.net");
                    startActivity(intent);
                }


            }
        });

        /*------------for second list----------*/

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.manobkantha.com");
                    startActivity(intent);
                } else if (i==1){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.dailynayadiganta.com");
                    startActivity(intent);
                }else if (i==2){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.jaijaidinbd.com");
                    startActivity(intent);
                }else if (i==3){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.dailysangram.com");
                    startActivity(intent);
                }else if (i==4){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.alokitobangladesh.com");
                    startActivity(intent);
                }else if (i==5){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.ajkalerkhobor.com");
                    startActivity(intent);
                }else if (i==6){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.ajkerpatrika.com");
                    startActivity(intent);
                }else if (i==7){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://www.protidinersangbad.com");
                    startActivity(intent);
                }else if (i==8){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","https://www.jagobangla.com");
                    startActivity(intent);
                }else if (i==9){
                    Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                    intent.putExtra("url","http://dailynatunsangbad.com");
                    startActivity(intent);
                }
            }
        });
    }
}
