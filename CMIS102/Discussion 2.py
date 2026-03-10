#asks for the user's name and greets them
name = input('Hello! What is your name? ')
print('Nice to meet you', name+'!')

# asks for the user's date of birth and current year
born = eval(input('What year were you born? '))
current_year = eval(input('What year are we in right now? '))

#output how old the user is depending on their date of birth
print("If your date of birth was before today's date, then you are", current_year - born, "years old. If not, then you are only", current_year - born - 1, "years old.")
