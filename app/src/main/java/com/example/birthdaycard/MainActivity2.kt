package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaycard.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding;
    var zodiac = "Zodiac"
    var rat= arrayOf(0)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

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

    private fun setChineseZodiacSign(){
        var chineseZodiacYear=1900
        var i=0
        while (2101>chineseZodiacYear){
            rat[i]=chineseZodiacYear+12
            i++
            //stopped here
        }

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




}