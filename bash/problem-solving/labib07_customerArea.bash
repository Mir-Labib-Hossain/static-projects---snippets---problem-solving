echo "Content of text file :"
while read p;
do	
	echo "$p"
	IFS=","
	read -a info <<< "$p"
	if [[ "${info[2]}" == "Dhanmondi" ]]
	then
		dhanmondiCustomerName+=$"${info[1]}\n"
	fi
done <customer.txt
printf "\nCustomers who stay in the Dhanmondi area :\n"
printf "$dhanmondiCustomerName"