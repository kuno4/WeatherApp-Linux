#/bin/bash
javac *.java

java config

lat=$(cat lat.txt)
lon=$(cat lon.txt)
api=$(cat api.txt)

nc -z 8.8.8.8 53  >/dev/null 2>&1
online=$?

if [ $online -eq 0 ]; then
    
    curl "https://api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$lon&appid=$api" > temp.txt -s
    curl "https://api.openweathermap.org/data/2.5/air_pollution?lat=$lat&lon=$lon&appid=$api" > air.txt -s
    
    rm lat.txt
    rm lon.txt
    rm api.txt
    
    city=$(head -1 weather.config)

    echo "\nCurrent weather in $city:"

    java temperature
    java weather
    java humidity
    java minmax

    echo "\nAir pollution levels:\n"
    
    java air
    rm *.txt
    rm *.class

    echo ""

else
    echo "No connection\n"
fi
