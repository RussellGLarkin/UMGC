#Create a spending limit for yourself
#Once the budget has been reached, the credit card will be turned off until next month
#This could also work for the US Gov't
print ('You have a monthly budget of $100! Please enter your daily spending below.\nThe program will let you know when you have hit your limit.\n')
#set spending to 0
spending = 0
#add daily spending until you reach $100 dollars
while spending < 100:
    spent = eval(input('What did you spend today: $'))
    spending = spending + spent
    #Update the user where they're at according to their budget
    print('You have spent', spending, 'so far.\n')
#scold the user if they go over budget.
if spending > 100:
    print('YOU HAVE GONE OVER YOUR LIMIT! YOU NEED TO STOP SPENDING RIGHT NOW!!')
else:
    print ('You have balanced your budget! Well done! Stop spending until next month')
