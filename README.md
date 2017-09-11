# Manns-Flight-Time-Calculator-Application
My Former Repository: Manns Flight Time Calculator Code made into an Application using SWING and SWINGX


## How it works:
This flight time calculator takes in the departure and arrive dates and times and formulates the flight time based on the time difference between the two countries. 

If you was to fly from London at 14:00 and arrive at Los Angeles at 17:25, The Flight Time Calculator will output 11 hours and 15 minutes based on the time difference of -8 from London.

## Limitations:
This flight time calculator only works for Direct Flights. This is defined as a flight from A to B with no stops or changeovers.

A direct flight can only occur betwene two days,  The day you take off, and the next day. If you input the arriv date as being, two days after you depart, the application will still consider this a two day flight, (Depart Day, Arriva Day) and thus will ignore the third day.

Aside from these usage Limitations, this code does not have any precaution measurements. If you fail to add an input, the code will not calculate and will most likely crash. This will be changed in future when I get the time to properly split this application into individual class files.

## The User Interface:
Here are some screenshots:
![Input Interface](https://media.discordapp.net/attachments/334011383140188161/356708641165803520/unknown.png?width=961&height=541)
![Output Interface](https://media.discordapp.net/attachments/334011383140188161/356708724037124127/unknown.png?width=960&height=542)

# Thanks for taking the time to check out this project!
You'll find many more interesting projects on my GitHub!
You can also follow me on Twitter, I post regular updates of programming projects I am working on in my free time!

Twitter: https://twitter.com/Ash_Logic

See you around! - _Mannjamin / The Mann_

### XSwing 1.6.5 External Jar File.
This was used to display the promt message within the JTextFields.
You can download the External Jar File here: http://www.java2s.com/Code/Jar/s/Downloadswingxall165jar.htm
