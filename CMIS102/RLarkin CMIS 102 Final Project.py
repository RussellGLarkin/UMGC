#Created 4 lists for use in the program: bmi, under, normal, over
bmi_list = []
under_list = []
normal_list = []
over_list =[]

#Define height & weight function
def height_weight (a):
    print ('Please enter a HEIGHT in inches for...', )
    inches = (eval(input(friend)))
    print ('Please enter a WEIGHT for...')
    pounds = eval(input(friend))
    bmi = (pounds * 703) / (inches ** 2)
    print('\nBMI for ', friend, bmi, '\n')
    bmi_list.append(bmi)

#Define BMI function to add a '1' to a list if the friend falls in one of these catagories:
#BMI < 18.5 is underweight, BMI > 25 is overweight, everything inbetween is normal
def bmicounter ():
    if bmis < 18.5:
        under_list.append(bmis)
    elif bmis > 25:
        over_list.append(bmis)
    else:
        normal_list.append(bmis)

#create list of "Friends"
friends = ['Ross: ', 'Chandler: ', 'Joey: ', 'Rachael: ', 'Phoebe: ', 'Monica: ']

#call height_weight function to calculate and display BMI
for friend in friends:
    height_weight (friend)

#call bmicounter fuction to count number in each BMI catagory
for bmis in bmi_list:
    bmicounter ()

#Print the number of individuals in each catagory    
print ('The number of people who are under weight: ', len(under_list))
print ('The number of people who are normal weight: ', len(normal_list))
print ('The number of people who are overweight: ', len(over_list))

