#Mail function imports
from email.message import EmailMessage
import smtplib

from passwords import EMAIL_ADDRESS, EMAIL_PASSWORD

#Validate function imports
from string import (
    punctuation, whitespace, digits,
    ascii_lowercase, ascii_uppercase)

import re

import andmed

class Mail:

    def sendMail(self, recipient, nimi):
        msg = EmailMessage()
        msg['Subject'] = 'Test'
        msg['From'] = EMAIL_ADDRESS
        msg['To'] = recipient
        msg.set_content(f'''
        Tere {nimi}!
        Teie konto on loodud.
        ''')
        with smtplib.SMTP_SSL('smtp.gmail.com', 465) as smtp:
            smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)
            smtp.send_message(msg)
        
#mail = Mail()
#mail.sendMail("saaja@gmail.com", "Kristjan")

class Validate:

    def validate_email(email):
        regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'

        if(re.fullmatch(regex, email)):
            return True
        else:
            return False

    def validate_name(name):
        name = name.strip()
        name_size = len(name)
        if name_size > 1:
            return name.isalpha()
        else:
            return False

    def validate_password(password):
        #Strip et eemaldada tühikud, tabid, enterid jne
        new_password = password.strip()

        min_size = 6
        max_size = 20
        password_size = len(new_password)

        if password_size < min_size or password_size > max_size:
            return False

        valid_chars = {'-', '_', '.', '!', '@', '#', '$', '^', '&', '(', ')'}
        invalid_chars = set(punctuation + whitespace) - valid_chars

        for char in invalid_chars:
            if char in new_password:
                return False

        password_has_digit = False

        for char in password:
            if char in digits:
                password_has_digit = True
                break

        if not password_has_digit:
            return False

        password_has_lowercase = False

        for char in password:
            if char in ascii_lowercase:
                password_has_lowercase = True
                break

        if not password_has_lowercase:
            return False

        password_has_uppercase = False

        for char in password:
            if char in ascii_uppercase:
                password_has_uppercase = True
                break

        if not password_has_uppercase:
            return False

        return True

class Error:
    def write_log(password, name, email):
        fail = open('logifail.txt', 'w')

        if Validate.validate_password(password) == False:
            fail.write("\nViga parooliga")
        if Validate.validate_name(name) == False:
            fail.write("\nViga nimes")
        if Validate.validate_email(email) == False:
            fail.write("\nViga emailis")

        fail.close()

password = andmed.kasutaja1['password']
name = andmed.kasutaja1['name']
email = andmed.kasutaja1['email']

#Suur täht, number, suurem kui 6 ja väiksem kui 20
#password = input("Sisesta parool: ")
#name = input("Sisesta nimi: ")
#email = input("Sisesta email: ")

#print(Validate.validate_password("Tere1234"))

#print(Validate.validate_name("Kristjan"))
#print(Validate.validate_email("saaja@gmail.com"))
#if Validate.validate_password("Tere1234") and Validate.validate_name("Kristjan") and Validate.validate_email("saaja@gmail.com") == True
if Validate.validate_password(password) and Validate.validate_name(name) and Validate.validate_email(email) == True:
    mail = Mail()
    mail.sendMail(email, name)
else:
    print("Tekkis viga andmete sobivuses")
    Error.write_log(password, name, email)
