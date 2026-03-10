import math

#Calculate the crosswind component for aircraft landing
#input for true wind angle off the nose and wind speed

speed = eval(input('What is the wind speed in kts? '))
angle = eval(input('What is the true wind angle off the nose? '))

#convert angle from degrees to radians
radians = angle / 360 * 2 * math.pi

#calculate crosswing utilizing: cross = speed * sin.angle and round up to nearest whole number 
cross = speed * math.sin(radians)
round_cross = math.ceil(cross)
print('The crosswind component is:', round_cross)
