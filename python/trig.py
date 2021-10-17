import math
import time


choose = input('sin/cos/tan>')

if choose == 'sin':
    sine = int(input('Type the number you want to sine>'))
    print('The answer is', math.sin(sine))

elif choose == 'cos':
    cosine = int(input('Type the number you want to cosine>'))
    print('The answer is', math.cos(cosine))

elif choose == 'tan':
    tangent = int(input('Type the number you want to tangent>'))
    print('The answer is', math.tan(tangent))

print('A countdown has been set because the program will close after the code is done.')


def countdown(time_sec):
    while time_sec:
        mins, secs = divmod(time_sec, 60)
        timeformat = '{:02d}:{:02d}'.format(mins, secs)
        print(timeformat, end='\r')
        time.sleep(1)
        time_sec -= 1

    print("Bye!")


countdown(10)
