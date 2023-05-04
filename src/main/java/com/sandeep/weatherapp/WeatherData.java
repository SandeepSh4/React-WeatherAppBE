package com.sandeep.weatherapp;

public class WeatherData {
    private String name;
    private Main main;
    private Weather[] weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Main {
        private double temp;
        private double feels_like;
        private int humidity;



        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }
    }

    public static class Weather {
        private String main;
        private String icon;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = "https://openweathermap.org/img/wn/"+icon+"@2x.png";
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }
    }
}

