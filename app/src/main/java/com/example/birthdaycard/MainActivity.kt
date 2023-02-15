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


    fun setBDayPersonName(){
        //Converts the birthday persons name to type string from editable and stores
        //it in a variable
        personName=binding.birthdayPersonName.text.toString()

    }


    fun setDateCal() {
        //Getting an instance of the calendar library/class to utilize when the user sets a date
        val calendar = Calendar.getInstance()
        month = calendar.get(Calendar.MONTH)
        day = calendar.get(Calendar.DAY_OF_MONTH)
        year = calendar.get(Calendar.YEAR)

        //When the date picker button is pressed a calendar will pop up, that will allow the user
        //to select a date
        binding.datePicker.setOnClickListener{
            DatePickerDialog(this,this,year,month,day).show()
        }



    }

    //getting the user's age
    fun getAge():Int{
        return age
    }

    //getting the user's birthstone
    fun getBirthStone():String{
        return birthStone
    }
    //getting the user's western zodiac sign
    fun getZodiacSign():String{
        return zodiac
    }

    //When a date is set the code withing this function will be executed
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, day: Int) {
        //Creating a new instance of the calendar class that will deal with finding the current date
        //whenever the user is using the app.
        val todayCal= Calendar.getInstance()
        val currentYear =todayCal.get(Calendar.YEAR)
        val currentMonth= todayCal.get(Calendar.MONTH)
        val currentDay= todayCal.get(Calendar.DAY_OF_MONTH)

        //Months are numbered starting from 0 instead of 1 by default
        //The following when code block translates the months number to it's respective worded meaning
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

        //Displays the DOB that the user chooses
        binding.displayDob.text="$monthWord  $day ,  $year"
        //assigns the year to a variable to send to the next activity
        sendYear=year

        //Based on the users date of birth (month & day of month)
        //their birthstone and western zodiac sign will be accurately calculated

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



        //Calculating Birthday Person's Age
        //if the current month is greater than or equal to the users DOB month and the current day
        //is greater than or equal to the users DOB day the age will be calculated by subtracting the current year
        //from the users DOB year.
        //If this condition is not met the current Year will be subtracted from the DOB year then 1
        //will be subtracted from that value
        //These conditions are needed to ensure the correct date is displayed at all times
        if (currentMonth >= month && currentDay>= day){
            age=currentYear-year
        }

        else{
            age=currentYear-year
            age--
        }

        //If the age ends up to be a negative number it is assigned the value 0
        if (0>age){
            age=0
        }




    }


    fun submitBtn() {
        //When user press submit the following code block will be executed
        binding.submit.setOnClickListener {
            //The birthday person function will be called which sets
            //what ever is in the Input Area for person name to a person variable.
            setBDayPersonName()

            //Connecting the first activity to the second and also sending useful information
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
