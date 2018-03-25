/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView tvWeatherDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        tvWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);
        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherDetails = new String[]{
                "Today , March 25 cloudy 20° C",
                "Monday , March 26 Rainy  16° C",
                "Tuesday , March 27 Hurricane  23° C",
                "Wednesday , March 28 Rainy 25° C",
                "Thursday , March 29 Rainy 23° C",
                "Friday , March 30 Rainy 28° C",
                "Saturday , March 31 Thunderstorms  21° C",
                "Sunday , April 1 Stormy  29° C",
                "Monday , April 2 Stormy  30° C",};
        // TODO (4) Append each String from the fake weather data array to the TextView
        for(String weather : weatherDetails){
            tvWeatherDisplay.append(weather + "\n\n\n");
        }
    }
}