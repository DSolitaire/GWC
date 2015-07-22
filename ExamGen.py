import random
Positions=["Assistant Archivist","Project Associate","Aviation Inspector","Chemical Plant Operator",
"Photographic Reproduction Technician","Regional Quality of Life Director","Executive Assistant",
"Memory Care Life Enrichment Coordinator", "Inside Sales Representative","Certified Montessori Teacher",
"Chief Executive Officer" ,"Nigerian Prince","Litigation Attorney"]
Items=["$100, 000","$200, 000" ,"$5,000,000", "40 barrels of gold","600 lbs of ancient tea",
"20 original Salvador Dali sketches","50 pieces ornate China","12 1700th Century Musket Gun sets"]
Adj=["acceptable","up to snuff","tip-top","deluxe","worthy","first-class","crack"
,"gnarly","terminally chill"]
Transfer=["transmit","surrender","budge","launch" ,"forward","dislocate","give up","transplant","drive","donate","drop","contaminate","broadcast","infect"]
AniMin=["Horses","Mices","Cows","Goats","Dolphins",
"Gold","Topaz","Quartz","Diamonds","Ruby","Sapphire","Silver","Xbox 1"]
name =["John Smith","Todd Rogers","Jeremy Meyers","Rachael Leigh","Amanda Hugnkiss","Yesha Alfor",
"Carly Tier","Lisa Carver","Jessica Croft","Kelly Carter","Riley Washington",
"Aftabe Weils","Lewa Relies","Obi Trollston","Mongo Nooberson"]
Amount=["$2,000","$5,000","$7,000","$1,200","$10,000","$13,000","$600","$7,500","$15,000",
"$20,200","$1,337","over $9,000"]
Percent=["10","2.3","45","13","6.3",".03","34.5","15.6","9.34","13.37","7.9","23","8.23"]

pos= random.choice(Positions)
its= random.choice(Items)
ad= random.choice(Adj)
tran= random.choice(Transfer)
ani= random.choice(AniMin)
na= random.choice(name)
amo= random.choice(Amount)
per= random.choice(Percent)

print("Hello,\n       I am ",na," and I am a ",pos,". I'm very pleased to be emailing you today. Recently I have came across ",its," and I unfortunately can not access this. You seem like a ",ad," person and I wants to make a deal with you. If you can ",tran,amo," to my Paypal account or sends I the equivalency in ",ani," me will gave you",per,"% of ",its,". Thanks you for you're time or considerations.\n \n Sincerely, \n \n",na,"\n",pos)


