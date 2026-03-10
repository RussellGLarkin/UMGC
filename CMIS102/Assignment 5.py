#explain the criteria for the new password
print('It is time to change your password! The criteria for your new password are:')
new_pw = input("""\n- Must be between 5 and 10 characters.
               \n- It cannot start, or end with, the symbol #.
               \n- It cannot contain "umgc" in any combination of upper or lower case letters.
               \n\nPlease enter your password now: """)

#check length of password is between 5 and 10 characters
num_letters = len(new_pw)
if num_letters > 4 and num_letters < 11:
    if new_pw.startswith('#') or new_pw.endswith('#'):
        reason = 'is invalid. Password starts or ends with #'
    elif 'umgc' in new_pw.lower():
        reason = 'is invalid. Password contains UMGC in upper or lower case letters.'
    else:
        reason = 'is a VALID password!'
else:
    reason = 'is invalid. Password is not between 5 and 10 characters.'

#output the original password, and whether that password is valid or invalid
print(new_pw, reason)
