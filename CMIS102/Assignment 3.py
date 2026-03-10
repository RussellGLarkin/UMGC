#different qualities and prices per sq ft
print ('Welcome to Carpet-for-Less! We have three different qualities to choose from: \n')
print ('High Quality, $10 per sq ft\nMedium Quality, $5 per sq ft\nLow Quality, $1 per sq ft\n')

#ask for sq footage and calculate total area
print('Let me ask you some questions about the room you want to have carpeted.')
length = eval(input('What is the length of the room: '))
width = eval(input('What is the width of the room: '))
total_area = length * width

#ask the user what quality of carpet they would like to buy
quality = input('What quality of carpet would you like to buy? (high, med, low): ')
if quality == 'high':
    total_price = (total_area * 10)
elif quality == 'med':
    total_price = (total_area * 5)
elif quality == 'low':
    total_price = (total_area * 1)
else:
    print('ERROR, please type: high, med, or low')

#output the total price
print('The price to carpet your room is: $', total_price)
