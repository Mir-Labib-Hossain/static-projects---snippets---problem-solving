echo -n "Enter price : "
read price
echo -n "Enter quantity : "
read quantity
percent=0
price=$(( price*quantity )) #total price
if [[ $quantity -eq 15 || $quantity -gt 15 ]]
then
    percent=20
elif [[ $quantity -eq 10 || $quantity -gt 10 ]]
then
    percent=15
elif [[ $quantity -eq 5 || $quantity -gt 5 ]]
then
    percent=10
fi
discount=$(( price*percent/100 ))
discountPrice=$(( price-discount ))
echo ""
echo "Total price = $price"
echo "Discount of $percent% = $discount"
echo "Discount price = $discountPrice"
