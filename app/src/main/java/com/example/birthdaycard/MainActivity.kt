package com.example.birthdaycard


import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build.VERSION_CODES.M
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.core.content.ContextCompat
import com.example.birthdaycard.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity(),DatePickerDialog.OnDateSetListener {

    var month=0
    var day=0
    var year=0
    var sendYear=0
    private var personName:String ="Error Not Initialized"
    private var age=0
    private var birthStone="Birthstone"
    private var zodiac="Zodiac"
    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDateCal()
        submitBtn()

    }


    fun getBDayPersonName():String{
        return personName
    }

    //Stores the Birthday Person's names
    fun setBDayPersonName(){
        personName=binding.birthdayPersonName.text.toString()

    }


    fun setDateCal() {
        //Calendar
        val calendar = Calendar.getInstance()


        month = calendar.get(Calendar.MONTH)
        day = calendar.get(Calendar.DAY_OF_MONTH)
        year = calendar.get(Calendar.YEAR)


        binding.datePicker.setOnClickListener{

            DatePickerDialog(this,this,year,month,day).show()

        }



    }


    fun getAge():Int{
        return age
    }

    fun getBirthStone():String{
        return birthStone
    }
    fun getZodiacSign():String{
        return zodiac
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, day: Int) {
        val todayCal= Calendar.getInstance()
        val currentYear =todayCal.get(Calendar.YEAR)
        val currentMonth= todayCal.get(Calendar.MONTH)
        val currentDay= todayCal.get(Calendar.DAY_OF_MONTH)




        val monthWord = when(month){
            0->"Jan"
            1->"Feb"
            2->"Mar"
            3->"Apr"
            4->"May"
            5->"Jun"
            6->"Jul"
            7->"Aug"
            8->"Sep"
            9->"Oct"
            10->"Nov"
            else->"Dec"
        }
        binding.displayDob.text="$monthWord  $day ,  $year"

        sendYear=year

        //January 20- February 18
        if((month==0 && day>=20) || (month==1 && 18>=day)){
            birthStone="Garnet"
            zodiac="Aquarius"
        }


        //February 19 - March 20
        else if((month==1 && day>=19) || (month==2 && 20>=day)){
            birthStone="Amethyst"
            zodiac="Pisces"
        }

        //March 21 - April 19
        else if((month==2 && day>=21) || (month==3 && 19>=day)){
            birthStone="Bloodstone"
            zodiac="Aries"
        }


        //April 20 - May 20
        else if ((month==3 && day>=20) || (month==4 && 20>=day)){
            birthStone="Sapphire"
            zodiac="Taurus"
        }


        //May 21 - June 20
        else if((month==4 && day>=21) || (month==5 && 20>=day)){
            birthStone="Agate"
            zodiac="Gemini"
        }

        //June 21 - July 22
        else if((month==5 && day>=21) || (month==6 && 22>=day)){
            birthStone="Emerald"
            zodiac="Cancer"
        }

        //July 23 - August 22
        else if((month==6 && day>=23) || (month==7 && 22>=day)){
            birthStone="Onyx"
            zodiac="Leo"
        }

        //August 23 - September 22
        else if((month==7 && day>=23) || (month==8 && 22>=day)){
            birthStone="Carnelian"
            zodiac="Virgo"
        }


        //September 23 - October 22
        else if((month==8 && day>=23) || (month==9 && 22>=day)){
            birthStone="Peridot"
            zodiac="Libra"
        }


        //October 23 - November 21
        else if((month==9 && day>=23) || (month==10 && 21>=day)){
            birthStone="Beryl"
            zodiac="Scorpio"
        }

        //November 22 - December 21
        else if((month==10 && day>=22) || (month==11 && 21>=day)){
            birthStone="Topaz"
            zodiac="Sagittarius"
        }

        //December 22 - January 19
        else{
            birthStone="Ruby"
            zodiac="Capricorn"
        }








        if (currentMonth >= month && currentDay>= day){
            age=currentYear-year
        }

        else{
            age=currentYear-year
            age--
        }

        if (0>age){
            age=0
        }




    }











    fun submitBtn() {

        binding.submit.setOnClickListener {
            setBDayPersonName()


            val intent = Intent(this, MainActivity2::class.java).also{
                it.putExtra("name",getBDayPersonName())
                it.putExtra("age",getAge())
                it.putExtra("birthstone",getBirthStone())
                it.putExtra("zodiac",getZodiacSign())
                it.putExtra("dobYear",sendYear)
                startActivity(it)
            }
        }
    }






}
