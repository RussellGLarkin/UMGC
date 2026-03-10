#ask what the users name is and tell them what you have in stock
user = input('What is your name?: ')
print('\nHello,', user, 'thank you for shopping with Online Grocery Market')
print('We only have oranges, apples, and bananas in stock at the moment!\n')

#give the prices for Oranges ($1), Apples($1.5), and Bananas ($1.75)
print('Oranges are $1.00 \nApples are $1.50 \nBananas are $1.75')
oranges = eval(input('How many Oranges would you like to buy?: '))
apples = eval(input('How many Apples would you like to buy?: '))
bananas = eval(input('How many Bananas would you like to buy?: '))

#notify the customer there will be a $.50 upcharge for credit card
print('\nThere will be a $0.50 charge if you are using a credit card.')

#Nntify them there will be a $.50 upcharge for credit cards
credit = input('Will you be using a credit card today? (yes or no): ')

#calculate total cost
if credit == 'yes':
    total_credit = (oranges * 1) + (apples * 1.5) + (bananas * 1.75) + .5
    print('Your total today comes out to: $', total_credit)
else:
    total_nocredit = (oranges * 1) + (apples * 1.5) + (bananas * 1.75)
    print('Your total today comes out to: $', total_nocredit)

