package com.netguru.codereview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import com.netguru.codereview.ui.MainFragment
// commented because there is no package with name ui and class with name MainFragment
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * To use the android navigation component, we should create an android resource
         * file for our nav graph and configure the navigations
         * There is no  package with the name ui to hold our MainFragment class.
         * There is no fragment container with id container on activity_main file.

        To fix these bugs we should do the following:-
        - create a package with name ui
        - create a fragment class with the name MainFragment
        - add fragment container to the main activity
         * and after that every things will be good otherwise it will lead to compilation error
         * unresolved reference
         * **/

          //commented because it lead to compilation error
         // supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment()).commitNow()
    }
}
