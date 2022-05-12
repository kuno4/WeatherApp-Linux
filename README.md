# WeatherApp-Linux
### Terminal application that downloads and displays live weather data, by Dominic Oertel

Required components: Java 8+, Python 2+ (recommended), BASH shell

### To run the app in your terminal, simply run temerapture.sh

Automated setup (recommended):

Edit ~/.bashrc (or ~/.zshrc if using zsh)

To end of file, append:

> cd path/to/WeatherApp-Linux/;
> ./temperature.sh;
> cd ~;

This setup makes the app run automatically every time opening the terminal.

### To change location (default Towson, MD):

Run location.py and type in the desired city name. If found in the database the location will be set to that city.
