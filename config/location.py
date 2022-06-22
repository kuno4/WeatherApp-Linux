import os

coordinates = {
    "Baltimore":["39.287856", "-76.613173"],
    "Towson":["39.396092", "-76.608081"],
    "Washington":["38.898783", "-77.037827"],
    "New York":["40.718439", "-73.996277"],
    "Los Angeles":["34.046181", "-118.252310"],
    "Boston":["42.363752", "-71.055176"],
    "Frederick":["39.412696", "-77.411486"],
    "Rockville":["39.084564", "-77.153084"],
    "Miami":["25.798879", "-80.200528"],
    "New Orleans":["29.955003", "-90.072746"],
    "Dallas":["32.779294", "-96.838453"],
    "Minneapolis":["44.974355", "-93.269267"],
    "Chicago":["41.865664", "-87.626880"],
    "Seattle":["47.604644", "-122.331523"],
    "San Fransisco":["37.768507", "-122.416969"]
}

city = input("Which city would you like to set the location to?\n")

try:

    temp = coordinates[city][0]

    file = open("/home/kuno4/Code/BASH/weatherdata/weather.config", "r")

    lat = file.readline()
    lat = file.readline()
    lon = file.readline()
    api = file.readline()

    file.close()
    os.remove("/home/kuno4/Code/BASH/weatherdata/weather.config")

    out = open("/home/kuno4/Code/BASH/weatherdata/weather.config", "w")
    out.write(city + "\n")
    out.write(coordinates[city][0] + "\n")
    out.write(coordinates[city][1] + "\n")
    out.write(api)

    print("Location successfully changed")

except:
    print("The city you entered was not found in the database")
