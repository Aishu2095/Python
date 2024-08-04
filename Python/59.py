def alphanumbers1(): 
    f1=open('alphanumbers.txt','r')
    list1=f1.readlines()
    list2=[]
    for i in list1:
        line1= i.replace('\n' , '')
        list2.append(line1)
    return(list2)

# open textfile read alphanumbers

def numbers1(): 
    f1=open('Number.txt','r')
    list1=f1.readlines()
    list2=[]
    for i in list1:
        line1= i.replace('\n' , '')
        list2.append(line1)
    return(list2)
# open textfile read numbers

def one2twenty(num1): 
    output1=''
    pos1=0
    alpha=alphanumbers1()
    numbers=numbers1()
    for i in range(0,len(numbers),1):
        if input1==numbers[i]:
            pos1=i
    output1=alpha[pos1]
    print(output1)

def twenty2hundred(num1):
    part1=(int(num1)//10)*10
    part2=num1[1:2]
    word2=one2twenty(str(part1))
    print(part1,part2)
    print(word2)
input1=input('enter a number: ')
if int(input1)<=20:
    result=one2twenty(input1)
elif int(input1)>=21:
    result=twenty2hundred(input1)
else:
    print('number is greater:' )

        
