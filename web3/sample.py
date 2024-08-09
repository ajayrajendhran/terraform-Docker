max=0
for i in range(2,100):
 for j in range(2,100):
   mul=i*j
   a=mul
   num=0
   while(mul>0):
     rem=mul%10
     num=num*10+rem
     mul=mul//10
   if a==num and max<a:
     max=a
print(max)