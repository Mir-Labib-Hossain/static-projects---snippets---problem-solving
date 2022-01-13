echo "Enter string : "
read str

echo "Total number of characters : ${#str}"

IFS=" "
read -a arr <<< "$str"
echo "Total number of words : ${#arr}"

IFS="\n"
read -a arr <<< "$str"
echo "Total number of lines : ${#arr[*]}"