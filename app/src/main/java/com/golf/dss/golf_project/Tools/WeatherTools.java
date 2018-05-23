package com.golf.dss.golf_project.Tools;

public class WeatherTools {

    public static String getWindDirection(int deg){
        if (deg>11.25 && deg<33.75){
            return "NNE";
        }else if (deg>33.75 && deg<56.25){
            return "ENE";
        }else if (deg>56.25 && deg<78.75){
            return "E";
        }else if (deg>78.75 && deg<101.25){
            return "ESE";
        }else if (deg>101.25 && deg<123.75){
            return "ESE";
        }else if (deg>123.75 && deg<146.25){
            return "SE";
        }else if (deg>146.25 && deg<168.75){
            return "SSE";
        }else if (deg>168.75 && deg<191.25){
            return "S";
        }else if (deg>191.25 && deg<213.75){
            return "SSW";
        }else if (deg>213.75 && deg<236.25){
            return "SW";
        }else if (deg>236.25 && deg<258.75){
            return "WSW";
        }else if (deg>258.75 && deg<281.25){
            return "W";
        }else if (deg>281.25 && deg<303.75){
            return "WNW";
        }else if (deg>303.75 && deg<326.25){
            return "NW";
        }else if (deg>326.25 && deg<348.75){
            return "NNW";
        }else{
            return "N";
        }
    }
}
