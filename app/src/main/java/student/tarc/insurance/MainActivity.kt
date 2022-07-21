package student.tarc.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import student.tarc.insurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //TODO 2: Crete an instance of View Binding
    //lateinit = late initialize
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO 3: initialize view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonCalculate.setOnClickListener{
            //TODO 4: Get input from the user
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker  = binding.checkBoxSmoker.isChecked
            var premium = 0


            if (age == 5){
                premium += 150
                if (gender.equals("radioButtonMale")){
                    premium += 200
                }
                if(smoker){
                    premium += 300
                }
            }else if(age == 4){
                premium += 150
                if (gender.equals("radioButtonMale")){
                    premium += 200
                }
                if(smoker){
                    premium += 250
                }
            }else if(age == 3){
                premium += 120
                if (gender.equals("radioButtonMale")){
                    premium += 150
                }
                if(smoker){
                    premium += 200
                }
            }else if(age == 2){
                premium += 90
                if (gender.equals("radioButtonMale")){
                    premium += 100
                }
                if(smoker){
                    premium += 150
                }
            }else if(age == 1){
                premium += 70
                if (gender.equals("radioButtonMale")){
                    premium += 50
                }
                if(smoker){
                    premium += 100
                }
            }else{
                premium += 60
            }

            binding.textViewPremium.text = String.format("RM%d",premium)

        }

        binding.buttonReset.setOnClickListener{
            binding.spinnerAge.setSelection(0)
            binding.checkBoxSmoker.isChecked = false
            binding.radioGroupGender.clearCheck()
            binding.textViewPremium.text = ""
        }
    }
}