# WeatherApp-Linux
### Terminal application that downloads and displays live weather data, by Dominic Oertel

Required components: Java 8+, Linux Operating System

### To run the app in your terminal, simply run temerapture.sh

Automated setup (recommended):

Edit ~/.bashrc (or ~/.zshrc if using zsh)

To end of file, append:

> cd path/to/WeatherApp-Linux/;
> ./temperature.sh;
> cd ~;

This setup makes the app run automatically every time opening the terminal

### To change location (default is Towson, MD):

Edit weather.config, substituting latitude and longitude values as desired 
These may easily be acquired via Google Maps

Note: Tokens in .config file must be sepererated by spaces
