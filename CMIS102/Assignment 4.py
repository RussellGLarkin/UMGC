#name the students in the class
print('You have The Simpsons in your class!')
print('Please enter their grades on their latest quiz!\n')

#start group_list at to add grades
group_list = []

#create loop to add grades to list
classmates = ['Homer: ', 'Marge: ', 'Bart: ', 'Lisa: ', 'Maggie: ']
for person in classmates:
    print ('Please enter a grade for...', )
    single_grade = eval(input(person))
    group_list.append(single_grade)
    
#find highest grade and average of class and print the results
highest = max(group_list)
average = sum(group_list)/len(group_list)
print ('\nThe highest grade was: ', highest)
print ('The average quiz grade for the class is: ', average)
