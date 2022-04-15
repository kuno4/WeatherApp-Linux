#/bin/bash
javac *.java

java config

lat=$(cat lat.txt)
lon=$(cat lon.txt)
api=$(cat api.txt)

curl "https://api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$lon&appid=$api" > temp.txt -s

rm lat.txt
rm lon.txt
rm api.txt

echo "Today's weather:"

java temperature
java weather
java minmax

rm *.txt
rm *.class

echo ""
