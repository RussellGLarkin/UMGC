# prompt user for the number of hours worked for that week and the weekly sales
hours_worked = float(input("Hours worked this week: "))
weekly_sales = float(input("Weekly sales: "))

# $8 per hour and 10% commission
hourly_pay = 8
commission = .1

# compute the total pay
total_pay = (hours_worked * hourly_pay + weekly_sales * commission)

print("Your total pay this week is: $" + str(total_pay));
