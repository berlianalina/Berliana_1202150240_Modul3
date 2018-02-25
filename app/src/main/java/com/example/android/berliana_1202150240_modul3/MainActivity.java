package com.example.android.berliana_1202150240_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText mUser, mPass;
    //untuk metode diatas adalah deklarasi seluruh variable yang digunakan didalam class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Inisialisi seluruh variable atau view yang digunakan yaitu
        * 1. mUser dan mPass*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = (EditText)findViewById(R.id.txtUsername);
        mPass = (EditText)findViewById(R.id.txtPassword);
    }
    /*Method ini berfungsi untuk :
    * 1. Mengambil nilai yang diinput user dari edittext mUser dan mPass
    * 2. Melakukan pengecekan kondisi jika nilai strUser = EAD dan nilai strPass = MOBILE
    * 3. Jika tidak sesuai menampilkan usernama or Password Salah
    * 4. Jika sesuai akan menampilkan pesan berhasil Sign-In dan intent ke activity dafarminuman
    * */
    public void loginCheck(){
        String strUser,strPass;
        strUser = mUser.getText().toString();
        strPass = mPass.getText().toString();
        if(!(strUser.equals("EAD") && strPass.equals("MOBILE"))){
            Toast.makeText(this,"Username or Password Salah",Toast.LENGTH_SHORT).show();
            return;
        }else{
            Toast.makeText(this,"Anda Berhasil Login",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,DaftarMinuman.class));
        }
    }
    //metod ini berfungsi untuk memanggil metod loginCheck()
    public void login(View v){
        loginCheck();
    }
}
