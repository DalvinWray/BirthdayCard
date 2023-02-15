package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.birthdaycard.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding;
     var zodiac = "Zodiac"

    //Will be used to store the respective years of the various chinese zodiac sign
    //It is a mutable list however I named the variable  an array because at first it was an array and I was too
    //lazy to change it.
     var chineseZodiacArray= mutableListOf<MutableList<Int>>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        setChineseZodiacSign()
        findPersonsChineseZodiacSign()
        setName()
        setAge()
        setBirthstone()
        setZodiacSign()
        setZodiacAndBirthstoneImage()
    }

    //Getting  the birthday persons name from the first activity
    //and placing it into a textfield
    private fun setName(){
        var name=intent.getStringExtra("name")
        binding.name.text=name
    }

    //Getting the birthday Person's age from the first activity and assigning it to a text field
    private fun setAge(){
        var age = intent.getIntExtra("age",0)
        binding.age.text= "You are $age years old, an awesome age for an awesome person. I hope you live to see many more"
    }

    //Getting the Birthday Person's birthstone from the main activity and assigning it to a text field
    private fun setBirthstone(){
        var birthstone=intent.getStringExtra("birthstone").toString()
        binding.birthstone.text="Your birthstone is $birthstone, a good lucking stone for a good looking person"
    }

    //Getting the birthday Person's western zodiac sign from the main activity and assigning it to a text field
    private fun setZodiacSign(){
        zodiac=intent.getStringExtra("zodiac").toString()
        binding.zodiac.text="Your western zodiac sign is $zodiac (left image)."
    }


    //Setting various images based on the user's birthstone and zodiac sign.
    //The zodiac sign alone is the condition used to achieve this because the periods are the same.
    private fun setZodiacAndBirthstoneImage(){
        //January 20 - February 18
        if (zodiac=="Aquarius"){
            binding.birthstoneImage.setImageResource(R.drawable.garnet)
            binding.zodiacImage.setImageResource(R.drawable.aquarius)
        }

        //February 19 - March 20
        else if (zodiac=="Pisces"){
            binding.birthstoneImage.setImageResource(R.drawable.amethyst)
            binding.zodiacImage.setImageResource(R.drawable.pisces)
        }


        //March 21 - April 19
        else if (zodiac=="Aries"){
            binding.birthstoneImage.setImageResource(R.drawable.bloodstone)
            binding.zodiacImage.setImageResource(R.drawable.aries)
        }


        //April 20 - May 20
        else if (zodiac=="Taurus"){
            binding.birthstoneImage.setImageResource(R.drawable.sapphire)
            binding.zodiacImage.setImageResource(R.drawable.taurus)
        }

        //May 21 - June 20
        else if (zodiac=="Gemini"){
            binding.birthstoneImage.setImageResource(R.drawable.agate)
            binding.zodiacImage.setImageResource(R.drawable.gemini)
        }

        //June 21 - July 22
        else if (zodiac=="Cancer"){
            binding.birthstoneImage.setImageResource(R.drawable.emerald)
            binding.zodiacImage.setImageResource(R.drawable.cancer)
        }

        //July 23 - August 22
        else if (zodiac=="Leo"){
            binding.birthstoneImage.setImageResource(R.drawable.onyx)
            binding.zodiacImage.setImageResource(R.drawable.leo)
        }

        //August 23 - September 22
        else if (zodiac=="Virgo"){
            binding.birthstoneImage.setImageResource(R.drawable.carnelian)
            binding.zodiacImage.setImageResource(R.drawable.virgo)
        }

        //September 23 - October 22
        else if (zodiac=="Libra"){
            binding.birthstoneImage.setImageResource(R.drawable.peridot)
            binding.zodiacImage.setImageResource(R.drawable.libra)
        }

        //October 23 - November 21
        else if (zodiac=="Scorpio"){
            binding.birthstoneImage.setImageResource(R.drawable.beryl)
            binding.zodiacImage.setImageResource(R.drawable.scorpio)
        }

        //November 22 - December 21
        else if (zodiac=="Sagittarius"){
            binding.birthstoneImage.setImageResource(R.drawable.topaz)
            binding.zodiacImage.setImageResource(R.drawable.sagittarius)
        }

        //December 22 - January 19
        else if (zodiac=="Capricorn"){
            binding.birthstoneImage.setImageResource(R.drawable.ruby)
            binding.zodiacImage.setImageResource(R.drawable.capricorn)
        }



    }

    //The following function calculates the chinese zodiac sign for the birthday person
    private fun setChineseZodiacSign(){

        //Starting from 1900 the various animals for the chinese zodiac is assigned a year
        //based on when their sign would be ruling
        //For each animal every 12 year there sign rules
        var chineseZodiacYearRat=1900
        var chineseZodiacYearOx=1901
        var chineseZodiacYearTiger=1902
        var chineseZodiacYearRabbit=1903
        var chineseZodiacYearDragon=1904
        var chineseZodiacYearSnake=1905
        var chineseZodiacYearHorse=1906
        var chineseZodiacYearGoat=1907
        var chineseZodiacYearMonkey=1908
        var chineseZodiacYearRooster=1909
        var chineseZodiacYearDog=1910
        var chineseZodiacYearPig=1911


        //A mutable list is created for each animal, these lists will be added to another mutable list
        //to create a 2d Mutable list later on
        var mutableRatList = mutableListOf<Int>()
        var mutableOxList = mutableListOf<Int>()
        var mutableTigerList = mutableListOf<Int>()
        var mutableRabbitList = mutableListOf<Int>()
        var mutableDragonList = mutableListOf<Int>()
        var mutableSnakeList = mutableListOf<Int>()
        var mutableHorseList = mutableListOf<Int>()
        var mutableGoatList = mutableListOf<Int>()
        var mutableMonkeyList = mutableListOf<Int>()
        var mutableRoosterList = mutableListOf<Int>()
        var mutableDogList = mutableListOf<Int>()
        var mutablePigList = mutableListOf<Int>()

        //This index is used for the below for loop  it is incremented by 1 at the bottom of the loop
        // until the loop condition is false
        var indexForLoop=1900

        while (2101>indexForLoop){

            //The ruling year of the respective chinese zodiac sign is added to it's respective mutable list

            mutableRatList.add(chineseZodiacYearRat)
            mutableOxList.add(chineseZodiacYearOx)
            mutableTigerList.add(chineseZodiacYearTiger)
            mutableRabbitList.add(chineseZodiacYearRabbit)
            mutableDragonList.add(chineseZodiacYearDragon)
            mutableSnakeList.add(chineseZodiacYearSnake)
            mutableHorseList.add(chineseZodiacYearHorse)
            mutableGoatList.add(chineseZodiacYearGoat)
            mutableMonkeyList.add(chineseZodiacYearMonkey)
            mutableRoosterList.add(chineseZodiacYearRooster)
            mutableDogList.add(chineseZodiacYearDog)
            mutablePigList.add(chineseZodiacYearPig)

            //After adding the respective values to their respective mutable list
            //the variable containing the year of the chinese zodiac sign will be increased by 12
            chineseZodiacYearRat+=12
            chineseZodiacYearOx+=12
            chineseZodiacYearTiger+=12
            chineseZodiacYearRabbit+=12
            chineseZodiacYearDragon+=12
            chineseZodiacYearSnake+=12
            chineseZodiacYearHorse+=12
            chineseZodiacYearGoat+=12
            chineseZodiacYearMonkey+=12
            chineseZodiacYearRooster+=12
            chineseZodiacYearDog+=12
            chineseZodiacYearPig+=12

            //The following variable will be increased by 1 until the while loop condition is false
            indexForLoop++
        }


        //When the while loop is finished the various mutable lists for the respective chinese zodiac signs will be added to
        // the main mutable list
        chineseZodiacArray.add(mutableRatList)
        chineseZodiacArray.add(mutableOxList)
        chineseZodiacArray.add(mutableTigerList)
        chineseZodiacArray.add(mutableRabbitList)
        chineseZodiacArray.add(mutableDragonList)
        chineseZodiacArray.add(mutableSnakeList)
        chineseZodiacArray.add(mutableHorseList)
        chineseZodiacArray.add(mutableGoatList)
        chineseZodiacArray.add(mutableMonkeyList)
        chineseZodiacArray.add(mutableRoosterList)
        chineseZodiacArray.add(mutableDogList)
        chineseZodiacArray.add(mutablePigList)


    }

    //The following function uses the chinese zodiac sign mutable list to display a respective image and text view
    //depending on the users DOB
    private fun findPersonsChineseZodiacSign(){

        //Person's birthday DOB year
        var year = intent.getIntExtra("dobYear",0)

        //Apart of the while loop condition, it is incremented by 1 with each iteration
        var yearIndex =1900

        //With every iteration of the loop the below value will be incremented.
        // It increments the column of the 2 dimensional list for the respective zodiac sign
        var i=0

        //This while loop will search the 2 dimensional mutable list until it finds a matching value
        //to the birthday Person's DOB year
        //Only the second index value will change because the first index value basically represents
        // the respective lists containing the types of chinese zodiac sign.
        //The second index value references the position of the items in the sublists which would be
        // the numerous years associated with each chinese zodiac sign

        while(2101>yearIndex){

            //rat
            if ( chineseZodiacArray[0][i] == year){
                binding.chinese.text="You were born under the Rat chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.rat)
                break
            }

            //ox
            else if (chineseZodiacArray[1][i]== year){
                binding.chinese.text="You were born under the Ox chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.ox)

                break
            }

            //tiger
            else if (chineseZodiacArray[2][i]== year){
                binding.chinese.text="You were born under the Tiger chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.tiger)
                break
            }

            //rabbit
            else if (chineseZodiacArray[3][i]== year){
                binding.chinese.text="You were born under the Rabbit chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.rabbit)
                break
            }

            //dragon
            else if (chineseZodiacArray[4][i]== year){
                binding.chinese.text="You were born under the Dragon chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.dragon)
                break
            }

            //snake
            else if ( chineseZodiacArray[5][i]== year){
                binding.chinese.text="You were born under the Snake chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.snake)
                break
            }

            //horse
            else if (chineseZodiacArray[6][i]== year){
                binding.chinese.text="You were born under the Horse chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.horse)
                break
            }

            //goat
            else if (chineseZodiacArray[7][i]== year){
                binding.chinese.text="You were born under the Goat chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.goat)
                break
            }

            //monkey
            else if (chineseZodiacArray[8][i]== year){
                binding.chinese.text="You were born under the Monkey chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.monkey)
                break
            }

            //rooster
            else if (chineseZodiacArray[9][i]== year){
                binding.chinese.text="You were born under the Rooster chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.rooster)
                break
            }

            //dog
            else if (chineseZodiacArray[10][i]== year){
                binding.chinese.text="You were born under the Dog chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.dog)
                break
            }

            //pig
            else if (chineseZodiacArray[11][i]== year){
                binding.chinese.text="You were born under the Pig chinese zodiac sign (right image)"
                binding.chineseZodiac.setImageResource(R.drawable.pig)
                break
            }

            yearIndex++
            i++


        }


    }




}