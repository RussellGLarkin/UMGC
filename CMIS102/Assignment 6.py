#created 5 lists for use in the program and a days counter
celsius_list = []
farenheit_list = []
cool_list = []
warm_list = []
hot_list =[]
days = 9

#function to append C and F lists
def add_to_list (temp):
    farenheit = (temp * 1.8) + 32
    celsius_list.append(temp)
    farenheit_list.append(farenheit)

#input the temperatures from the last 10 days
print ('Please enter the temperature (in Celsius) from...', )
while days > 1:
    date = str(days) + ' days ago: '
    temp = eval(input(date))
    add_to_list (temp)
    days -= 1
temp = eval(input('Yesterday: '))
add_to_list (temp)
temp = eval(input('Today: '))
add_to_list (temp)

#print Celsius list
print ('\nCelsius Array: ', celsius_list, '\n')

#define hot_warm_cool function to add counter to list if temp falls within its range
#F < 65 is cool, F > 90 is hot, everything inbetween is warm
def hot_warm_cool (farenheit):
    if farenheit < 65:
        cool_list.append(farenheit)
    elif farenheit > 90:
        hot_list.append(farenheit)
    else:
        warm_list.append(farenheit)

for farenheit in farenheit_list:
    hot_warm_cool (farenheit)

print ('The number of cool days were: ', len(cool_list))
print ('The number of warm days were: ', len(warm_list))
print ('The number of hot days were: ', len(hot_list))



