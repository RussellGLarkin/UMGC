#introduce the theater and give ticket prices
print ('Welcome to COVIDless Theaters! Age ranges are as follows:')
print ('$8 Child tickets (10 and under), $10 Senior (50 and older), $15 adult tickets')
print ('There will be a $5 surcharge for movies in 3d')
print ("")

#ask patron for their age
age = eval(input('How old are you?: '))

#set price for tickets: $8 child (10 and under), $10 senior (50 and older), $15.
if age <= 10:
    ticket_price = 8
elif age >= 50:
    ticket_price = 10
else:
    ticket_price = 15

#ask the user if they would like to see the movie in 3D. There will be a $5 surcharge for movies in 3d.
three_d = input('Would you like to see this movie in 3D? (y or n): ')
if three_d == 'y' or 'yes':
    total_price = ticket_price + 5
else:
    total_price = ticket_price + 0

#output the total ticket price
print('The price of your ticket is: $', total_price)
