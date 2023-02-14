package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.birthdaycard.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding;
    var zodiac = "Zodiac"
    var chineseZodiacArray= mutableListOf<MutableList<Int>>()
        /*
        arrayOf<Int>(
        //rat
        *arrayOf<Int>(),
        //ox
        arrayOf(),
        //tiger
        arrayOf(),
        //rabbit
        arrayOf(),
        //dragon
        arrayOf(),
        //snake
        arrayOf(),
        //horse
        arrayOf(),
        //goat
        arrayOf(),
        //monkey
        arrayOf(),
        //rooster
        arrayOf(),
        //dog
        arrayOf(),
        //pig
        arrayOf(),
    )
*/


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

    private fun setName(){
        var name=intent.getStringExtra("name")
        binding.name.text=name
    }

    private fun setAge(){
        var age = intent.getIntExtra("age",0)
        binding.age.text= "You are $age years old, an awesome age for an awesome person. I hope you live to see many more"
    }

    private fun setBirthstone(){
        var birthstone=intent.getStringExtra("birthstone").toString()
        binding.birthstone.text="Your birthstone is $birthstone, a good lucking stone for a good looking person"
    }

    private fun setZodiacSign(){
        zodiac=intent.getStringExtra("zodiac").toString()
        binding.zodiac.text="Your western zodiac sign is $zodiac (left image)."
    }



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

    private fun setChineseZodiacSign(){

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


        var indexForLoop=1900

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

        while (2101>indexForLoop){

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


            indexForLoop++
        }

        Log.d("mytag",indexForLoop.toString())
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

    fun findPersonsChineseZodiacSign(){

        var year = intent.getIntExtra("dobYear",0)
        var yearIndex =1900
        var i=0

        while(2101>yearIndex){

            //rat
            if ( chineseZodiacArray[0][i] == year){
                binding.chineseZodiac.setImageResource(R.drawable.rat)
                binding.chinese.text="You were born under the rat chinese zodiac sign (right image)"
                break
            }

            //ox
            else if (chineseZodiacArray[1][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.ox)
                break
            }

            //tiger
            else if (chineseZodiacArray[2][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.tiger)
                break
            }

            //rabbit
            else if (chineseZodiacArray[3][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.rabbit)
                break
            }

            //dragon
            else if (chineseZodiacArray[4][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.dragon)
                break
            }

            //snake
            else if ( chineseZodiacArray[5][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.snake)
                break
            }

            //horse
            else if (chineseZodiacArray[6][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.horse)
                break
            }

            //goat
            else if (chineseZodiacArray[7][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.goat)
                break
            }

            //monkey
            else if (chineseZodiacArray[8][i]== year){

                binding.chineseZodiac.setImageResource(R.drawable.monkey)
                break
            }

            //rooster
            else if (chineseZodiacArray[9][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.rooster)
                break
            }

            //dog
            else if (chineseZodiacArray[10][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.dog)
                break
            }

            //pig
            else if (chineseZodiacArray[11][i]== year){
                binding.chineseZodiac.setImageResource(R.drawable.pig)
                break
            }

            yearIndex++
            i++


        }


    }




}