echo -n "Enter a number : "
read number

prime=1

for(( i=2; i<number/2; i++ ))
do

if [[ $number%$i -eq 0 ]]
then
     prime=0
     break
fi
done

#if(($prime==0))
if [[ $prime -eq 0 ]]
then
    echo "$number is not prime number"
else
    echo "$number is prime number"
fi
